public class Salarie extends Personne {
	
	private String NumeroSecu;
	private String Employeur;
	
	/**
	 * Constructeur vide
	 */
	public Salarie() {}
	
	/**
	 * Constructeur par copie
	 * @param s salarié que l'on veut copier
	 */
	public Salarie(Salarie s) {
		super(s);
		this.Employeur=s.Employeur;
		this.NumeroSecu=s.NumeroSecu;
	}
	
	/**
	 * Constructeur 
	 * @param unNom
	 * @param unAge
	 * @param unNumeroSecu
	 * @param unEmployeur
	 */
	public Salarie(String unNom,int unAge,String unNumeroSecu, String unEmployeur) {
		super(unNom,unAge);
		this.Employeur = unEmployeur;
		this.NumeroSecu = unNumeroSecu;
	}
	
	/**
	 * 
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Salarie))
			return false;
		Salarie other = (Salarie) obj;
		if (Employeur == null) {
			if (other.Employeur != null)
				return false;
		} else if (!Employeur.equals(other.Employeur))
			return false;
		if (NumeroSecu == null) {
			if (other.NumeroSecu != null)
				return false;
		} else if (!NumeroSecu.equals(other.NumeroSecu))
			return false;
		return true;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getNumeroSecu() {
		return NumeroSecu;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getEmployeur() {
		return Employeur;
	}
	
	/**
	 * 
	 */
	public void init() {
		super.init();
		this.Employeur=Lire.jString("Employeur ?");
		this.NumeroSecu=Lire.jstring("NumeroSecu ?");
	}
	
	/**
	 * 
	 */
	public String toString() {
		return super.toString() + " NumeroSecu=" + NumeroSecu
				+ ", Employeur=" + Employeur;
	}
	
}