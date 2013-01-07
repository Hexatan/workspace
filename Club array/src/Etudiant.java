/**
 * 
 * @author gaetan duvaux
 *
 */
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
	 * @param unNom nom de l'instance courante.
	 * @param unAge age de l'instance courante.
	 * @param unNumeroEtudiant num�ro �tudiant de l'insatance courante.
	 * @param uneFac facult� de l'instance courante.
	 */
	public Etudiant(String unNom,int unAge, String unNumeroEtudiant, String uneFac) {
		super(unNom,unAge);
		this.faculte=uneFac;
		this.numeroEtudiant=unNumeroEtudiant;
	}
	
	/**
	 * Red�finition de equals
	 */
	public boolean equals(Object o) {
		super.equals(o);
		Etudiant other = (Etudiant) o;
		if (faculte == null) {
			if (other.faculte != null) return false;
		} else if (!faculte.equals(other.faculte)) return false;
		if (numeroEtudiant == null) {
			if (other.numeroEtudiant != null) return false;
		} else if (!numeroEtudiant.equals(other.numeroEtudiant)) return false;
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
		return super.toString() + "\nnumeroEtudiant=" + numeroEtudiant
				+ "\nfaculte=" + faculte;
	}
}