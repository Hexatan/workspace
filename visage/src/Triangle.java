/**
 * Gestion d'un triangle du plan
 * @version 1.0
 * @author Ga�tan Duvaux
 *
 */
public class Triangle {
	private Point p1;
	private Point p2;
	private Point p3;
	
/**
 * Constructeur par d�faut
 */
	public Triangle() {
		this.p1 = new Point();
		this.p2 = new Point();
		this.p3 = new Point();
	}
	
	/**
	 * Constructeur recevant les points formant les segments
	 * @param p1 Premier point
	 * @param p2 Deuxi�me point
	 * @param p3 Troisi�me point
	 */
	public Triangle(Point p1,Point p2,Point p3) {
		this.setP1(p1);
		this.setP2(p2);
		this.setP3(p3);
	}
	
	/**
	 * Constructeur par copie
	 * @param t Triangle r�f�rent
	 */
	public Triangle(Triangle t) {
		this(t.getP1(),t.getP2(),t.getP3());
	}

	/**
	 * Retourne l'aire du triangle
	 * @return surface
	 */
	public double surface() {
		double a = p1.distance(p2);
		double b = p2.distance(p3);
		double c = p3.distance(p1);
		double p = (a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	
	/**
	 * Retourne le premier point
	 * @return p1 Premier point
	 */
	public Point getP1() {
		return p1;
	}
	
	/**
	 * Modifie le premier point
	 * @param p1 Premier point
	 */
	public void setP1(Point p1) {
		this.p1 = p1;
	}

	/**
	 * Retourne le deuxi�me point
	 * @return p2 Deuxi�me point
	 */
	public Point getP2() {
		return p2;
	}
	
	/**
	 * Modifie le deuxi�me point
	 * @param p2 Deuxi�me point
	 */
	public void setP2(Point p2) {
		this.p2 = p2;
	}

	/**
	 * Retourne le troisi�me point
	 * @return p3 Troisi�me point
	 */
	public Point getP3() {
		return p3;
	}

	/**
	 * Modifie le troisi�me point
	 * @param p3 Troisi�me point
	 */
	public void setP3(Point p3) {
		this.p3 = p3;
	}
	
	/**
	 * Modifie les sommet du triangle
	 * @param p1 Pemier point
	 * @param p2 Deuxi�me point
	 * @param p3 Troisi�me point
	 */
	public void setTriangle(Point p1,Point p2,Point p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	/**
	 * Effectue la symetrie du triangle par rapport aux axes
	 * @param abs axe des abscisses
	 * @param ord axe des ordonn�es
	 * @return Triangle
	 */
	public Triangle symetrie(boolean abs, boolean ord) {
		this.p1.symetrie(abs, ord);
		this.p2.symetrie(abs, ord);
		this.p3.symetrie(abs, ord);
		return new Triangle(p1,p2,p3);
	}
	/**
	 * Retourne le perim�tre du triangle
	 * @return perim�tre
	 */
	public double perimetre() {
		return p1.distance(p2)+p2.distance(p3)+p3.distance(p1);
	}
	
	/**
	 * Red�finie la m�thode toString 
	 */
	public String toString() {
		return this.p1 + " " + this.p2 + " " + this.p3;
	}
}
