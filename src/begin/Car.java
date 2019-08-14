package begin;

public class Car {
    private double startPoz;
    private double speed;//скорость для удобства задается в км/ч

    public Car(double startPoz, double speed) {
        this.startPoz = startPoz;
        this.speed = speed;
    }

    double convertSpeed(double speed) { //km/h to m/sec
        return speed * 1000 / 3600; //1 km have 1000m, 1h have 3600sec
    }

    public double getCurrentPosition(int timeAfterStartInSec) {
        return convertSpeed(this.speed) * timeAfterStartInSec + this.startPoz;
    }
}
