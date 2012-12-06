public class Compte {
	protected float solde;
	protected String nom;
	
	
	public Compte() {
		this.solde = 0;
	}
	
	public Compte(float solde,String nom){
		if(solde<0)	this.solde = 0;
		else this.solde = solde;
		this.nom = nom;
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
	
	public float consulte(){
		return this.solde;
	}
	
	public void crediter(float credit){
		if(credit>0){
			this.solde += credit;
		}
	}
	
	public void debiter(float debit){
		if(debit>0){
			this.solde -= debit;
		}
	}
	
	public String toString() {
		return this.nom + "|" + this.solde ;
	}
}
