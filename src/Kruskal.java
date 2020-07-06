
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Kruskal extends JFrame {
    Icon icon = new ImageIcon("src\\save.png");
    Icon icon2 = new ImageIcon("src\\load.png");
    Icon icon3 = new ImageIcon("src\\skip.png");
    Icon icon4 = new ImageIcon("src\\start.png");
    Icon icon5 = new ImageIcon("src\\prev.png");
    Icon icon6 = new ImageIcon("src\\next.png");
    private JButton buttonStart = new JButton(icon4);
    private JButton buttonSkip = new JButton(icon3);
    private JButton nextStep = new JButton(icon6);
    private JButton prevStep = new JButton(icon5);
    private JButton saveButton = new JButton(icon2);
    private JButton loadButton = new JButton(icon);
    private JButton colorNodes = new JButton("Цвет вершин");
    private JButton colorEdge = new JButton("Цвет ребер");
    private JButton colorFlood = new JButton("Цвет заливки");
    private JButton thickness = new JButton("Толщина ребер");
    //ImageIcon image = new ImageIcon("src\\fon.png");
    //JLabel label = new JLabel(image);
    public Kruskal() {
        super("Kruskal Algorithm");
        this.setBounds(500,200,1000,700);
        Container container = this.getContentPane();
        //container.setLayout(new GridLayout(7,1,0,0));
        container.setLayout(new GridBagLayout());
        container.setBackground(new Color(255, 255, 255));
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,3,0,0));
        //panel.setBackground(new Color(0, 255, 0));
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        panel1.setBackground(new Color(0, 170, 0));
        GridBagConstraints c = new GridBagConstraints();
        c.fill   = GridBagConstraints.NONE;
        c.anchor=GridBagConstraints.CENTER;
        c.gridx=0;
        c.gridy=0;
        c.gridheight=1;
        c.gridwidth=1;
        c.ipadx = -50;
        c.ipady = 0;
        c.weightx = 1;
        c.weighty = 1;
        c.insets = new Insets(2, 0, 0, 0);
        saveButton.setBackground(new Color(0, 170, 0));
        saveButton.setBorderPainted(false);
        saveButton.setFocusPainted(false);
        //saveButton.setPressedIcon(icon3);
        //saveButton.setContentAreaFilled(false);
        panel1.add(saveButton,c);
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.CENTER;
        c.gridx=0;
        c.gridy=3;
        c.gridheight=1;
        c.gridwidth=1;
        c.ipadx = -50;
        c.ipady = 0;
        c.weightx = 1;
        c.weighty = 1;
        c.insets = new Insets(1, 0, 2, 0);
        loadButton.setBackground(new Color(0, 170, 0));
        loadButton.setBorderPainted(false);
        loadButton.setFocusPainted(false);
        //loadButton.setContentAreaFilled(false);
        panel1.add(loadButton,c);
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridBagLayout());
        panel2.setBackground(new Color(0, 170, 0));
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.CENTER;
        c.gridx=0;
        c.gridy=0;
        c.gridheight=1;
        c.gridwidth=1;
        c.ipadx = 5;
        c.ipady = 0;
        c.weightx = 1;
        c.weighty = 1;
        c.insets = new Insets(0, 0, 0, 0);
        colorNodes.setBackground(new Color(0, 120, 0));
        colorNodes.setForeground(new Color(255, 255, 255));
        colorNodes.setBorderPainted(false);
        colorNodes.setFocusPainted(false);
        panel2.add(colorNodes,c);
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.CENTER;
        c.gridx=1;
        c.gridy=0;
        c.gridheight=1;
        c.gridwidth=1;
        c.ipadx = 25;
        c.ipady = 0;
        c.weightx = 1;
        c.weighty = 1;
        c.insets = new Insets(0, 0, 0, 0);
        colorEdge.setBackground(new Color(0, 120, 0));
        colorEdge.setForeground(new Color(255, 255, 255));
        colorEdge.setBorderPainted(false);
        colorEdge.setFocusPainted(false);
        panel2.add(colorEdge,c);
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.CENTER;
        c.gridx=0;
        c.gridy=1;
        c.gridheight=1;
        c.gridwidth=1;
        c.ipadx = 0;
        c.ipady = 0;
        c.weightx = 1;
        c.weighty = 1;
        c.insets = new Insets(0, 0, 0, 0);
        colorFlood.setBackground(new Color(0, 120, 0));
        colorFlood.setForeground(new Color(255, 255, 255));
        colorFlood.setBorderPainted(false);
        colorFlood.setFocusPainted(false);
        panel2.add(colorFlood, c);
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.CENTER;
        c.gridx=1;
        c.gridy=1;
        c.gridheight=1;
        c.gridwidth=1;
        c.ipadx = 0;
        c.ipady = 0;
        c.weightx = 1;
        c.weighty = 1;
        c.insets = new Insets(0, 0, 0, 0);
        thickness.setBackground(new Color(0, 120, 0));
        thickness.setForeground(new Color(255, 255, 255));
        thickness.setBorderPainted(false);
        thickness.setFocusPainted(false);
        panel2.add(thickness,c);
        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridBagLayout());
        panel3.setBackground(new Color(0, 170, 0));
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.CENTER;
        c.gridx=0;
        c.gridy=0;
        c.gridheight=1;
        c.gridwidth=1;
        c.ipadx = -50;
        c.ipady = 0;
        c.weightx = 1;
        c.weighty = 1;
        c.insets = new Insets(2, 0, 1, 0);
        prevStep.setBackground(new Color(0, 170, 0));
        prevStep.setBorderPainted(false);
        prevStep.setFocusPainted(false);
        panel3.add(prevStep,c);
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.CENTER;
        c.gridx=1;
        c.gridy=0;
        c.gridheight=1;
        c.gridwidth=1;
        c.ipadx = -50;
        c.ipady = 0;
        c.weightx = 1;
        c.weighty = 1;
        c.insets = new Insets(2, 0, 1, 0);
        nextStep.setBackground(new Color(0, 170, 0));
        nextStep.setBorderPainted(false);
        nextStep.setFocusPainted(false);
        panel3.add(nextStep,c);
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.CENTER;
        c.gridx=0;
        c.gridy=1;
        c.gridheight=1;
        c.gridwidth=1;
        c.ipadx = -50;
        c.ipady = 0;
        c.weightx = 1;
        c.weighty = 1;
        c.insets = new Insets(1, 0, 4, 0);
        buttonStart.setBackground(new Color(0, 170, 0));
        buttonStart.setBorderPainted(false);
        buttonStart.setFocusPainted(false);
        panel3.add(buttonStart,c);
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.CENTER;
        c.gridx=1;
        c.gridy=1;
        c.gridheight=1;
        c.gridwidth=1;
        c.ipadx = -50;
        c.ipady = 0;
        c.weightx = 1;
        c.weighty = 1;
        c.insets = new Insets(0, 0, 2, 0);
        buttonSkip.setBackground(new Color(0, 170, 0));
        buttonSkip.setBorderPainted(false);
        buttonSkip.setFocusPainted(false);
        panel3.add(buttonSkip,c);
        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);
        c.fill   = GridBagConstraints.HORIZONTAL;
        c.anchor=GridBagConstraints.NORTH;
        c.gridx=0;
        c.gridy=0;
        c.gridheight=1;
        c.gridwidth=1;
        c.ipadx = 0;
        c.ipady = -55;
        c.weightx = 0;
        c.weighty = 0;
        c.insets = new Insets(0, 0, 0, 0);
        this.add(panel,c);
        JPanel holst = new JPanel();
        holst.setLayout(null);
        //holst.setBounds(100, 500, 10000, 100);
        //panel.setLayout(new GridLayout(0,0,0,0));
        holst.setBackground(new Color(0, 0, 0));
        c.fill   = GridBagConstraints.BOTH;
        c.anchor=GridBagConstraints.CENTER;
        c.gridx=0;
        c.gridy=1;
        c.gridheight=1;
        c.gridwidth=1;
        c.ipadx = 0;
        c.ipady = 0;
        c.weightx = 1;
        c.weighty = 1;
        c.insets = new Insets(0, 0, 0, 0);
        this.add(holst, c);
        //this.add(label);
        /*JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 10000, 100);
        panel.setBackground(new Color(0, 255, 0));
        buttonStart.setBounds(0,0,100,30);
        panel.add(buttonStart);
        buttonSkip.setBounds(100,0,100,30);
        panel.add(buttonSkip);
        nextStep.setBounds(200,0,100,30);
        panel.add(nextStep);
        prevStep.setBounds(300,0,100,30);
        panel.add(prevStep);
        saveButton.setBounds(400,0,100,30);
        panel.add(saveButton);
        loadButton.setBounds(500,0,100,30);
        panel.add(loadButton);
        colorNodes.setBounds(600,0,100,30);
        panel.add(colorNodes);
        colorEdge.setBounds(700,0,100,30);
        panel.add(colorEdge);
        colorFlood.setBounds(800,0,100,30);
        panel.add(colorFlood);
        thickness.setBounds(900,0,100,30);
        panel.add(thickness);
        container.add(panel);*/
        /*JPanel holst = new JPanel();
        holst.setLayout(null);
        holst.setBounds(300, 300, 100, 100);
        holst.setBackground(new Color(255, 255, 255));
        this.add(holst);*/
        /*JPanel holst2 = new JPanel();
        holst2.setLayout(null);
        holst2.setBounds(100, 0, 100, 100);
        holst2.setBackground(new Color(0, 0, 0));
        this.add(holst2);*/
        this.setResizable(true);
        //Container container = this.getContentPane();
        //container.setLayout(new GridBagLayout());
        //GridBagConstraints c = new GridBagConstraints();

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
