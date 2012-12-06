public class Cowboy extends Humain{
	private int popularite;
	private String adj;
	
	public Cowboy(String nom){
		super(nom);
		this.popularite = 0;
		this.adj = "Vaillant";
		super.boissonP = "Whisky";
	}
	
	public void tire(Brigand d){
		parle("Le " + this.adj + " " + this.nom + " sur " + d.nom + " . PAN!");
		parle("Prend ça, sale rascal !");
	}
	
	public void libere(Dame d){
		parle("Je vous libère " + d.nom);
		this.popularite++;
		d.sliberer(this);
	}

	public int getPopularite() {
		return popularite;
	}
	
	public void setPopularite(int popularite) {
		this.popularite = popularite;
	}

	public String getAdj() {
		return adj;
	}

	public void setAdj(String adj) {
		this.adj = adj;
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public String presente(){
		return super.presente() + " on parle de moi comme du " + this.adj + " et j'ai une popularité de" + this.popularite;
	}
}
