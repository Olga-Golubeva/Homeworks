
public class Circle {
	private double radius;
	
	public Circle() {
		radius = 1.0;
	}
	
	public Circle(double x) {
		radius = x;
		
	}
	 public double getRadius(){
		 return radius;
	 }
	
	 public double getArea() {
		 return Math.PI*radius*radius;
		 
	 }

}
