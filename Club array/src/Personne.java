public class Personne {
	
	protected String nom;
	protected int age;
	
	public Personne() {}
	
	public Personne(Personne p) {
		this(p.nom,p.age);
	}
	
	public Personne(String n,int a) {
		this.age = a;
		this.nom = n;
	}
	
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
	
	public int getAge() {
		return this.age;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void init() {
		this.age = Lire.jint("Age ?");
		this.nom = Lire.jString("Nom ?");
	}

	public String toString() {
		return "nom=" + nom + ", age=" + age;
	}
}