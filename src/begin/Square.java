package begin;

public class Square extends Rectangle {
    private double sideSize;

    Square (double sideSize) {
        if (sideSize < 0.0)
            throw new RuntimeException("Error. Square side < 0.");
        this.sideSize = sideSize;
    }

    public double getArea() {
        return this.sideSize * this.sideSize;
    }

    public double getPerimeter() {
        return this.sideSize * 4;
    }
}
