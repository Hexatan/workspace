public class Ecran {
	private String marque;
	private double taille;
	
	public Ecran() {
		this.marque = "";
		this.taille = 0;
	}
	public Ecran(String m, double t) {
		this.marque = m;
		this.taille = t;
	}
	public String getMarque() {
		return marque;
	}
	public double getTaille() {
		return taille;
	}
	public void init() {
		this.taille = Lire.jdouble("Saisir la taille de l'écran");
		this.marque = Lire.jString("Saisir la marque de l'écran");
	}
	public String toString() {
		return "Marque : " + marque + "\nTaille : " + taille;
	}
}
