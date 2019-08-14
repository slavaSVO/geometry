package begin.Circle;

public class CircleByLength extends Circle {
    public CircleByLength(double length) {
        super.length = length;
        calculateRadiusByLength();
        calculateDiameterByLength();
        calculateAreaByLength();
    }
}
