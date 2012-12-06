public class Processeur {
	private String marque;
	private double frequence;
	
	public Processeur() {
		this.marque = "";
		this.frequence = 0;
	}
	
	public Processeur(String m,double f) {
		this.marque = m;
		this.frequence = f;
	}

	public String getMarque() {
		return marque;
	}
	
	public double getFrequence() {
		return frequence;
	}
	
	public String toString() {
		return "Marque : " + this.marque + "\nFréquence" + frequence + "\n" ;
	}
	
	public void init() {
		this.frequence = Lire.jdouble("Saisir la fréquence du processeur");
		this.marque = Lire.jString("Saisir la marque du processeur");
	}
}
