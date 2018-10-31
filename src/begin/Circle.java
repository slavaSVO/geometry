package begin;

public class Circle {
    private final double PI = 3.14;
    private double diameter;
    private double radius;
    private double area;
    private double length;
    public void getRadiusByDiameter (){
        this.radius = diameter / 2;
    }
    public void getRadiusByLength (){
        this.radius = this.length / (2 * PI) ;
    }
    public void getRadiusByArea (){
        this.radius = ;
    }
}
