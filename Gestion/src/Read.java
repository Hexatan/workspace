import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Read {
	public static String Savep = "Save";
	public static Path save = Paths.get(Savep);
	public static Charset uni = Charset.forName("unicode");

	public static void client(Client c) throws IOException {
		Path path = Paths.get(Savep, "Banque.txt");
		try (BufferedReader reader = Files.newBufferedReader(path, uni)) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}
	}
}
