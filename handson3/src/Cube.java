
public class Cube extends Shape{
 
	double length;
	double width;
	double height;
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double area() {
		
		double a,b,c,d;
		a=getLength();
		b=getWidth();
		c=getHeight();
				
		d = 2 * a * b + 2 * a * c + 2* b * c;
		
		return d;
	}

	public double volume() {
		double a,b,c,d;
		a=getLength();
		b=getWidth();
		c=getHeight();
		d=a*b*c;
		
		return d;
	}
	
}
