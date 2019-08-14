package begin.Circle;

public class Circle {
    protected final double PI = 3.14159;
	protected double diameter;
	protected double radius;
	protected double area;
	protected double length;
	Circle (){};
//****************************************************************
//calculate radius 3 ways
	protected void calculateRadiusByDiameter (){
        this.radius = this.diameter / 2;
    }
	protected void calculateRadiusByLength (){
        this.radius = this.length / (2 * PI) ;
    }
	protected void calculateRadiusByArea (){
        this.radius = Math.sqrt(this.area / PI);
    }
//calculate diameter 3 ways
	protected void calculateDiameterByRadius () {
		this.diameter = this.radius * 2;
	}
	protected void calculateDiameterByLength  () {
		this.diameter = this.length / PI;
	}
	protected void calculateDiameterByArea  () {
		this.diameter = Math.sqrt((this.area * 4)/ PI);
	}
//calculate area 3 ways
	protected void calculateAreaByRadius (){
		this.area = PI *  this.radius * this.radius;
	}
	protected void calculateAreaByDiameter  (){
		this.area = (PI *  this.diameter * this.diameter) / 4;
	}
	protected void calculateAreaByLength  (){
		this.area = (this.length * this.length) / (4 * PI);
	}
//calculate length 3 ways
	protected void calculateLengthByRadius (){
		this.length = 2 * PI *  this.radius;
	}
	protected void calculateLengthByDiameter (){
		this.length = PI *  this.diameter;
	}
	protected void calculateLengthByArea (){
		this.length = 2 * PI *  Math.sqrt(this.area / PI);
	}
//****************************************************************
//get parameters
	public double getDiameter (){
		return this.diameter;
	}
	public double getRadius (){
		return this.radius;
	}
	public double getArea (){
		return this.area;
	}
	public double getLength (){
		return this.length;
	}	
}
