import java.awt.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JComponent;

public class Drawing extends JComponent {
    int width, height;
    int size, x, y;
    ArrayList<Drawing> dList = new ArrayList<Drawing>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing");
        int width, height;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        width = height = args.length >= 1 ? Integer.parseInt( args[0] ) : 500 ;
        frame.setSize(width + 20, height + 20);
        frame.setVisible(true);
        Drawing d = new Drawing(width, height, 10,120, 180);
        Drawing d1 = new Drawing(width, height, 15,10, 20);
        Drawing d2 = new Drawing(width, height, 9,40, 300);
        Drawing d3 = new Drawing(width, height, 30, 250, 100);
        d.dList.add(d1);
        d.dList.add(d);
        d.dList.add(d2);
        d.dList.add(d3);
        frame.add(d);



        //frame.add(b);
    }
    public Drawing(int width, int height, int size, int x, int y) {
        this.width = width;
        this.height = height;
        this.size = size;
        this.x = x;
        this.y = y;
    }

    int scale(int value) {
        return (int) (this.getWidth() / 500.0 * value);
    }

    public void paintComponent(Graphics g) {
        for (Drawing d : dList) {
            for (int x = 0; x < 7; x++) {
                if (x == 0) {

                } else {
                    g.fillRect(scale(d.x) + scale(x *d.size), scale(d.y) + scale(x *d.size), scale(d.size), scale(d.size));
                    g.fillRect(scale(d.x) + scale((7-x) * d.size), scale(d.y) + scale(d.size*x), scale(d.size), scale(d.size));
                }
            }
        }
    }
}
