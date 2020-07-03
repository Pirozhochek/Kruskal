
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Kruskal extends JFrame {
    private JButton buttonStart = new JButton("Start");
    private JButton buttonSkip = new JButton("Skip");
    public Kruskal() {
        super("Kruskal Algorithm");
        this.setBounds(100,100,1000,700);
        this.setResizable(true);
        Container container = this.getContentPane();
        container.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        this.add(buttonStart, c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 0;
        this.add(buttonSkip, c);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowListener() {
            public void windowActivated(WindowEvent event) {}

            public void windowClosed(WindowEvent event) {}


            public void windowDeactivated(WindowEvent event) {}

            public void windowDeiconified(WindowEvent event) {}

            public void windowIconified(WindowEvent event) {}

            public void windowOpened(WindowEvent event) {}
            public void windowClosing(WindowEvent event)
            {
                Object[] options = { "Да", "Нет!" };
                int rc = JOptionPane.showOptionDialog(
                        event.getWindow(), "Вы действительно хотите выйти?",
                        "Требуется подтверждение.", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE,
                        null, options, options[0]);
                if (rc == 0) {
                    event.getWindow().setVisible(false);
                    System.exit(0);
                }
            }

        });
    }

    public static void main(String[] args) {
        Kruskal app = new Kruskal();
        app.setVisible(true);
    }

}
