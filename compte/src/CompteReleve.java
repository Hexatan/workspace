import java.util.ArrayList;

public class CompteReleve {
	private float solde;
	private int operationmax;
	private int opeffectue;
	private ArrayList<Float> op = new ArrayList<Float>();
	
	public CompteReleve(float somme) {
		if(somme>0) this.solde = somme;
		else this.solde = 0;
		this.operationmax = 0;
		this.opeffectue = 0;
	}
	
	public CompteReleve(float somme,int opmax) {
		if(somme>0) this.solde = somme;
		else this.solde = 0;
		this.operationmax = opmax;
		this.opeffectue = 0;
	}
	
	public float consulte() {
		return this.solde;
	}
	
	public int nboperation() {
		return this.opeffectue;
	}
	
	public void operation(float opn) {
		if(opeffectue<operationmax) this.op.add(opn);
		else {
			this.op.remove(0);
			this.op.add(opn);
		}
	}
	
	public void crediter(float credit){
		if(credit>0){
			this.solde += credit;
			this.operation(+credit);
			this.opeffectue++;
		}
	}
	
	public void debiter(float debit){
		if(debit>0){
			this.solde -= debit;
			this.operation(-debit);
			this.opeffectue++;
		}
	}
	
	public void doperation() {
		int i;
		for(i=0;i<this.op.size();i++) {
			if(this.op.get(i)<0)
				System.out.println("Opération " + (i+1) + "	" + this.op.get(i) + " Euros");
			else if(this.op.get(i)>0)
				System.out.println("Opération " + (i+1) + "			  " + "+" + this.op.get(i) + " Euros");
		}
	}
}
