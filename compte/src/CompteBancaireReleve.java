public class CompteBancaireReleve extends CompteBancaire {
	private float solde;
	private int operationmax;
	private int operation;
	private float op1;
	private float op2;
	private float op3;
	private float op4;
	private float op5;
	
	public CompteBancaireReleve(float solde){
		super(solde);
	}
	
	public CompteBancaireReleve(float solde,int operationmax){
		super(solde);
		this.operationmax = operationmax;
	}
	
	public float consulte(){
		return this.solde;
	}
	
	public void crediter(float credit){
		if(credit>0){
			this.solde += credit;
			this.operation(credit);
			this.operation++;
		}
	}
	
	public void debiter(float debit){
		if(debit>0){
			this.solde += debit;
			this.operation(-debit);
			this.operation++;
		}
	}
	
	public int nboperation(){
		return this.operation;
	}
	
	public int nboperatiomax(){
		return this.operationmax;
	}
	
	public void derniereoperation() {
			if(op5 != 0) System.out.println(op5);
			if(op4 != 0) System.out.println(op4);
			if(op3 != 0) System.out.println(op3);
			if(op2 != 0) System.out.println(op2);
			if(op1 != 0) System.out.println(op1);
	}
	
	public void operation(float opn) {
		op5 = op4;
		op4 = op3;
		op3 = op2;
		op2 = op1;
		op1 = opn;
	}
}
