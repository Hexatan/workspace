public class Ordinateur {
	private Ecran ecran;
	private Processeur processeur;
	
	public Ordinateur() {
		this.ecran = new Ecran("",0);
		this.processeur = new Processeur("",0);
	}
	
	public Ordinateur(Ecran e,Processeur p) {
		this.ecran = e;
		this.processeur = p;
	}
	
	public double getFrequence() {
		return this.processeur.getFrequence();
	}
	
	public String getMarqueEcran() {
		return this.ecran.getMarque();
	}
	
	public String getMarqueProcesseur() {
		return this.processeur.getMarque();
	}
	
	public double getTailleEcran() {
		return this.ecran.getTaille();
	}
	
	public void init() {
		this.ecran.init();
		this.processeur.init();
	}
	
	public String toString() {
		return "Processeur : \n" + this.processeur.toString() + "\nEcran : \n" + this.ecran.toString();
	}
}
