public class Etudiant extends Personne {
	
	private String numeroEtudiant;
	private String faculte;
	
	/**
	 * Constructeur par d�faut
	 */
	public Etudiant() {}
	
	/**
	 * Constructeur par copie
	 * @param e �tudiant que l'on veut copier
	 */
	public Etudiant(Etudiant e) {
		super(e);
		this.faculte=e.faculte;
		this.numeroEtudiant=e.numeroEtudiant;		
	}
	
	/**
	 * Constructeur avec nom,age,numero �tudiant,une fac
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
	 * Red�finission de equals
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
	 * Retourne le num�ro �tudiant
	 * @return numeroEtudiant de l'instance courante
	 */
	public String getNumeroEtudiant() {
		return numeroEtudiant;
	}
	
	/**
	 * Retourne facult�
	 * @return facult� de l'instance courante
	 */
	public String getFaculte() {
		return faculte;
	}
	
	/**
	 * Initialise int�ractivement l'instance courante
	 */
	public void init() {
		super.init();
		this.faculte = Lire.jstring("Fac ?");
		this.numeroEtudiant=Lire.jstring("numero ?");
	}
	
	/**
	 * Red�finission de toString pour la classe 
	 */
	public String toString() {
		return super.toString() + " numeroEtudiant=" + numeroEtudiant
				+ ", faculte=" + faculte;
	}
}
