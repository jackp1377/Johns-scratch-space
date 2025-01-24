import java.awt.Graphics;
import javax.swing.*;

public class One {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JButton button = new JButton("Light Switch");
        frame.add(button);
        button.setVisible(true);
        button.setSize(140, 20);

        button.setLocation(330, 20);


        Lamp l = new Lamp(400, 200);
        frame.add(l);
        ButtonListener bl1 = new ButtonListener(l);
        button.addActionListener(bl1);

    }
}
