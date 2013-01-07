public class Salarie extends Personne {
	
	private String NumeroSecu;
	private String Employeur;
	
	/**
	 * Consctructeur vide
	 */
	public Salarie() {}
	
	/**
	 * Constrcuteur par copie
	 * @param s
	 */
	public Salarie(Salarie s) {
		super(s);
		this.Employeur=s.Employeur;
		this.NumeroSecu=s.NumeroSecu;
	}
	
	/**
	 * Constructeur avec nom,age,num�ro de s�cu,employeur
	 * @param unNom nom de l'instance
	 * @param unAge age de l'instance
	 * @param unNumeroSecu num�ro de s�cu de l'instance
	 * @param unEmployeur Employeur de l'instance
	 */
	public Salarie(String unNom,int unAge,String unNumeroSecu, String unEmployeur) {
		super(unNom,unAge);
		this.Employeur = unEmployeur;
		this.NumeroSecu = unNumeroSecu;
	}
	
	/**
	 * Red�finission de la m�thode equals
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
	 * Retourne num�ro de s�cu
	 * @return numsecu de l'instance
	 */
	public String getNumeroSecu() {
		return NumeroSecu;
	}
	
	/**
	 * Retourne Employeur
	 * @return employeur de l'instance
	 */
	public String getEmployeur() {
		return Employeur;
	}
	
	/**
	 * Initialise une instance de Salarie int�ractivement
	 */
	public void init() {
		super.init();
		this.Employeur=Lire.jString("Employeur ?");
		this.NumeroSecu=Lire.jstring("NumeroSecu ?");
	}
	
	/**
	 * Red�finission de la m�thode toString
	 */
	public String toString() {
		return super.toString() + " NumeroSecu=" + NumeroSecu
				+ ", Employeur=" + Employeur;
	}
	
}