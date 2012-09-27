package oblig2;

public class CircleSort_Area implements Comparable<Circle> {

	
	@Override
	public int compare(Circle c1, Circle c2) {
		double c1a = ((Circle) c1).getRadius();
		double c2a = ((Circle) c2).getRadius();

		if (c1a > c2a)
			return -1;

		if (c1a == c2a)
			return 0;

		// if (c1a < c2a)
		return 1;
	}

}
