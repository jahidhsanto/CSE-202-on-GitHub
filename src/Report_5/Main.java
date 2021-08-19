package Report_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    Container c;
    JTextField tf1, tf2, tf3;
    JLabel l1, l2, l3;
    JButton add, sub, mul, div;

    Main() {
        initComponent();
    }

    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);

        JTextPane tp = new JTextPane();
        tp.setText("MD. JAHID HASSAN\n201002463\nSection: 201DB\nDept.: CSE");
        tp.setFont(new Font("Courier New", Font.PLAIN, 20));
        tp.setEditable(false);
        tp.setBounds(560, 50, 210, 200);
        c.add(tp);

        l1 = new JLabel("First input: ");
        l1.setBounds(50, 50, 100, 30);
        c.add(l1);
        l2 = new JLabel("Second input: ");
        l2.setBounds(50, 80, 100, 30);
        c.add(l2);
        l3 = new JLabel("Final output: ");
        l3.setOpaque(true);
        l3.setBackground(Color.YELLOW);
        l3.setBounds(50, 150, 100, 30);
        c.add(l3);

        tf1 = new JTextField();
        tf1.setBounds(150, 50, 400, 30);
        c.add(tf1);
        tf2 = new JTextField();
        tf2.setBounds(150, 80, 400, 30);
        c.add(tf2);
        tf3 = new JTextField();
        tf3.setBackground(Color.GREEN);
        tf3.setForeground(Color.BLACK);
        tf3.setBounds(150, 150, 400, 30);
        c.add(tf3);

        add = new JButton("Addition(+)");
        add.setBounds(50, 250, 125, 50);
        c.add(add);
        sub = new JButton("subtractor(-)");
        sub.setBounds(175, 250, 125, 50);
        c.add(sub);
        mul = new JButton("multiply(x)");
        mul.setBounds(300, 250, 125, 50);
        c.add(mul);
        div = new JButton("Division(/)");
        div.setBounds(425, 250, 125, 50);
        c.add(div);

        Handler handler = new Handler();
        add.addActionListener(handler);
        sub.addActionListener(handler);
        mul.addActionListener(handler);
        div.addActionListener(handler);
    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == add) {
                tf3.setText(String.valueOf(Integer.parseInt(tf1.getText()) + Integer.parseInt(tf2.getText())));
            } else if (e.getSource() == sub) {
                tf3.setText(String.valueOf(Integer.parseInt(tf1.getText()) - Integer.parseInt(tf2.getText())));

            } else if (e.getSource() == mul) {
                tf3.setText(String.valueOf(Integer.parseInt(tf1.getText()) * Integer.parseInt(tf2.getText())));

            } else if (e.getSource() == div) {
                tf3.setText(String.valueOf(Integer.parseInt(tf1.getText()) / Integer.parseInt(tf2.getText())));
            }
        }
    }

    public static void main(String[] args) {
        Main frame = new Main();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800, 350);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Jahid Hassan");
    }
}
