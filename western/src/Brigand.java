public class Brigand extends Humain {
	private String look;
	private int nde;
	private float recompense;
	private boolean prison;
	
	public Brigand(String nom) {
		super(nom);
		this.look = "méchant";
		this.nde = 0;
		this.recompense = 1000;
		this.prison = false;
		super.boissonP="Tord-Boyaux";
	}
	
	public void kidnap(Dame d){
		System.out.println(parle("Ah Ah !" + d + " tu es mienne désormais"));
		this.nde++;
		d.skidnap();
	}

	public String getLook() {
		return look;
	}

	public int getNde() {
		return nde;
	}
	
	public float getRecompense() {
		return recompense;
	}
	
	public void setRecompense(float recompense) {
		this.recompense = recompense;
	}

	public boolean isPrison() {
		return prison;
	}
	
	public void setPrison(boolean prison) {
		this.prison = prison;
	}
	
	public String getNom(){
		return this.nom + " le " + this.look;
	}
	
	public String presente(){
		return super.presente() + ", mon look est : " + this.look + "\n"
		+ super.parle("J'ai l'air " + this.look + " et j'ai déjà kidnappé " + this.nde + " dames" + "\n")
		+ super.parle("Ma tête est mise à prix" + this.recompense);
	}
}
