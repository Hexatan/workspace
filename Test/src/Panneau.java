import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panneau extends JPanel {
	private int posX;
	private int posY;
	private int r;

	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
		g.fillOval(posX - r, posY - r, 4 * r, 4 * r);
		g.setColor(Color.yellow);
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
}
