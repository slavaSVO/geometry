package begin;

public class Vector {
    Point startPoz;
    Point endPoz;
    public Vector (Point startPoz, Point endPoz){
        this.startPoz = startPoz;
        this.endPoz = endPoz;
    }
    public double calcLength () {
        return Math.sqrt((this.endPoz.pozX - this.startPoz.pozX) * (this.endPoz.pozX - this.startPoz.pozX)
                + (this.endPoz.pozY - this.startPoz.pozY) * (this.endPoz.pozY - this.startPoz.pozY));
    }
}
