package Calculator_Project_For_Section_C;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    Container c;
    Font font1, font2;
    JTextField tf1, tf2;
    JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    JButton btn_add, btn_sub, btn_mul, btn_div;
    JButton Clear, ON, OFF, dot, equal;

    //class constants
    private static final int HEIGHT = 600;
    private static final int WIDTH = 450;
    //private static final Color BUTTON_COLOUR1 = Color.WHITE;
    private static final int TEXTFIELD_HEIGHT = 75;
    private static final int TEXTFIELD_WIDTH = 398;

    private static final int BUTTON_HEIGHT = 68;
    private static final int BUTTON_WIDTH = 68;


    Calculator() {
        initComponent();
    }

    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);
        font1 = new Font("Digital-7", Font.PLAIN, 36);
        font2 = new Font("Helvetica Rounded", Font.PLAIN, 20);

        // Create an input text field.=======================================
        tf1 = new JTextField();
        tf1.setBackground(Color.WHITE);
        tf1.setBounds(27, 24, TEXTFIELD_WIDTH, TEXTFIELD_HEIGHT);
        tf1.setFont(font1);
        tf1.setHorizontalAlignment(JTextField.RIGHT);
        tf1.setEditable(false);
        c.add(tf1);

        // Create an output text field.=======================================
        tf2 = new JTextField("Jahid Hassan Santo");
        tf2.setBackground(Color.WHITE);
        tf2.setBounds(27, 114, TEXTFIELD_WIDTH, TEXTFIELD_HEIGHT);
        tf2.setFont(font1);
        tf2.setEditable(false);
        c.add(tf2);


        // Create Button for 7================================================
        btn7 = new JButton("7");
        btn7.setBounds(27, 233, BUTTON_WIDTH, BUTTON_HEIGHT);
        btn7.setFont(font2);
        c.add(btn7);
        // Create Button for 8================================================
        btn8 = new JButton("8");
        btn8.setBounds(109, 233, BUTTON_WIDTH, BUTTON_HEIGHT);
        btn8.setFont(font2);
        c.add(btn8);
        // Create Button for 9================================================
        btn9 = new JButton("9");
        btn9.setBounds(191, 233, BUTTON_WIDTH, BUTTON_HEIGHT);
        btn9.setFont(font2);
        c.add(btn9);
        // Create Button for CLEAR================================================
        Clear = new JButton("C");
        Clear.setBounds(274, 233, BUTTON_WIDTH, BUTTON_HEIGHT);
        Clear.setBackground(Color.MAGENTA);
        Clear.setFont(font2);
        c.add(Clear);
        // Create Button for ON================================================
        ON = new JButton("ON");
        ON.setBounds(356, 233, 34, BUTTON_HEIGHT);
        ON.setBackground(Color.GREEN);
        //ON.setFont(font2);
        c.add(ON);
        OFF = new JButton("OFF");
        OFF.setBounds(390, 233, 34, BUTTON_HEIGHT);
        OFF.setBackground(Color.RED);
        //OFF.setFont(font2);
        c.add(OFF);

        // Create Button for 4================================================
        btn4 = new JButton("4");
        btn4.setBounds(27, 315, BUTTON_WIDTH, BUTTON_HEIGHT);
        btn4.setFont(font2);
        c.add(btn4);
        // Create Button for 5================================================
        btn5 = new JButton("5");
        btn5.setBounds(109, 315, BUTTON_WIDTH, BUTTON_HEIGHT);
        btn5.setFont(font2);
        c.add(btn5);
        // Create Button for 6================================================
        btn6 = new JButton("6");
        btn6.setBounds(191, 315, BUTTON_WIDTH, BUTTON_HEIGHT);
        btn6.setFont(font2);
        c.add(btn6);
        // Create Button for X================================================
        btn_mul = new JButton("x");
        btn_mul.setBounds(274, 315, BUTTON_WIDTH, BUTTON_HEIGHT);
        btn_mul.setBackground(Color.ORANGE);
        btn_mul.setFont(font2);
        c.add(btn_mul);
        // Create Button for /================================================
        btn_div = new JButton("/");
        btn_div.setBounds(356, 315, BUTTON_WIDTH, BUTTON_HEIGHT);
        btn_div.setBackground(Color.ORANGE);
        btn_div.setFont(font2);
        c.add(btn_div);

        // Create Button for 1================================================
        btn1 = new JButton("1");
        btn1.setBounds(27, 398, BUTTON_WIDTH, BUTTON_HEIGHT);
        btn1.setFont(font2);
        c.add(btn1);
        // Create Button for 2================================================
        btn2 = new JButton("2");
        btn2.setBounds(109, 398, BUTTON_WIDTH, BUTTON_HEIGHT);
        btn2.setFont(font2);
        c.add(btn2);
        // Create Button for 3================================================
        btn3 = new JButton("3");
        btn3.setBounds(191, 398, BUTTON_WIDTH, BUTTON_HEIGHT);
        btn3.setFont(font2);
        c.add(btn3);
        // Create Button for +================================================
        btn_add = new JButton("+");
        btn_add.setBounds(274, 398, BUTTON_WIDTH, BUTTON_HEIGHT);
        btn_add.setBackground(Color.ORANGE);
        btn_add.setFont(font2);
        c.add(btn_add);
        // Create Button for -================================================
        btn_sub = new JButton("-");
        btn_sub.setBounds(356, 398, BUTTON_WIDTH, BUTTON_HEIGHT);
        btn_sub.setBackground(Color.ORANGE);
        btn_sub.setFont(font2);
        c.add(btn_sub);

        // Create Button for 0================================================
        btn0 = new JButton("0");
        btn0.setBounds(27, 480, 150, BUTTON_HEIGHT);
        btn0.setFont(font2);
        c.add(btn0);
        // Create Button for .================================================
        dot = new JButton(".");
        dot.setBounds(191, 480, BUTTON_WIDTH, BUTTON_HEIGHT);
        dot.setFont(font2);
        c.add(dot);
        // Create Button for = ================================================
        equal = new JButton("=");
        equal.setBounds(274, 480, 150, BUTTON_HEIGHT);
        equal.setBackground(Color.LIGHT_GRAY);
        equal.setFont(font2);
        c.add(equal);


        // ActionListener ==============================================================
        OFF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tf1.setText("Calculator is OFF");
                tf1.setEnabled(false);

                ON.setEnabled(true);
                OFF.setEnabled(false);

                btn0.setEnabled(false);
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
                btn5.setEnabled(false);
                btn6.setEnabled(false);
                btn7.setEnabled(false);
                btn8.setEnabled(false);
                btn9.setEnabled(false);

                btn_add.setEnabled(false);
                btn_mul.setEnabled(false);
                btn_sub.setEnabled(false);
                btn_div.setEnabled(false);

                Clear.setEnabled(false);
                dot.setEnabled(false);
                equal.setEnabled(false);

            }
        });
        ON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText("");
                tf1.setEnabled(true);

                OFF.setEnabled(true);

                btn0.setEnabled(true);
                btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);
                btn7.setEnabled(true);
                btn8.setEnabled(true);
                btn9.setEnabled(true);
                btn_add.setEnabled(true);
                btn_mul.setEnabled(true);
                btn_sub.setEnabled(true);
                btn_div.setEnabled(true);
                Clear.setEnabled(true);
                dot.setEnabled(true);
                equal.setEnabled(true);

            }
        });

        Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText("");
            }
        });
        dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText(tf1.getText() + ".");
            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText(tf1.getText() + "0");
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText(tf1.getText() + "1");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText(tf1.getText() + "2");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText(tf1.getText() + "3");
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText(tf1.getText() + "4");
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText(tf1.getText() + "5");
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText(tf1.getText() + "6");
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText(tf1.getText() + "7");
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText(tf1.getText() + "8");
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText(tf1.getText() + "9");
            }
        });

        btn_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText(tf1.getText() + "+");
            }
        });
        btn_sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText(tf1.getText() + "-");
            }
        });
        btn_mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText(tf1.getText() + "*");
            }
        });
        btn_div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText(tf1.getText() + "/");
            }
        });


        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = tf1.getText();
                tf1.setText(Integer.toString(Calculator.evaluate(str)));
            }
        });

    }

    // This Section for EQUAL= Button=======================================================================================
    public static int evaluate(String expression) {
        char[] tokens = expression.toCharArray();
        int x = 0, y = 0;
        char op = 0;

        for (int i = 0; i < tokens.length; i++) {

            // Current token is a number,
            // push it to stack for numbers
            if (tokens[i] >= '0' && tokens[i] <= '9') {
                StringBuffer sbuf = new StringBuffer();

                // There may be more than one digits in number
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
                    sbuf.append(tokens[i++]);
                if (op == 0) {
                    x = Integer.parseInt(sbuf.toString());
                } else {
                    y = Integer.parseInt(sbuf.toString());
                }
                i--;
            }

            // Current token is an operator.
            else if (tokens[i] == '+' ||
                    tokens[i] == '-' ||
                    tokens[i] == '*' ||
                    tokens[i] == '/') {

                op = tokens[i];
            }
        }
        JOptionPane.showMessageDialog(null, x + " " + op + " " + y);

        return applyOp(op, x, y);
    }


    // A utility method to apply an
    // operator 'op' on operands 'a'
    // and 'b'. Return the result.
    public static int applyOp(char op, int b, int a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0)
                    throw new UnsupportedOperationException("Cannot divide by zero");
                return a / b;
        }
        return 0;
    }
// This Section for EQUAL= Button=======================================================================================

    public static void main(String[] args) {
        Calculator frame = new Calculator();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setTitle("JAHID HASSAN SANTO");
        frame.setResizable(false);

    }
}
