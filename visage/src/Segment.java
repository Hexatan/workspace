/**
 * Gestion d'un segment du plan
 * @version 1.0
 * @author Ga�tan Duvaux
 *
 */
public class Segment {
	private Point p1;
	private Point p2;
	
	/**
	 * Constructeur par d�faut
	 */
	public Segment() {
		this.p1 = new Point();
		this.p2 = new Point();
	}
	
	/**
	 * Constructeur recevant les coordonn�es des points du segment
	 * @param x1 abscisse du premier point
	 * @param y1 ordonn�e du premier point
	 * @param x2 abscisse du deuxi�me point
	 * @param y2 ordonn�e du deuxi�me point
	 */
	public Segment(float x1, float y1, float x2, float y2) {
		this.p1 = new Point(x1,y1);
		this.p2 = new Point(x2,y2);
	}
	
	/**
	 * Constructeur recevant les points du segment
	 * @param p1
	 * @param p2
	 */
	public Segment(Point p1,Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	/**
	 * Retourne le premier point
	 * @return p1
	 */
	public Point getP1() {
		return this.p1;
	}

	/**
	 * Modifie les coordonn�e du premier point
	 * @param x abscisse du premier point
	 * @param y ordonn�e du premier point
	 */
	public void setP1(float x, float y) {
		this.p1 = new Point(x,y);
	}
	
	/**
	 * Modifie le premier point par un autre point
	 * @param p1 point devenant le premier point du segment
	 */
	public void setP1(Point p1) {
		this.p1 = p1;
	}
	
	/**
	 * Retourne le premier point 
	 * @return p2
	 */
	public Point getP2() {
		return this.p2;
	}
	
	/**
	 * Modifie les coordonn�e du deuxi�me point
	 * @param x abscisse du deuxi�me point
	 * @param y ordonn�e du deuxi�me point
	 */
	public void setP2(float x,float y) {
		this.p2 = new Point(x,y);
	}
	
	/**
	 * Modifie le deuxi�me point par un autre point
	 * @param p2 point devenant le deuxi�me point du segment
	 */
	public void setP2(Point p2) {
		this.p2 = p2;
	}
	
	/**
	 * Retourne la longueur du segment
	 * @return longeur
	 */
	public double longueur() {
		return this.p1.distance(p2);
	}
	
	/**
	 * Effectue la symetrie du segment par rapport aux axe.
	 * @param abs axe des abscisses
	 * @param ord axe des ordonn�es
	 */
	public void symetrie(boolean abs,boolean ord) {
		this.p1.symetrie(abs, ord);
		this.p2.symetrie(abs, ord);
	}
}