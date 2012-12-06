public class CommunicationInter extends Communication {
	private  String paysappelle;
	private float prix_seconde_pays;
	
	public CommunicationInter(){
		super();
	}
	
	public CommunicationInter(String p, float prix,float d, String num) {
		super(d,num);
		this.paysappelle = p;
		this.prix_seconde_pays=prix;
	}
	
	public CommunicationInter(CommunicationInter c) {
		this(c.paysappelle,c.prix_seconde_pays,c.getDuree(),c.getNumero());
	}

	/**
	 * @return the paysappelle
	 */
	public String getPaysappelle() {
		return paysappelle;
	}

	/**
	 * @return the prix_seconde_pays
	 */
	public float getPrix_seconde_pays() {
		return prix_seconde_pays;
	}
	
	public void init() {
		super.init();
	}
	
	public String toString() {
		return super.toString() + this.paysappelle + this.prix_seconde_pays;
	}
}
