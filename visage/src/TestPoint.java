
public class TestPoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(1,1);
		p.symetrie(true, false);
		System.out.println("x : " + p.getX());
		System.out.println("y : " + p.getY() + "\n");
		p.setX(1);
		p.setY(1);
		p.symetrie(false, true);
		System.out.println("x : " + p.getX());
		System.out.println("y : " + p.getY() + "\n");
		p.setX(1);
		p.setY(1);
		p.symetrie(true, true);
		System.out.println("x : " + p.getX());
		System.out.println("y : " + p.getY() + "\n");
		p.setX(1);
		p.setY(1);
		p.symetrie(false, false);
		System.out.println("x : " + p.getX());
		System.out.println("y : " + p.getY() + "\n");
	}

}
