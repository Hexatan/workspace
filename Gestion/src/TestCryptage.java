public class TestCryptage {

	public static void main(String[] args) {
		int a = Cryptage.a;
		int b = Cryptage.b;
		
		Cryptage.affine(a, b, "bonjour");
		
	}
}
