package day3;

public class Rectangle {
	double length;
	double width;
	double area;
	public Rectangle(){
		
	}
	public Rectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}
	public Rectangle(double length) {
		this.length=length;
		width=1.0;
	}
	public void setLength(double length) {
		this.length=length;
	}
	public double getLength(double length) {
		return length;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public double getWidth(double width) {
		return width;
	}
	public double findArea() {
		return this.area=this.length*this.width;
	}
	public String toString() {
		return "Length:"+length+"\nwidth:"+width+"\nArea of Triangle:"+area;
	
	}
}
