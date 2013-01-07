import java.io.IOException;
import java.security.CryptoPrimitive;

public class Test {

	public static void main(String[] args) throws IOException {
		/*
		 * Banque b1 = new Banque("AlphaMoney", 10000000);
		 * b1.cgestion(b1.connexion()); /* CompteReleve c = new
		 * CompteReleve(10000, "alpha", 7); ArrayList<CompteReleve> lc = new
		 * ArrayList<CompteReleve>(); lc.add(c); Releve.soo = c.getSolde();
		 * Client cl = new Client("Duvaux"); cl.setLc(lc); cl.setNbcompte(1);
		 * c.crediter(10000); c.debiter(5000); c.crediter(7000);
		 * c.debiter(5000); c.crediter(60000); c.debiter(7000);
		 * c.crediter(30000); c.debiter(2000); b1.cgestion(cl);
		 */

		Graph.sop("\n" + Cryptage.decalc(1, "abcd"));
	}
}
