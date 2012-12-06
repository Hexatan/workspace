public class Dame extends Humain{
	private String couleur;
	private boolean libre;
	
	public  Dame(String nom){
		super(nom);
		this.couleur = "blanche";
		this.libre = true;
		super.boissonP="lait";
	}
	
	public void skidnap(){
		parle("Ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
		this.libre = false;
	}

	public void sliberer(Cowboy c){
		parle("Merci" + c.getNom());
		this.libre = true;
	}
	
	public void changerrobe(String c){
		this.couleur = c;
		parle("Regardez ma nouvelle robe " + this.couleur);
	}
	
	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public boolean isLibre() {
		return libre;
	}

	public void setLibre(boolean libre) {
		this.libre = libre;
	}
	
	public String getNom(){
		return "Miss" + this.nom;
	}
	
	public String presente(){
		return super.presente() + " j'ai une belle robe " + this.couleur;
	}
}
