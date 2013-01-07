import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Tableau extends JFrame {

	public Tableau(CompteReleve c, String nom) {
		this.setLocationRelativeTo(null);
		// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle(nom);
		this.setSize(300, 240);

		String titre[] = { "Opération", "Montant(Euros)" };
		JTable tableau = new JTable(Releve.tableau(c), titre);
		this.getContentPane().add(new JScrollPane(tableau));
	}
}
