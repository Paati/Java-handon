public class Triangle extends Shape{

	double base;
	double height;
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	public double area() {
		double a,b,c;
		a=getBase();
		b=getHeight();
		c=(a*b*0.5);
		return c;
	}
	
	public double volume() {
		
		return -1;
	}
	
	
}
