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

	
	

	public double getRadius() {
		return Math.PI * Math.pow(radius, 2);
	}

	


	@Override
	public String toString() {
		return "Circle [farge=" + farge + ", radius=" + radius + "]";
	}
	
	

}
