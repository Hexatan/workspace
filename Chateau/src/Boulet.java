import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Boulet extends JPanel {
	private int posX;
	private int posY;
	private int r;
	private Color c;
	private Random color = new Random();

	public void paintComponent(Graphics g) {
		g.setColor(new Color(0, 127, 127));
		g.fillOval(posX - r, posY - r, 4 * r, 4 * r);
		g.setColor(new Color(color.nextFloat(), color.nextFloat(), color.nextFloat()));
		g.fillOval(posX, posY, 2 * r, 2 * r);
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public Color getC() {
		return c;
	}

	public void setC(int c1, int c2, int c3) {
		this.c = new Color(c1, c2, c3);
	}

	public void setC(int i) {
		this.c = new Color(i);
	}
}
