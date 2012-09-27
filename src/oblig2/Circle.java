package oblig2;

public class Circle {
	
	private String farge;
	private double radius;
	
	public Circle(String farge, double radius){
		
		this.farge = farge;
		this.radius = radius;
		
	}
	

	public String getFarge() {
		return farge;
	}

	public void setFarge(String farge) {
		this.farge = farge;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	/*@Override
	public String toString() {
		return "Circle [farge=" + farge + ", radius=" + radius + "]";
	}*/
	
	

}
