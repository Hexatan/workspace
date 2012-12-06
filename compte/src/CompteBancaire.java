public class CompteBancaire {
	public float solde;
	
	public CompteBancaire(float solde){
		if(solde<0){
			this.solde = 0;
		}
		else {
			this.solde = solde;
		}
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
}
