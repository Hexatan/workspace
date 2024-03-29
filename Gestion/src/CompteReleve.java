import java.util.ArrayList;

public class CompteReleve extends Compte {
	private int operationmax;
	private int opeffectue;
	private ArrayList<Float> op = new ArrayList<Float>();

	public CompteReleve() {
		super();
	}

	public CompteReleve(float somme, String nom, Client p) {
		super(somme, nom, p);
		this.opeffectue = 0;
		this.operationmax = 5;
	}

	public CompteReleve(float somme, String nom, int opmax, Client p) {
		super(somme, nom, p);
		this.operationmax = opmax;
		this.opeffectue = 0;
	}

	public CompteReleve(Compte compte, int opmax, Client p) {
		super(compte.getSolde(), compte.getNom(), p);
		this.operationmax = opmax;
		this.opeffectue = 0;
	}

	public int nboperation() {
		return this.opeffectue;
	}

	public void operation(float opn) {
		if (opeffectue < operationmax)
			this.op.add(opn);
		else {
			this.op.remove(0);
			this.op.add(opn);
		}
	}

	public void crediter(float credit) {
		super.crediter(credit);
		this.operation(+credit);
		this.opeffectue++;
	}

	public void debiter(float debit) {
		super.debiter(debit);
		this.operation(-debit);
		this.opeffectue++;
	}

	public void doperation() {
		int i;
		for (i = 0; i < this.op.size(); i++) {
			if (this.op.get(i) < 0)
				System.out.println("Opération " + (i + 1) + "	"
						+ this.op.get(i) + " Euros");
			else if (this.op.get(i) > 0)
				System.out.println("Opération " + (i + 1) + "			  " + "+"
						+ this.op.get(i) + " Euros");
		}
	}

	public ArrayList<Float> getOp() {
		return op;
	}

	public int getOperationmax() {
		return operationmax;
	}

	public void setOperationmax(int operationmax) {
		this.operationmax = operationmax;
	}
}