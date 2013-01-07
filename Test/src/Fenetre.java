import javax.swing.JFrame;

public class Fenetre extends JFrame {
	private Panneau pan = new Panneau();

	public Fenetre() {
		this.setTitle("Ceci est une fenètre Java");
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public Fenetre(String nom, int x, int y) {
		this.setTitle(nom);
		this.setSize(x, y);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(pan);
		this.setVisible(true);
		go();
	}

	private void go() {
		int x = pan.getPosX(), y = pan.getPosY();
		boolean backX = false, backY = false;
		while (true) {
			if (x < 1)
				backX = false;
			if (x > pan.getWidth() - 50)
				backX = true;
			if (y < 1)
				backY = false;
			if (y > pan.getHeight() - 50)
				backY = true;
			if (!backX)
				pan.setPosX(++x);
			else
				pan.setPosX(--x);
			if (!backY)
				pan.setPosY(++y);
			else
				pan.setPosY(--y);
			pan.repaint();

			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
