public class Humain {
	protected String nom;
	protected String boissonP;
	
	public Humain(String nom){
		this.nom = nom;
		this.boissonP = "eau";
	}
	
	public String parle(String texte){
		return "(" + this.nom + ") " + "- " + texte;
	}
	
	public String presente(){
		return parle("Bonjour je m'appelle :" + this.nom + " ma boisson préféré est :" + this.boissonP);
	}
	
	public String boire(){
		return parle("Ah! un bon verre de " + this.boissonP + "! GLOUPS !");
	}

	public String getNom() {
		return nom;
	}
	
	public String getBoissonP() {
		return boissonP;
	}
}
