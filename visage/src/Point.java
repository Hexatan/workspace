/**
 * Gestion d'un point du plan
 * @version 1.0
 * @author Gaëtan Duvaux
 *
 */
public class Point {
	private float x;
	private float y;
	
	/**
	 * Constructeur par défaut
	 */
	public Point() {
		this.setX(0);
		this.setY(0);
	}
	
	/**
	 * Constructeur recevant les coordonnées du point
	 * @param x abscisse du point
	 * @param y ordonnée du point
	 */
	public Point(float x, float y) {
		this.setX(x);
		this.setY(y);
	}
	/**
	 * Constructeur par copie
	 * @param p Point réferent
	 */
	public Point(Point p) {
		this(p.getX(),p.getY());
	}
	
	/**
	 * Retourne l'abscisse du point
	 * @return abcisse du point
	 */
	public float getX() {
		return x;
	}
	
	/**
	 * Modifie l'abscisse du point
	 * @param x abscisse du point
	 */
	public void setX(float x) {
		this.x = x;
	}
	
	/**
	 * Retourne l'ordonnée du point
	 * @return abscisse du point
	 */
	public float getY() {
		return y;
	}
	
	/**
	 * Modifie l'ordonnée du point
	 * @param y ordonnée du point
	 */
	public void setY(float y) {
		this.y = y;
	}

	/**
	 * Déplace le point
	 * @param depX Déplacement en x
	 * @param depY Déplacement en y
	 */
	public void translate(float depX, float depY) {
		this.setX(this.getX() + depX);
		this.setY(this.getY() + depY);
	}
	
	/**
	 * Retourne le distance entre le point et l'origine
	 * @return distance
	 */
	public double distance() {
		float dX = Math.abs(0 - this.getX());
		float dY = Math.abs(0 - this.getY());
		double distance = Math.sqrt(Math.pow(dX, 2) + Math.pow(dY, 2));
		return distance;
	}
	
	/**
	 * Retourne la distance entre un point et un autre point
	 * @param ap Point de comparaison
	 * @return distance
	 */
	public double distance(Point ap) {
		float dX = Math.abs(ap.getX() - this.getX());
		float dY = Math.abs(ap.getY() - this.getY());
		double distance = Math.sqrt(Math.pow(dX, 2) + Math.pow(dY, 2));
		return distance;
	}
	
	/**
	 * Effectue la symetrie du point par rapport aux axes du plan
	 * @param abs axe des abscisses
	 * @param ord axe des ordonnées
	 */
	public void symetrie(boolean abs,boolean ord) {
		if(abs) {
			this.setY(-this.getY());
			if(ord) {
				this.setX(-this.getX());
			}
		}
		else if(ord) {
			this.setX(-this.getX());
			if(abs) {
				this.setY(-this.getY());
			}
		}
	}
	
	/**
	 * Effectue la symetrie du point part rapport à un point
	 * @param p Point central de la symetrie
	 */
	public void symetrie(Point p) {
		if(this.getX() > p.getX()) {	
			this.setX(p.getX()-(Math.abs(p.getX() - this.getX())));
			
			if(this.getY() > p.getY()) {
				this.setY(p.getY()-(Math.abs(p.getY() - this.getY())));
			}
			
			else if(this.getY() < p.getY()) {
				this.setY(p.getY()+(Math.abs(p.getY() - this.getY())));
			}
			
			else {
				this.setY(getY());
			}
			
		}
		else if(this.getX() < p.getX()) {
			this.setX(p.getX()+(Math.abs(p.getX() - this.getX())));
			
			if(this.getY() > p.getY()) {
				this.setY(p.getY()-(Math.abs(p.getY() - this.getY())));
			}
			
			else if(this.getY() < p.getY()) {
				this.setY(p.getY()+(Math.abs(p.getY() - this.getY())));
			}
			
			else {
				this.setY(getY());
			}
			
		}
		else {
			this.setX(getX());
		}
	}
	
	/**
	 * Redéfinie la méthode toString
	 */
	public String toString() {
		return "(" + this.getX() + ";" + this.getY() + ")";
	}
}
