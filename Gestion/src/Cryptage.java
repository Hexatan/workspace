import java.util.Random;

public class Cryptage {
	public static Random r = new Random();
	public static int b = 0 + r.nextInt(100);
	public static int PGCD = 1;
	public static int a = 0 + r.nextInt(100);

	public static void affine(int a, int b, String mdp) {
		int xT[] = new int[26];
		char clairT[] = new char[26];
		char crypteT[] = new char[26];
		int yT[] = new int[26];
		char motCrypteT[] = new char[26];
		char motClairT[] = new char[26];
		int x = 0;
		int y = 0;
		String motClair = mdp;
		String motCrypte = "";
		for (x = 0; x < 26; x++)
			xT[x] = x;
		for (x = 0; x < 26; x++) {
			y = (a * x + b) % 26;
			yT[x] = y;
		}
		for (x = 0; x < 26; x++) {
			clairT[x] = (char) (x + 97);
		}
		for (x = 0; x < 26; x++) {
			y = (a * x + b) % 26;
			crypteT[x] = clairT[y];
		}
		String lettreA = "" + (char) (a);
		String lettreB = "" + (char) (b);
		motCrypte += lettreA;

		int nbCaractereCl = motClair.length();
		for (int i = 0; i < (nbCaractereCl + 1); i++) {
			for (x = 0; x < 26; x++) {
				y = (a * x + b) % 26;
				motCrypteT[i] = crypteT[x];
			}
			motCrypte += motCrypteT[i];
		}
		motCrypte += lettreB;
		System.out.println(motCrypte);
	}

	public static int PGCD(int a, int b) {
		while (a != b) {
			if (a < b) {
				int tmp = a;
				a = b;
				b = tmp;
			}
			int c = a - b;
			a = c;
			PGCD = a;
		}
		return PGCD;
	}
}
