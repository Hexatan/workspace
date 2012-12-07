public class TestClub {
	public static void main(String[] args) {
		Personne p = new Personne("kjbbljks", 54);
		Personne p2 = new Personne("sewfvs", 46);
		Salarie s = new Salarie("jkgsj", 35, "456153", "jkqbbzmq");
		Etudiant e = new Etudiant("jkqcegsj", 25, "683413", "pl,nbv qzhv");
		Etudiant e2 = new Etudiant(e);
		Personne[] t = {p,s,e};
		Club c2 = new Club("pkqnjdzjbk", t);
		c2.ajouterAd(p2);
		c2.ajouterAd(e2);
		c2.Releve();
	}
}
