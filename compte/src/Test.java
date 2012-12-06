public class Test {
	public static void main(String[] args) {
		
		CompteBancaireReleve c2 = new CompteBancaireReleve(1000,6);
		for(int i=1;i<50;i++) System.out.print("_");
		System.out.println("\n\nAncien solde (initial)		  " + c2.consulte() + " Euros");
		for(int i=1;i<50;i++) System.out.print("_");
		System.out.print("\n\n");
		c2.debiter(100);
		c2.debiter(200);
		c2.crediter(300);
		c2.debiter(100);
		c2.debiter(50);
		c2.crediter(750);
		c2.debiter(100);
		c2.derniereoperation();
		for(int i=1;i<50;i++) System.out.print("_");
		System.out.print("\n\n");
		System.out.println("Nouveau solde			  " + c2.consulte() + " Euros");
	}
}
