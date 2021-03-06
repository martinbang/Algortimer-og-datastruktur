package oblig2;

import java.util.Comparator;

public class CircleSorter_Color implements Comparator<Circle> {

	@Override
	public int compare(Circle c1, Circle c2) {
		
		String c1c = c1.getFarge();
		String c2c = c2.getFarge();
		
		return c1c.compareTo(c2c);
	}
}
