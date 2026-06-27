import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
public class Window extends JFrame {
    // textfield
    private JTextField display;

    // numbers
    private JButton zero;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;

    private double firstNumber;
    private String operator;
    private boolean waitingForSecondNumber = false;


    // operands
    private JButton plus;
    private JButton minus;
    private JButton equals;
    private JButton devide;
    private JButton multiply;
    private JButton clear;

    public Window() {
        setSize(350, 500);
        setLocation(200, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setTitle("Calculator");

        JPanel mainPanel = new JPanel(new MigLayout());
        setContentPane(mainPanel); 

        display = new JTextField(20);
        display.setEditable(false);
        display.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));

        mainPanel.add(display, "span, growx, wrap");

        nine = new JButton("9");
        mainPanel.add(nine);
        eight = new JButton("8");
        mainPanel.add(eight);
        seven = new JButton("7");
        mainPanel.add(seven, "wrap");
        six = new JButton("6");
        mainPanel.add(six);
        five = new JButton("5");
        mainPanel.add(five);
        four = new JButton("4");
        mainPanel.add(four, "wrap");
        three = new JButton("3");
        mainPanel.add(three);
        two = new JButton("2");
        mainPanel.add(two);
        one = new JButton("1");
        mainPanel.add(one, "wrap");
        zero = new JButton("0");
        mainPanel.add(zero, "wrap");

        plus = new JButton("+");
        mainPanel.add(plus);
        minus = new JButton("-");
        mainPanel.add(minus);
        devide = new JButton("/");
        mainPanel.add(devide);
        multiply = new JButton("*");
        mainPanel.add(multiply);
        equals = new JButton("=");
        mainPanel.add(equals);

        clear = new JButton("clear");
        mainPanel.add(clear);

        // action listeners

        zero.addActionListener((ActionEvent e) -> {
            JButton button = (JButton)e.getSource();
            if (waitingForSecondNumber) {
                display.setText(button.getText());
                waitingForSecondNumber = false;
            } else {
                display.setText(display.getText() + button.getText());
            }
        });
        one.addActionListener((ActionEvent e) -> {
            JButton button = (JButton)e.getSource();
            if (waitingForSecondNumber) {
                display.setText(button.getText());
                waitingForSecondNumber = false;
            } else {
                display.setText(display.getText() + button.getText());
            }
        });
        two.addActionListener((ActionEvent e) -> {
            JButton button = (JButton)e.getSource();
            if (waitingForSecondNumber) {
                display.setText(button.getText());
                waitingForSecondNumber = false;
            } else {
                display.setText(display.getText() + button.getText());
            }
        });
        three.addActionListener((ActionEvent e) -> {
            JButton button = (JButton)e.getSource();
            if (waitingForSecondNumber) {
                display.setText(button.getText());
                waitingForSecondNumber = false;
            } else {
                display.setText(display.getText() + button.getText());
            }
        });
        four.addActionListener((ActionEvent e) -> {
            JButton button = (JButton)e.getSource();
            if (waitingForSecondNumber) {
                display.setText(button.getText());
                waitingForSecondNumber = false;
            } else {
                display.setText(display.getText() + button.getText());
            }
        });
        five.addActionListener((ActionEvent e) -> {
            JButton button = (JButton)e.getSource();
            if (waitingForSecondNumber) {
                display.setText(button.getText());
                waitingForSecondNumber = false;
            } else {
                display.setText(display.getText() + button.getText());
            }
        });
        six.addActionListener((ActionEvent e) -> {
            JButton button = (JButton)e.getSource();
            if (waitingForSecondNumber) {
                display.setText(button.getText());
                waitingForSecondNumber = false;
            } else {
                display.setText(display.getText() + button.getText());
            }
        });
        seven.addActionListener((ActionEvent e) -> {
            JButton button = (JButton)e.getSource();
            if (waitingForSecondNumber) {
                display.setText(button.getText());
                waitingForSecondNumber = false;
            } else {
                display.setText(display.getText() + button.getText());
            }
        });
        eight.addActionListener((ActionEvent e) -> {
            JButton button = (JButton)e.getSource();
            if (waitingForSecondNumber) {
                display.setText(button.getText());
                waitingForSecondNumber = false;
            } else {
                display.setText(display.getText() + button.getText());
            }
        });
        nine.addActionListener((ActionEvent e) -> {
            JButton button = (JButton)e.getSource();
            if (waitingForSecondNumber) {
                display.setText(button.getText());
                waitingForSecondNumber = false;
            } else {
                display.setText(display.getText() + button.getText());
            }
        });

        plus.addActionListener((ActionEvent e) -> {
            firstNumber = Double.parseDouble(display.getText());
            operator = "+";
            waitingForSecondNumber = true;
        });
        minus.addActionListener((ActionEvent e) -> {
            firstNumber = Double.parseDouble(display.getText());
            operator = "-";
            waitingForSecondNumber = true;
        });
        devide.addActionListener((ActionEvent e) -> {
            firstNumber = Double.parseDouble(display.getText());
            operator = "/";
            waitingForSecondNumber = true;
              
        });
        multiply.addActionListener((ActionEvent e) -> {
            firstNumber = Double.parseDouble(display.getText());
            operator = "*";
            waitingForSecondNumber = true;

        });
        clear.addActionListener((ActionEvent e) -> {
            display.setText(null);
        });
        equals.addActionListener((ActionEvent e) -> {

            double secondNumber = Double.parseDouble(display.getText());

            double result = 0;

            switch(operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;

                case "-":
                    result = firstNumber - secondNumber;
                    break;

                case "/":
                    result = firstNumber / secondNumber;
                    break;
                    
                case "*":
                    result = firstNumber * secondNumber;
                    break;
            }

            display.setText(String.valueOf(result));
        });
    }
    public static void main(String[] args) {
        new Window().setVisible(true);
    }
}
    

