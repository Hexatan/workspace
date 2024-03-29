public class Compte {
	protected float solde;
	protected String nom;
	protected float soldeini;
	protected Client proprietaire;

	public Compte() {
		this.solde = 0;
		this.soldeini = 0;
		this.proprietaire = null;
	}

	public Compte(float solde, String nom,Client p) {
		if (solde < 0) {
			this.solde = 0;
			this.soldeini = 0;
		} else {
			this.solde = solde;
			this.soldeini = solde;
		}
		this.nom = nom;
		this.proprietaire = p;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setSoldeini(float soldeini) {
		this.soldeini = soldeini;
	}

	public String getNom() {
		return nom;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public float consulte() {
		return this.solde;
	}

	public void crediter(float credit) {
		if (credit > 0) {
			this.solde += credit;
		}
	}

	public void debiter(float debit) {
		if (debit > 0) {
			this.solde -= debit;
		}
	}

	public String toString() {
		return this.nom + "|" + this.solde;
	}

	public Client getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Client proprietaire) {
		this.proprietaire = proprietaire;
	}

	public float getSoldeini() {
		return soldeini;
	}
}
