package begin;

public class Rectangle {
    private double rectangleSideA;
    private double rectangleSideB;

    Rectangle(double rectangleSideA, double rectangleSideB) {
        if (rectangleSideA < 0.0 || rectangleSideB < 0.0)
            throw new RuntimeException("Error. Rectangle side < 0.");
        this.rectangleSideA = rectangleSideA;
        this.rectangleSideB = rectangleSideB;
    }

    public double getArea() {
        return this.rectangleSideA * this.rectangleSideB;
    }

    public double getPerimeter() {
        return this.rectangleSideA * 2 + this.rectangleSideB * 2;
    }
}
