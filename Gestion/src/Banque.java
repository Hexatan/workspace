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

	public void ajcompte(Client cl) {
		ArrayList<CompteReleve> clone = (ArrayList<CompteReleve>) cl.getLc()
				.clone();
		lcompte = clone;
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
				if (cl.getNbcompte() != 1)
					Releve.affichage(cl, cl.choixCompte());
				else
					Releve.affichage(cl, cl.choixCompte());
			}
			if (cmd.equalsIgnoreCase("creacompte") == true) {
				cl.creaCompte();
				this.ajcompte(cl);
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
				System.out.println(this + cl.toString());
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
