package spaceshooter;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class Bullet {

    Image image;
    int x;
    int y;
    boolean fired = false;
    double theta;

    public Bullet(int x, int y, double theta) {
        if (image == null) {
            image = new ImageIcon(this.getClass().getResource("player_shoot.png")).getImage();
        }

    }

    public Bullet(int i) {
        if (image == null && i == 1) {
            image = new ImageIcon(this.getClass().getResource("missile_fired.png")).getImage();
        }else if(image == null && i == 2){
            image = new ImageIcon(this.getClass().getResource("enemy_shoot.png")).getImage();
        }else{
                image = new ImageIcon(this.getClass().getResource("missile.png")).getImage();
        }
    }
   

    public Image getImage() {
        return image;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, image.getWidth(null), image.getHeight(null));
    }

}
