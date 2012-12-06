
public class TestSegment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point p1 = new Point(2,6);
		Point p2 = new Point(4,5);
		Segment s1 = new Segment(2,6,4,5);
		System.out.println(s1.longueur());
		System.out.println(p1.distance(p2));
		s1.symetrie(true,true);
		System.out.println(s1.getP1().getX());
		System.out.println(s1.getP1().getY());

	}

}
