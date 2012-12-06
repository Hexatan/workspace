/**
 * Gestion d'un point du plan
 * @version 1.0
 * @author Ga�tan Duvaux
 *
 */
public class Point {
	private float x;
	private float y;
	
	/**
	 * Constructeur par d�faut
	 */
	public Point() {
		this.setX(0);
		this.setY(0);
	}
	
	/**
	 * Constructeur recevant les coordonn�es du point
	 * @param x abscisse du point
	 * @param y ordonn�e du point
	 */
	public Point(float x, float y) {
		this.setX(x);
		this.setY(y);
	}
	/**
	 * Constructeur par copie
	 * @param p Point r�ferent
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
	 * Retourne l'ordonn�e du point
	 * @return abscisse du point
	 */
	public float getY() {
		return y;
	}
	
	/**
	 * Modifie l'ordonn�e du point
	 * @param y ordonn�e du point
	 */
	public void setY(float y) {
		this.y = y;
	}

	/**
	 * D�place le point
	 * @param depX D�placement en x
	 * @param depY D�placement en y
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
	 * @param ord axe des ordonn�es
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
	 * Effectue la symetrie du point part rapport � un point
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
	 * Red�finie la m�thode toString
	 */
	public String toString() {
		return "(" + this.getX() + ";" + this.getY() + ")";
	}
}
