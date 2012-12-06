public class Releve {
	public static float soo;
	public static float sof;

	public static void affichage(Client cl, CompteReleve c) {
		for (int i = 1; i < 50; i++)
			System.out.print("_");
		System.out.println("\nA l'intention de Mr." + cl.getNomclient());
		System.out.println("\n\n Releve du compte " + c.getNom());
		System.out.println("Ancien solde (initial)		  " + soo + " Euros");
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

}