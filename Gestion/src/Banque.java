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
		lcompte.add(cl.choixCompte());
	}

	public void ajclient(ArrayList<CompteReleve> list_c) {
		lcompte.addAll(list_c);
	}

	public Client connexion() {
		String nomc = Lire.jstring("Quel est votre nom ?");
		String mdp = Lire.jString("Entrer votre mot de passe");
		mdp = Cryptage.decalc(mdp);
		return new Client(nomc, mdp);
	}

	public void verifmdp(Client cl) {
		String mdp;
		do {
			mdp = Lire.jString("Entrer votre mot de passe");
			if (mdp.equals(Cryptage.decald(cl.getMdp())) == true)
				Graph.sopn("Mot de passe accept�");
			else
				Graph.sopn("Mot de passe refus� !!!");
		} while (mdp.equals(Cryptage.decald(cl.getMdp())) == false);
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
				verifmdp(cl);
				cl.calcT_solde();
				CompteReleve c = cl.choixCompte();
				String titre = "Relev� du compte : " + c.getNom() + " de Mr."
						+ cl.getNomclient();
				Tableau r1 = new Tableau(c, titre);
				r1.setVisible(true);
			}
			if (cmd.equalsIgnoreCase("creacompte") == true) {
				verifmdp(cl);
				cl.creaCompte();
				this.ajcompte(cl);
			}
			if (cmd.equalsIgnoreCase("debiter") == true) {
				verifmdp(cl);
				float deb;
				CompteReleve c = cl.choixCompte();
				deb = Lire
						.jfloat("Combien voulez vous d�biter de votre compte");
				if ((c.getSolde() + cl.getDecAuth()) > deb)
					c.debiter(deb);
				else if (cl.getNbcompte() > 1) {
					if ((cl.getT_solde() + cl.getDecAuth()) > deb)
						;
				} else
					Graph.sopn("Action impossible !!! (T'es trop pauvre)");
			}
			if (cmd.equalsIgnoreCase("crediter") == true) {
				verifmdp(cl);
				cl.choixCompte()
						.crediter(
								Lire.jfloat("Combien voulez vous cr�diter sur votre compte"));
			}
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
