/**
 * Gestion d'un cercle du plan
 * @version 1.0
 * @author Gaëtan Duvaux
 *
 */
public class Cercle {
	private float rayon;
	private Point centre;
	private final double PI = Math.PI;
	
	/**
	 * Constructeur par défaut
	 */
	public Cercle() {
		this.rayon = 0;
		this.centre = new Point();
	}
	/**
	 * Constructeur recevant le rayon du cercle
	 * @param r rayon du cercle
	 */
	public Cercle(float r) {
		this.rayon = r;
		this.centre = new Point();
	}
	
	/**
	 * Constructeur recevant le rayon et les coordonnées du centre
	 * @param r rayon du cercle
	 * @param x abscisse du centre
	 * @param y ordonnée du centre
	 */
	public Cercle(float r, float x,float y) {
		this.rayon = r;
		Point c = new Point(x,y);
		this.centre = c;
	}
	
	/**
	 * Constructeur en donant le rayon et le point centre du cercle
	 * @param c point centre
	 * @param r rayon du cercle
	 */
	public Cercle(Point c, float r) {
		this.rayon = r;
		this.centre = c;
	}
	
	/**
	 * Retourne le rayon du cercle
	 * @return rayon du cercle
	 */
	public float getRayon() {
		return rayon;
	}
	
	/**
	 * Modifie le rayon du cercle
	 * @param rayon du cercle
	 */
	public void setRayon(float rayon) {
		this.rayon = rayon;
	}
	
	/**
	 * Retourne le point étant le centre du cercle
	 * @return point centre
	 */
	public Point getCentre() {
		return centre;
	}
	
	/**
	 * Modifie les coordonées du centre du cercle
	 * @param x abscisse du centre
	 * @param y ordonnée du centre
	 */
	public void setCentre(float x,float y) {
		this.centre = new Point(x,y);
	}
	
	/**
	 * Modifie le centre par un autre point
	 * @param c point devenant le centre du crcle
	 */
	public void setCentre(Point c) {
		this.centre = c;
	}
	
	/**
	 * Retourne le perimètre du cercle
	 * @return perimetre du cercle
	 */
	public double perimetre() {
		return 2*PI;
	}
	
	/**
	 * Retourne l'aire du cercle
	 * @return surface du cercle
	 */
	public double surface() {
		return PI*Math.pow(rayon, 2);
	}
	
	/**
	 * Translation du centre du cercle
	 * @param depX déplacement sur l'axe des abscisses
	 * @param depY dépalcement sur l'axe des ordonnées
	 */
	public void translate(float depX, float depY) {
		centre.translate(depX,depY);
	}
	
	/**
	 * Retourne le diamètre du cercle.
	 * @return diamètre du cercle.
	 */
	public double diametre() {
		return 2*rayon;
	}
	
	/**
	 * Symetrie du centre par rapport aux axe du plan
	 * @param abs modification de l'abscisse
	 * @param ord modification de l'ordonnée
	 */
	public void symetrie(boolean abs, boolean ord) {
		this.centre.symetrie(abs, ord);
	}
}
