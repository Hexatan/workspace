@SuppressWarnings("rawtypes")
public class Personne implements java.lang.Comparable {
	
	protected String nom;
	protected int age;
	
	/**
	 * Constructeur par défaut
	 */
	public Personne() {}
	
	/**
	 * Constructeur par copie
	 * @param p personne que l'on veut copier
	 */
	public Personne(Personne p) {
		this(p.nom,p.age);
	}
	
	/**
	 * Constructeur avec nom et age.
	 * @param n nom de la personne
	 * @param a age de la personne
	 */
	public Personne(String n,int a) {
		this.age = a;
		this.nom = n;
	}
	
	/**
	 * Redefinision de la méthode equals.
	 */
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null) return false;
		if (getClass() != o.getClass()) return false;
		Personne other = (Personne) o;
		if (age != other.age) return false;
		if (nom == null) {
			if (other.nom != null) return false;
		}
		else if (!nom.equals(other.nom)) return false;
		return true;
	}
	
	/**
	 * Retourne l'age de la personne courante.
	 * @return age
	 */
	public int getAge() {
		return this.age;
	}
	
	/**
	 * Retourne le nom de la personne courante
	 * @return nom
	 */
	public String getNom() {
		return this.nom;
	}
	
	/**
	 * Initialise intéractivement une instance de Personne
	 */
	public void init() {
		this.age = Lire.jint("Age ?");
		this.nom = Lire.jString("Nom ?");
	}
	
	/**
	 * Méthode toString qui affiche le nom et l'age de 
	 */
	public String toString() {
		return "nom=" + nom + ", age=" + age;
	}
	
	/**
	 * Méthode qui compare les objets dans la liste de personne
	 */
	public int compareTo(Object o) {
		if(this instanceof Personne && (o instanceof Etudiant || o instanceof Salarie)) return -1;
		else if((this instanceof Etudiant || this instanceof Salarie) && o instanceof Personne) return 1;
		else return 0;
	}
}