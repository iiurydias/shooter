package spaceshooter;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Player {
	Image image;
	Image thunder;
	double x = 490, y = 290;
	boolean isAlive = true;
	AffineTransform at = new AffineTransform();

	public Player() {
		if (image == null) {
			image = new ImageIcon(this.getClass().getResource("spaceship1.png")).getImage();
		}
		if (thunder == null) {
			thunder = new ImageIcon(this.getClass().getResource("thunder.png")).getImage();
		}

	}

	public void blink() {

	}

	public Image getImage() {
		return image;
	}

	public Image getThunder() {
		return thunder;
	}

	public void setTurboSpaceship() {
		image = new ImageIcon(this.getClass().getResource("spaceship-boosted2.png")).getImage();
	}

	public void setBackSpaceship() {
		image = new ImageIcon(this.getClass().getResource("spaceship1.png")).getImage();
	}

	public Rectangle getBounds() {
		return new Rectangle((int) x + 20, (int) y + 20, image.getWidth(null), image.getHeight(null));
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void draw(Graphics2D g2d, double theta) {
		at.setToIdentity();
		at.rotate(theta, x + 50, y + 40);
		at.translate(x, y);
		g2d.drawImage(image, at, null);
	}
}
