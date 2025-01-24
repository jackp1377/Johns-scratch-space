import java.awt.*;
import javax.swing.JComponent;

public class Lamp extends JComponent {
    public int x;
    public int y;

    public Lamp(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int state = 0;

    public void paintComponent(Graphics g) {
        Color c = null;
        if (state == 0) {
            c = Color.white;
        } else  {
            c = Color.GRAY;
        }
        g.setColor(c);
        g.fillOval(x-300, y-130, 600, 600);
        g.setColor(Color.black);
        Polygon p = new Polygon();
        g.fillRect(x-10, y, 20, 400);

        if (state == 0) {
            g.setColor(Color.yellow);
        } else {
            g.setColor(Color.blue);
        }
        p.addPoint(x - 100, y + 60);
        p.addPoint(x + 100, y + 60);
        p.addPoint(x + 60, y - 30);
        p.addPoint(x - 60, y - 30);
        g.fillPolygon(p);
        g.drawPolygon(p);

        Polygon p2 = new Polygon();

        g.setColor(Color.black);
        p2.addPoint(x - 95, y + 55);
        p2.addPoint(x + 95, y + 55);
        p2.addPoint(x + 55, y - 25);
        p2.addPoint(x - 55, y - 25);
        g.drawPolygon(p2);


    }

    public void gUpdate() {
        this.repaint();
    }
}
