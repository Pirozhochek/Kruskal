package GUI;
import Graph.*;
//import Graph.Graph;
//import Graph.Node;
//import Graph.Edge;
import Kruskal.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private JButton saveButton = new JButton(new ImageIcon("src\\save.png"));
    private JButton loadButton = new JButton(new ImageIcon("src\\load.png"));

    private JButton colorNodes = new JButton("Цвет вершин");
    private JButton colorEdge = new JButton("Цвет ребер");
    private JButton colorFlood = new JButton("Стереть");
    private JButton thickness = new JButton("Толщина ребер");

    private JButton buttonStart = new JButton(new ImageIcon("src\\start.png"));
    private JButton buttonSkip = new JButton(new ImageIcon("src\\skip.png"));
    private JButton nextStep = new JButton(new ImageIcon("src\\next.png"));
    private JButton prevStep = new JButton(new ImageIcon("src\\prev.png"));

    boolean flag2 = false;
    Node saveNode = new Node();
    int index = 0;

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
        c.ipadx = 35;
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

        jPanel2 holst = new jPanel2();

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
        colorEdge.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color color=JColorChooser.showDialog(null, "Выберите цвет", new Color(255,255,255));
                holst.colorEdge = color;
                holst.repaint();
            }
        });

        colorNodes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color color=JColorChooser.showDialog(null, "Выберите цвет", new Color(255,255,255));
                holst.colorNode = color;
                holst.repaint();
            }
        });

        buttonStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Graph ready = new Graph(holst.testListEdges, holst.testList);
                if ((ready.isConnected())) {
                    ready = Kruskal.KruskalAnalyze(ready);
                    holst.testListEdges = new ArrayList<Edge>();
                    holst.after = ready.getEdgeList();
                }
                holst.repaint();
            }
        });

        nextStep.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                holst.testListEdges.add(holst.after.get(index));
                ++index;
                holst.repaint();
            }
        });

        prevStep.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                holst.testListEdges.remove(index-1);
                --index;
                holst.repaint();
            }
        });

        buttonSkip.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Graph ready = new Graph(holst.testListEdges, holst.testList);
                if ((ready.isConnected())) {
                    ready = Kruskal.KruskalAnalyze(ready);
                    holst.testListEdges = ready.getEdgeList();
                }
                holst.repaint();
            }

        });

        colorFlood.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                holst.testListEdges = new ArrayList<Edge>();
                holst.testList = new ArrayList<Node>();
                holst.repaint();
            }
        });

        /*loadButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Graph ready = new Graph(holst.testListEdges, holst.testList);
                if ((ready.isConnected())) {
                    ready = Kruskal.KruskalAnalyze(ready);
                    holst.testListEdges = ready.getEdgeList();
                }
                holst.repaint();
            }

        });*/


        holst.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                boolean flag = true;
                for (Node v : holst.testList){
                    if  (Math.sqrt((v.getX()-evt.getX())*(v.getX()-evt.getX())+(v.getY()-evt.getY())*(v.getY()-evt.getY()))<25){
                        flag = false;
                        if (flag2) {
                            try{
                            int askedWeight = Integer.parseInt( JOptionPane.showInputDialog(null, "Введите вес ребра", "", JOptionPane.PLAIN_MESSAGE));

                            holst.testListEdges.add(new Edge(saveNode, v, askedWeight));
                            flag2 = false;
                            break;
                            }
                            catch(NumberFormatException e){
                            JOptionPane.showMessageDialog(null, "Требуется целочисленное значение!", "Ошибка", JOptionPane.PLAIN_MESSAGE);
                            flag2 = false;
                            break;
                            }
                            finally{
                            }
                        }
                        saveNode = v;
                        flag2 = true;
                        break;
                    }

                    else if (Math.sqrt((v.getX()-evt.getX())*(v.getX()-evt.getX())+(v.getY()-evt.getY())*(v.getY()-evt.getY()))<50){
                        flag = false;
                        flag2 = false;
                        break;
                    }
               }
                if (flag) {
                    holst.testList.add(new Node(evt.getX(), evt.getY()));
                    flag2 = false;
                }
                holst.repaint();
            }
        });

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
                        "Требуется подтверждение", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

                if (rc == 0) {
                    event.getWindow().setVisible(false);
                    System.exit(0);
                }
            }

        });
    }

    public class jPanel2 extends JPanel {
        ArrayList<Node> testList = new ArrayList<Node>();
        ArrayList<Edge> testListEdges = new ArrayList<Edge>();
        ArrayList<Edge> after = new ArrayList<Edge>();
        Color colorEdge = new Color(255, 255, 255);
        Color colorNode = new Color(255, 255, 255);
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(colorEdge);
            for (Edge p : testListEdges){
                g.drawLine(p.getFirst().getX(), p.getFirst().getY(), p.getSecond().getX(), p.getSecond().getY());
                g.drawString(Integer.toString(p.getWeight()),
                        (p.getFirst().getX() + p.getSecond().getX()) / 2 ,
                        (p.getFirst().getY() + p.getSecond().getY()) / 2 );
            }
            g.setColor(colorNode);
            for (Node a : testList){
                g.fillOval(a.getX()-25, a.getY()-25, 50, 50);
            }
        }
    }

    public static void execute() {
        GUI app = new GUI();
        app.setVisible(true);
    }

}