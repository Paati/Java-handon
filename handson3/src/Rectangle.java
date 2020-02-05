public class Rectangle extends Shape {

	double length;
	double width;
	
	public double getLength(){
		return length;
	}
	public void setLength(double length){
		this.length=length;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double area(){
		double a,b,c;
		
		a = getWidth();
		b = getLength();
		c = a*b;
		return c;
	}
	
	public double volume() {
		
		return -1;
	}
}
