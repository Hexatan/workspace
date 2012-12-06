import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		Banque b1 = new Banque("AlphaMoney",10000000);
		b1.cgestion(b1.connexion());
	}
}
