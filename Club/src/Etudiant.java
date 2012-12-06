public class Etudiant extends Personne {
	
	private String numeroEtudiant;
	private String faculte;
	
	public Etudiant() {}
	
	public Etudiant(Etudiant e) {
		super(e);
		this.faculte=e.faculte;
		this.numeroEtudiant=e.numeroEtudiant;		
	}
	
	public Etudiant(String unNom,int unAge, String unNumeroEtudiant, String uneFac) {
		super(unNom,unAge);
		this.faculte=uneFac;
		this.numeroEtudiant=unNumeroEtudiant;
	}
	
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

	public String getNumeroEtudiant() {
		return numeroEtudiant;
	}

	public String getFaculte() {
		return faculte;
	}
	
	public void init() {
		super.init();
		this.faculte = Lire.jstring("Fac ?");
		this.numeroEtudiant=Lire.jstring("numero ?");
	}
	
	public String toString() {
		return super.toString() + " numeroEtudiant=" + numeroEtudiant
				+ ", faculte=" + faculte;
	}
	
}
