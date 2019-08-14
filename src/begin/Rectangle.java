package begin;

public class Rectangle {
    protected double lengthSideA;
    protected double lengthSideB;

    public Rectangle() {
    }

    ;

    public Rectangle(double lengthSideA, double lengthSideB) {
        if (lengthSideA < 0.0 || lengthSideB < 0.0)
            throw new RuntimeException("Error. Rectangle side < 0.");
        this.lengthSideA = lengthSideA;
        this.lengthSideB = lengthSideB;
    }

    public double getArea() {
        return this.lengthSideA * this.lengthSideB;
    }

    public double getPerimeter() {
        return this.lengthSideA * 2 + this.lengthSideB * 2;
    }
}
