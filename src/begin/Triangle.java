package begin;

public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Vector sideAB;
    private Vector sideBC;
    private Vector sideCA;

    public Triangle(Point a, Point b, Point c) {
        this.pointA = a;
        this.pointB = b;
        this.pointC = c;
        sideAB = new Vector(this.pointA, this.pointB);
        sideBC = new Vector(this.pointB, this.pointC);
        sideCA = new Vector(this.pointC, this.pointA);
    }

    public double calcPerimeter() {
        double lengthAB = this.sideAB.calcLength();
        double lengthBC = this.sideBC.calcLength();
        double lengthCA = this.sideCA.calcLength();
        return lengthAB + lengthBC + lengthCA;
    }

    private double calcP() {
        //p - полупериметер трикутника
        return calcPerimeter() / 2;
    }

    public double calcArea() {
        double p = calcP(); //p - полупериметер трикутника
        double lengthAB = this.sideAB.calcLength();
        double lengthBC = this.sideBC.calcLength();
        double lengthCA = this.sideCA.calcLength();
        return Math.sqrt(p * (p - lengthAB) * (p - lengthBC) * (p - lengthCA));
    }

    public boolean isPointInTriangle(Point pointP) {
        boolean Result = false;
        double m, l; // мю и лямбда
        //Здвигаємо трикутник так щоб точка А знаходилася в початок координат (0,0), вiд координал B, C та P вiднiмаэмо координати точки А
        double Bx = this.pointB.pozX - this.pointA.pozX;
        double By = this.pointB.pozY - this.pointA.pozY;
        double Cx = this.pointC.pozX - this.pointA.pozX;
        double Cy = this.pointC.pozY - this.pointA.pozY;
        double Px = pointP.pozX - this.pointA.pozX;
        double Py = pointP.pozY - this.pointA.pozY;
        m = (Px * By - Bx * Py) / (Cx * By - Bx  * Cy);
        if ((m >= 0.0) && (m <= 1.0)) {
            l = (Px - m * Cx) / Bx;
            if ((l >= 0.0) && ((m + l) <= 1.0))
                Result = true;
        }
        return Result;
    }
    private boolean isRectangularA (double catechism1, double catechism2, double hypotenuse, double tolerance){
        double g = catechism1 * catechism1 + catechism2 * catechism2 - hypotenuse * hypotenuse;
        if (g < tolerance &&  g < tolerance * -1)
            return true;
        else
            return false;
    }
    public boolean isRectangular (double tolerance){
        double ab = this.sideAB.calcLength();
        double bc = this.sideBC.calcLength();
        double ca = this.sideCA.calcLength();
        boolean a = isRectangularA (ab, bc, ca, tolerance);
        boolean b = isRectangularA (bc, ca, ab, tolerance);
        boolean c = isRectangularA (ca, ab, bc, tolerance);
        if (a || b || c)
            return true;
        else
            return  false;
    }

}
