import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener extends JFrame implements ActionListener {
    Lamp l = null;
    public ButtonListener(Lamp l) {
        this.l = l;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (l.state == 0) {
            l.state = 1;
            l.gUpdate();
        } else {
            l.state = 0;
            l.gUpdate();
        }
    }
}
