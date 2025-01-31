import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RepaintListener implements ActionListener {
    public Drawing d;

    RepaintListener(Drawing d) {
        this.d = d;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        d.repaint();
    }
}
