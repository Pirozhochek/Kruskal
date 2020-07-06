package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame {
    private JButton saveButton = new JButton(new ImageIcon("src\\save.png"));
    private JButton loadButton = new JButton(new ImageIcon("src\\load.png"));

    private JButton colorNodes = new JButton("Цвет вершин");
    private JButton colorEdge = new JButton("Цвет ребер");
    private JButton colorFlood = new JButton("Цвет заливки");
    private JButton thickness = new JButton("Толщина ребер");

    private JButton buttonStart = new JButton(new ImageIcon("src\\start.png"));
    private JButton buttonSkip = new JButton(new ImageIcon("src\\skip.png"));
    private JButton nextStep = new JButton(new ImageIcon("src\\next.png"));
    private JButton prevStep = new JButton(new ImageIcon("src\\prev.png"));

    public GUI() {
        super("Kruskal Algorithm");

        this.setBounds(500,200,1000,700);
        this.getContentPane().setLayout(new GridBagLayout());
        this.getContentPane().setBackground(new Color(255, 255, 255));
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        panel1.setBackground(new Color(0, 170, 0));

        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.ipadx = -50;
        c.ipady = 0;
        c.weightx = 1;
        c.weighty = 1;
        c.insets = new Insets(2, 0, 0, 0);

        saveButton.setBackground(new Color(0, 170, 0));
        saveButton.setBorderPainted(false);
        saveButton.setFocusPainted(false);

        panel1.add(saveButton, c);

        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 0;
        c.gridy = 1;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.ipadx = -50;
        c.ipady = 0;
        c.weightx = 1;
        c.weighty = 1;
        c.insets = new Insets(1, 0, 2, 0);

        loadButton.setBackground(new Color(0, 170, 0));
        loadButton.setBorderPainted(false);
        loadButton.setFocusPainted(false);

        panel1.add(loadButton, c);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridBagLayout());
        panel2.setBackground(new Color(0, 170, 0));

        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.ipadx = 5;
        c.ipady = 0;
        c.weightx = 1;
        c.weighty = 1;
        c.insets = new Insets(0, 0, 0, 0);

        colorNodes.setBackground(new Color(0, 120, 0));
        colorNodes.setForeground(new Color(255, 255, 255));
        colorNodes.setBorderPainted(false);
        colorNodes.setFocusPainted(false);

        panel2.add(colorNodes, c);

        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 1;
        c.gridy = 0;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.ipadx = 25;
        c.ipady = 0;
        c.weightx = 1;
        c.weighty = 1;
        c.insets = new Insets(0, 0, 0, 0);

        colorEdge.setBackground(new Color(0, 120, 0));
        colorEdge.setForeground(new Color(255, 255, 255));
        colorEdge.setBorderPainted(false);
        colorEdge.setFocusPainted(false);

        panel2.add(colorEdge, c);

        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 0;
        c.gridy = 1;
        c.gridheight = 1;
        c.gridwidth = 1;
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
        c.gridx = 1;
        c.gridy = 1;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.ipadx = 0;
        c.ipady = 0;
        c.weightx = 1;
        c.weighty = 1;
        c.insets = new Insets(0, 0, 0, 0);

        thickness.setBackground(new Color(0, 120, 0));
        thickness.setForeground(new Color(255, 255, 255));
        thickness.setBorderPainted(false);
        thickness.setFocusPainted(false);

        panel2.add(thickness, c);

        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridBagLayout());
        panel3.setBackground(new Color(0, 170, 0));

        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.ipadx = -50;
        c.ipady = 0;
        c.weightx = 1;
        c.weighty = 1;
        c.insets = new Insets(2, 0, 1, 0);

        prevStep.setBackground(new Color(0, 170, 0));
        prevStep.setBorderPainted(false);
        prevStep.setFocusPainted(false);

        panel3.add(prevStep, c);

        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 1;
        c.gridy = 0;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.ipadx = -50;
        c.ipady = 0;
        c.weightx = 1;
        c.weighty = 1;
        c.insets = new Insets(2, 0, 1, 0);

        nextStep.setBackground(new Color(0, 170, 0));
        nextStep.setBorderPainted(false);
        nextStep.setFocusPainted(false);

        panel3.add(nextStep, c);

        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 0;
        c.gridy = 1;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.ipadx = -50;
        c.ipady = 0;
        c.weightx = 1;
        c.weighty = 1;
        c.insets = new Insets(1, 0, 4, 0);

        buttonStart.setBackground(new Color(0, 170, 0));
        buttonStart.setBorderPainted(false);
        buttonStart.setFocusPainted(false);

        panel3.add(buttonStart, c);

        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 1;
        c.gridy = 1;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.ipadx = -50;
        c.ipady = 0;
        c.weightx = 1;
        c.weighty = 1;
        c.insets = new Insets(0, 0, 2, 0);

        buttonSkip.setBackground(new Color(0, 170, 0));
        buttonSkip.setBorderPainted(false);
        buttonSkip.setFocusPainted(false);

        panel3.add(buttonSkip, c);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,3,0,0));
        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.NORTH;
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.ipadx = 0;
        c.ipady = -55;
        c.weightx = 0;
        c.weighty = 0;
        c.insets = new Insets(0, 0, 0, 0);

        this.add(panel, c);

        JPanel holst = new JPanel();
        holst.setLayout(null);
        holst.setBackground(new Color(0, 0, 0));

        c.fill = GridBagConstraints.BOTH;
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 0;
        c.gridy = 1;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.ipadx = 0;
        c.ipady = 0;
        c.weightx = 1;
        c.weighty = 1;
        c.insets = new Insets(0, 0, 0, 0);

        this.add(holst, c);

        this.addWindowListener(new WindowListener() {
            public void windowActivated(WindowEvent event) {}
            public void windowClosed(WindowEvent event) {}
            public void windowDeactivated(WindowEvent event) {}
            public void windowDeiconified(WindowEvent event) {}
            public void windowIconified(WindowEvent event) {}
            public void windowOpened(WindowEvent event) {}
            public void windowClosing(WindowEvent event) {
                Object[] options = { "Да", "Нет!" };

                int rc = JOptionPane.showOptionDialog(
                        event.getWindow(), "Вы действительно хотите выйти?",
                        "Требуется подтверждение.", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

                if (rc == 0) {
                    event.getWindow().setVisible(false);
                    System.exit(0);
                }
            }

        });
    }

    public static void execute() {
        GUI app = new GUI();
        app.setVisible(true);
    }

}