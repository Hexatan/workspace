import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Save {
	public static String Savep = "Save";
	public static Path save = Paths.get(Savep);
	public static Charset uni = Charset.forName("unicode");

	public static void banque(Banque b) throws IOException {
		if (Files.exists(save) == false)
			Files.createDirectory(save);
		Path path = Paths.get(Savep, "Banque.txt");
		if (Files.exists(path) == false)
			Files.createFile(path);
		try (BufferedWriter writer = Files.newBufferedWriter(path, uni)) {
			writer.write(b.toString());
		}
	}

	public static void compte(CompteReleve c) throws IOException {
		if (Files.exists(save) == false)
			Files.createDirectory(save);
		Path path = Paths.get(Savep, "Compte.txt");
		if (Files.exists(path) == false)
			Files.createFile(path);
		try (BufferedWriter writer = Files.newBufferedWriter(path, uni)) {
			writer.write(c.toString());
		}
	}

	public static void client(Client cl) throws IOException {
		if (Files.exists(save) == false)
			Files.createDirectory(save);
		Path path = Paths.get(Savep, "Client.txt");
		if (Files.exists(path) == false)
			Files.createFile(path);
		try (BufferedWriter writer = Files.newBufferedWriter(path, uni)) {
			writer.write(cl.toString());
		}
	}
}