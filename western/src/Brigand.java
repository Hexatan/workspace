public class Brigand extends Humain {
	private String look;
	private int nde;
	private float recompense;
	private boolean prison;
	
	public Brigand(String nom) {
		super(nom);
		this.look = "m�chant";
		this.nde = 0;
		this.recompense = 1000;
		this.prison = false;
		super.boissonP="Tord-Boyaux";
	}
	
	public void kidnap(Dame d){
		System.out.println("Ah Ah !" + d + " tu es mienne d�sormais");
		this.nde++;
		d.skidnap();
	}

	public String getLook() {
		return look;
	}

	public void setLook(String look) {
		this.look = look;
	}

	public int getNde() {
		return nde;
	}

	public void setNde(int nde) {
		this.nde = nde;
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
		+ super.parle("J'ai l'air " + this.look + " et j'ai d�j� kidnapp� " + this.nde + " dames" + "\n")
		+ super.parle("Ma t�te est mise � prix" + this.recompense);
	}
}
