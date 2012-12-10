public class Etudiant extends Personne {
	
	private String numeroEtudiant;
	private String faculte;
	
	/**
	 * Constructeur par défaut
	 */
	public Etudiant() {}
	
	/**
	 * Constructeur par copie
	 * @param e étudiant que l'on veut copier
	 */
	public Etudiant(Etudiant e) {
		super(e);
		this.faculte=e.faculte;
		this.numeroEtudiant=e.numeroEtudiant;		
	}
	
	/**
	 * Constructeur avec nom,age,numero étudiant,une fac
	 * @param unNom
	 * @param unAge
	 * @param unNumeroEtudiant
	 * @param uneFac
	 */
	public Etudiant(String unNom,int unAge, String unNumeroEtudiant, String uneFac) {
		super(unNom,unAge);
		this.faculte=uneFac;
		this.numeroEtudiant=unNumeroEtudiant;
	}
	
	/**
	 * Redéfinission de equals
	 */
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!super.equals(o))
			return false;
		if (getClass() != o.getClass())
			return false;
		Etudiant other = (Etudiant) o;
		if (faculte == null) {
			if (other.faculte != null)
				return false;
		} else if (!faculte.equals(other.faculte))
			return false;
		if (numeroEtudiant == null) {
			if (other.numeroEtudiant != null)
				return false;
		} else if (!numeroEtudiant.equals(other.numeroEtudiant))
			return false;
		return true;
	}
	
	/**
	 * Retourne le numéro étudiant
	 * @return numeroEtudiant de l'instance courante
	 */
	public String getNumeroEtudiant() {
		return numeroEtudiant;
	}
	
	/**
	 * Retourne faculté
	 * @return faculté de l'instance courante
	 */
	public String getFaculte() {
		return faculte;
	}
	
	/**
	 * Initialise intéractivement l'instance courante
	 */
	public void init() {
		super.init();
		this.faculte = Lire.jstring("Fac ?");
		this.numeroEtudiant=Lire.jstring("numero ?");
	}
	
	/**
	 * Redéfinission de toString pour la classe 
	 */
	public String toString() {
		return super.toString() + " numeroEtudiant=" + numeroEtudiant
				+ ", faculte=" + faculte;
	}
}
