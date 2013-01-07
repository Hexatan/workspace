import java.io.IOException;
import java.util.ArrayList;

public class Banque {
	private String nom;
	private long capital;
	private ArrayList<CompteReleve> lcompte = new ArrayList<CompteReleve>();

	public Banque(String nom, long capital) {
		this.nom = nom;
		this.capital = capital;
	}

	public void ajcompte(CompteReleve c) {
		lcompte.add(c);
	}

	public void ajclient(ArrayList<CompteReleve> list_c) {
		lcompte.addAll(list_c);
	}

	public Client connexion() {
		return new Client(Lire.jstring("Quel est votre nom ?"));
	}

	public void cgestion(Client cl) throws IOException {
		System.out.print(this + "\n");
		System.out
				.print("Bienvenue sur l'ecran de gestion de votre compte client Mr."
						+ cl.getNomclient() + "\n");
		System.out.print("Vous avez actuelment " + cl.getNbcompte()
				+ " compte\n");
		for (int i = 1; i < 75; i++)
			System.out.print("_");
		String cmd;
		do {
			cmd = Lire
					.jstring("\nPour voir les operations que vous pouvez effectuer tapez operation");
			if (cmd.equalsIgnoreCase("operation") == true)
				System.out
						.print("debiter\ncrediter\nreleve\ncreacompte\nexit\ninfo\ndeco");
			if (cmd.equalsIgnoreCase("releve") == true) {
				cl.calcT_solde();
				CompteReleve c = cl.choixCompte();
				String titre = "Relevé du compte : " + c.getNom() + " de Mr."
						+ cl.getNomclient();
				Tableau r1 = new Tableau(c, titre);
				r1.setVisible(true);
			}
			if (cmd.equalsIgnoreCase("creacompte") == true) {
				cl.creaCompte();
				CompteReleve c = cl.getLc().get(cl.getLc().size() - 1);
				this.ajcompte(c);
			}
			if (cmd.equalsIgnoreCase("debiter") == true)
				cl.choixCompte()
						.debiter(
								Lire.jfloat("Combien voulez vous débiter de votre compte"));
			if (cmd.equalsIgnoreCase("crediter") == true)
				cl.choixCompte()
						.crediter(
								Lire.jfloat("Combien voulez vous créditer sur votre compte"));
			if (cmd.equalsIgnoreCase("info") == true)
				System.out.println(this + "\n\t" + cl.toString());
			if (cmd.equalsIgnoreCase("deco") == true)
				this.cgestion(this.connexion());
			if (cmd.equalsIgnoreCase("read") == true)
				Read.client(cl);

		} while (cmd.equalsIgnoreCase("exit") != true);
		Save.client(cl);
	}

	public String toString() {
		return this.nom + "|" + this.capital + "|" + this.lcompte;
	}
}
