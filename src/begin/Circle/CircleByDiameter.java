package begin.Circle;

public class CircleByDiameter extends Circle {
    public CircleByDiameter(double diameter) {
        super.diameter = diameter;
        calculateRadiusByDiameter();
        calculateLengthByDiameter();
        calculateAreaByDiameter();
    }
}
