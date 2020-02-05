public class Sphere extends Shape implements Spatial {
 
	double radius;

	
	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public double area() {
		double r,a;
		r = getRadius();
		a = (4  * Math.PI * r * r);
		return a;
	}

	
	public double volume() {
		double r,v;
		r = getRadius();
		v =  ( 4  * Math.PI * r*r*r ) / 3;
		return v;
	}
}
