package begin.Circle;

public class CircleByRadius extends Circle {
    public CircleByRadius(double radius) {
        super.radius = radius;
        calculateDiameterByRadius();
        calculateLengthByRadius();
        calculateAreaByRadius();
    }
}
