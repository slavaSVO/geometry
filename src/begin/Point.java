package begin;

public class Point {
    protected double pozX;
    protected double pozY;
    public Point (){};
    public Point (double pozX, double pozY){
        this.pozX = pozX;
        this.pozY = pozY;
    }
    public double getPozX (){
        return this.pozX;
    }
    public double getPozY (){
        return this.pozY;
    }    
}