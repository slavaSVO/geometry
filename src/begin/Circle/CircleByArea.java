package begin.Circle;

public class CircleByArea extends Circle  {
    public CircleByArea(double area) {
        super.area = area;
        calculateRadiusByArea();
        calculateDiameterByArea();
        calculateLengthByArea();
    }
}
