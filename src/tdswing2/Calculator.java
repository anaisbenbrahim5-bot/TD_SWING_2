package tdswing2;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField txt = new JTextField();

    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("+");
    JButton b5 = new JButton("-");
    JButton b6 = new JButton("*");
    JButton b7 = new JButton("/");
    JButton b8 = new JButton("=");
    JButton b9 = new JButton("C");

    double num1 = 0, num2 = 0;
    String op = "";

    public Calculator() {
        setTitle("Calculator");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        txt.setEditable(false);
        add(txt, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));

        panel.add(b1); panel.add(b2); panel.add(b3);
        panel.add(b4); panel.add(b5); panel.add(b6);
        panel.add(b7); panel.add(b8); panel.add(b9);

        add(panel, BorderLayout.CENTER);

        // Add listeners
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.matches("[1-3]")) {
            txt.setText(txt.getText() + cmd);
        } else if (cmd.matches("[+\\-*/]")) {
            num1 = Double.parseDouble(txt.getText());
            op = cmd;
            txt.setText("");
        } else if (cmd.equals("=")) {
            num2 = Double.parseDouble(txt.getText());

            double res = 0;
            switch (op) {
                case "+": res = num1 + num2; break;
                case "-": res = num1 - num2; break;
                case "*": res = num1 * num2; break;
                case "/": res = num1 / num2; break;
            }

            txt.setText(String.valueOf(res));
        } else if (cmd.equals("C")) {
            txt.setText("");
            num1 = num2 = 0;
            op = "";
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }

	
	
}
