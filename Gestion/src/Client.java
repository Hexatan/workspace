import java.util.ArrayList;

public class Client {
	private String nomclient;
	private int nbcompte;
	private float t_solde;
	private ArrayList<CompteReleve> lc = new ArrayList<CompteReleve>();

	public Client() {
		this.nomclient = "";
		this.nbcompte = 0;
		this.t_solde = 0f;
	}

	public Client(String nom) {
		this.nomclient = nom;
		this.nbcompte = 0;
		this.t_solde = 0f;
	}

	public String getNomclient() {
		return nomclient;
	}

	public void setNomclient(String nomclient) {
		this.nomclient = nomclient;
	}

	public String toString() {
		return this.nomclient + "|" + this.nbcompte + "|" + this.t_solde + "|"
				+ this.lc;
	}

	public int getNbcompte() {
		return nbcompte;
	}

	public float getT_solde() {
		return t_solde;
	}

	public ArrayList<CompteReleve> getLc() {
		return lc;
	}

	public void creaCompte() {
		String str;
		int tcon = 0;
		do {
			str = Lire.jstring("Voulez vous créer un compte ? (oui/non)");
			System.out.println(str);
			tcon++;
			if (tcon == 2)
				System.out
						.println("Apparement il te manque quelque chose dans ton cerveau");
			else if (tcon >= 3) {
				System.out
						.println("Qu'est ce que tu comprends pas dans (oui/non)");
				if (tcon == 5) {
					Graph.sopn("Bon t'es trop con !!!" + "\n" + "Aurevoir");
					System.exit(0);
				}
			}
		} while (str.equalsIgnoreCase("oui") != true
				&& str.equalsIgnoreCase("non") != true);
		if (str.equalsIgnoreCase("oui") == true) {
			String nom = Lire
					.jstring("Comment voulez vous appellez votre compte ?");
			float solde = Lire
					.jfloat("Combien voulez vous mettre dans votre compte ?");
			int opmax = Lire.jint("Combien d'operation maximale sur releve ?");
			this.lc.add(new CompteReleve(solde, nom, opmax));
			this.nbcompte++;
			this.t_solde += solde;
		}
	}
	
	public void ajcompte(CompteReleve c){
		this.lc.add(c);
		this.nbcompte++;
		this.t_solde += c.getSolde();
	}

	public CompteReleve choixCompte() {
		if (this.getNbcompte() != 1) {
			for (int i = 0; i < this.getLc().size(); i++)
				System.out.println((i + 1) + ":" + this.getLc().get(i));
			int chx = Lire.jint("Quel compte voulez vous choisir ?");
			return this.lc.get(chx - 1);
		}
		return this.lc.get(0);
	}

	public void calcT_solde() {
		for (int i = 0; i < lc.size(); i++)
			t_solde += lc.get(i).getSolde();
	}

	public void setNbcompte(int nbcompte) {
		this.nbcompte = nbcompte;
	}

	public void setT_solde(float t_solde) {
		this.t_solde = t_solde;
	}

	public void setLc(ArrayList<CompteReleve> lc) {
		this.lc = lc;
	}

}