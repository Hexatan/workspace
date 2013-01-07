import java.awt.Color;

import javax.swing.JFrame;

public class Jeu extends JFrame {
	private Boulet boulet = new Boulet();

	public Jeu() {
		this.setTitle("Castle Game");
		this.setSize(860, 640);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setBackground(new Color(0, 127, 127));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(boulet);
		this.setVisible(true);
		go();
	}

	private void go() {
		boulet.setR(25);
		boulet.setPosX(-(boulet.getR() * 2));
		boulet.setPosY(-(boulet.getR() * 2));
		boulet.setC(15900000);
		int x = boulet.getPosX(), y = boulet.getPosY();
		boolean backX = false, backY = false;
		while (true) {
			if (x < 1)
				backX = false;
			if (x > boulet.getWidth() - 50)
				backX = true;
			if (y < 1)
				backY = false;
			if (y > boulet.getHeight() - 50)
				backY = true;
			if (!backX)
				boulet.setPosX(++x);
			else
				boulet.setPosX(--x);
			if (!backY)
				boulet.setPosY(++y);
			else
				boulet.setPosY(--y);
			boulet.repaint();

			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
