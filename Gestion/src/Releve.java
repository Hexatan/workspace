import java.util.ArrayList;

public class Releve {
	public static float sof;
	private static ArrayList<Float> l;

	public static void affichage(Client cl, CompteReleve c) {
		cl.calcT_solde();
		for (int i = 1; i < 50; i++)
			System.out.print("_");
		Graph.sopn("\nA l'intention de Mr." + cl.getNomclient());
		Graph.sopn("\n\n Releve du compte " + c.getNom());
		Graph.sopn("Ancien solde (initial)		  " + c.soldeini + " Euros");
		for (int i = 1; i < 50; i++)
			System.out.print("_");
		System.out.print("\n\n");
		sof = c.consulte();
		c.doperation();
		for (int i = 1; i < 50; i++)
			System.out.print("_");
		System.out.print("\n\n");
		System.out.println("Nouveau solde			  " + sof + " Euros");
	}

	public static Object[][] tableau(CompteReleve c) {
		sof = c.consulte();
		l = c.getOp();
		Object data[][];
		data = new Object[(c.getOperationmax() + 2)][];
		Object[] temp = null;
		data[0] = new Object[] { "Solde initial", c.soldeini };
		for (int i = 1; i < (data.length - 1); i++) {
			if (l.get(i - 1) < 0) {
				temp = new Object[] { "Debit", Math.abs(l.get(i - 1)) };
			} else if (l.get(i - 1) > 0) {
				temp = new Object[] { "Crédit", Math.abs(l.get(i - 1)) };
			}
			data[i] = temp;
		}
		data[c.getOperationmax() + 1] = new Object[] { "Solde final", sof };
		return data;
	}
}