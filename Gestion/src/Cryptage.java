import java.util.Random;

public class Cryptage {
	public static Random r = new Random();
	public static int b = 0 + r.nextInt(50);
	public static int PGCD = 1;
	public static int a = 0 + r.nextInt(50);

	public static char toChar(int codeASCII) {
		return (char) codeASCII;
	}

	public static int toASCII(char lettre) {
		return (int) lettre;
	}

	public static boolean isMaj(char lettre) {
		if (toASCII(lettre) > 64 && toASCII(lettre) < 91)
			return true;
		else
			return false;
	}

	public static boolean isMin(char lettre) {
		if (toASCII(lettre) > 96 && toASCII(lettre) < 123)
			return true;
		else
			return false;
	}

	public static boolean isLetter(char lettre) {
		if (isMin(lettre) || isMaj(lettre))
			return true;
		else
			return false;
	}

	public static boolean isNum(char lettre) {
		if (toASCII(lettre) > 47 && toASCII(lettre) < 58)
			return true;
		else
			return false;
	}

	/**
	 * 
	 * @param a
	 *            décalage souhaité
	 * @param mdp
	 *            chaine de caractères à crypter
	 * @return chaine de caractères cryptée
	 */
	public static String decalc(String mdp) {
		String textenc = "";
		char lettre_enc = '\0';
		char lettre_cl = '\0';

		for (int i = 0; i < mdp.length(); i++) {
			lettre_cl = mdp.charAt(i);
			if (toASCII(lettre_cl) == toASCII('z') && a > 0) {
				lettre_enc = toChar(toASCII('a') + (a - 1));
			} else if (toASCII(lettre_cl) == toASCII('Z') && a > 0) {
				lettre_enc = toChar(toASCII('A') + (a - 1));
			} else {
				lettre_enc = toChar((lettre_cl) + a);
				if (toASCII(lettre_enc) > toASCII('z') && isMin(lettre_cl)) {
					lettre_enc = toChar(toASCII(lettre_enc) - 26);
				} else if (toASCII(lettre_enc) < toASCII('a')
						&& isMin(lettre_cl)) {
					lettre_enc = toChar(toASCII(lettre_enc) + 26);
				} else if (toASCII(lettre_enc) > toASCII('Z')
						&& isMaj(lettre_cl)) {
					lettre_enc = toChar(toASCII(lettre_enc) - 26);
				} else if (toASCII(lettre_enc) < toASCII('A')
						&& isMaj(lettre_cl)) {
					lettre_enc = toChar(toASCII(lettre_enc) + 26);
				}
			}
			textenc += lettre_enc;
		}
		textenc += toChar(Math.abs((a % 26 + toASCII('`'))));
		return textenc;
	}

	public static String decald(String mdp) {
		int cle = -(toASCII(mdp.charAt(mdp.length() - 1)) - toASCII('`'));
		String textdec = "";
		char lettre_enc = '\0';
		char lettre_dec = '\0';

		for (int i = 0; i < mdp.length() - 1; i++) {
			lettre_enc = mdp.charAt(i);
			if (toASCII(lettre_enc) == toASCII('z') && cle > 0) {
				lettre_dec = toChar(toASCII('a') + (cle - 1));
			} else if (toASCII(lettre_enc) == toASCII('Z') && cle > 0) {
				lettre_dec = toChar(toASCII('A') + (cle - 1));
			} else {
				lettre_dec = toChar((lettre_enc) + cle);
				if (toASCII(lettre_dec) > toASCII('z') && isMin(lettre_enc)) {
					lettre_dec = toChar(toASCII(lettre_enc) - (26 - cle));
				} else if (toASCII(lettre_dec) < toASCII('a')
						&& isMin(lettre_enc)) {
					lettre_dec = toChar(toASCII(lettre_enc) + (26 + cle));
				} else if (toASCII(lettre_dec) > toASCII('Z')
						&& isMaj(lettre_enc)) {
					lettre_dec = toChar(toASCII(lettre_enc) - (26 - cle));
				} else if (toASCII(lettre_dec) < toASCII('A')
						&& isMaj(lettre_enc)) {
					lettre_dec = toChar(toASCII(lettre_enc) + (26 + cle));
				}
			}
			textdec += lettre_dec;
		}

		return textdec;
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
