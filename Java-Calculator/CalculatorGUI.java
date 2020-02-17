import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/**
 * This class simulates the graphical user interface for the calculator.
 * 
 * @author Alec Allain
 * @version 1/20/20
 */
public class CalculatorGUI extends JFrame implements ActionListener {
    /** The actual calcualtor object */
    private Calculator calc;
    
    /** Area displaying the numbers */
    private TextArea display;
    private Panel panel;
    
    /** Buttons for numbers and functions */
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
    private JButton add;
    private JButton sub;
    private JButton mul;
    private JButton div;
    private JButton clear;
    private JButton sqrt;
    private JButton percent;
    private JButton period;
    private JButton equals;
    
    /** Menu items for GUI */
    private JMenuBar menu;
    private JMenu fileMenu;
    private JMenuItem quitItem;
    
    /**
     * Constructor
     */
    public CalculatorGUI() {
        // calculator object for implementing mathatical expressions
        calc = new Calculator();
        
        // creates taskbar items 
        menu = new JMenuBar();
        fileMenu = new JMenu("File");
        quitItem = new JMenuItem("Quit");
        
        fileMenu.add(quitItem);
        menu.add(fileMenu);
        setJMenuBar(menu);
        
        // creates display area
        panel = new Panel();
        display = new TextArea(5,45);
        
        // adds grid layout to GUI
        panel.setLayout(new GridBagLayout());
        GridBagConstraints position = new GridBagConstraints();
        
        add(display, "North");
        add(panel, "Center");
        
        
        // creates buttons
        one = new JButton("1");
        position.gridx = 0;
        position.gridy = 1;
        position.gridwidth = 1;
        panel.add(one, position);
        
        two = new JButton("2");
        position.gridx = 1;
        position.gridy = 1;
        position.gridwidth = 1;
        panel.add(two, position);
        
        three = new JButton("3");
        position.gridx = 2;
        position.gridy = 1;
        position.gridwidth = 1;
        panel.add(three, position);
        
        four = new JButton("4");
        position.gridx = 0;
        position.gridy = 2;
        position.gridwidth = 1;
        panel.add(four, position);
        
        five = new JButton("5");
        position.gridx = 1;
        position.gridy = 2;
        position.gridwidth = 1;
        panel.add(five, position);
        
        six = new JButton("6");
        position.gridx = 2;
        position.gridy = 2;
        position.gridwidth = 1;
        panel.add(six, position);
        
        seven = new JButton("7");
        position.gridx = 0;
        position.gridy = 3;
        position.gridwidth = 1;
        panel.add(seven, position);
        
        eight = new JButton("8");
        position.gridx = 1;
        position.gridy = 3;
        position.gridwidth = 1;
        panel.add(eight, position);
        
        nine = new JButton("9");
        position.gridx = 2;
        position.gridy = 3;
        position.gridwidth = 1;
        panel.add(nine, position);
        
        zero = new JButton("0");
        position.gridx = 1;
        position.gridy = 4;
        position.gridwidth = 1;
        panel.add(zero, position);
        
        add = new JButton("+");
        position.gridx = 3;
        position.gridy = 1;
        position.gridwidth = 1;
        panel.add(add, position);
        
        sub = new JButton("-");
        position.gridx = 3;
        position.gridy = 2;
        position.gridwidth = 1;
        panel.add(sub, position);
        
        mul = new JButton("x");
        position.gridx = 3;
        position.gridy = 3;
        position.gridwidth = 1;
        panel.add(mul, position);
        
        div = new JButton("/");
        position.gridx = 3;
        position.gridy = 4;
        position.gridwidth = 1;
        panel.add(div, position);
        
        clear = new JButton("c");
        position.gridx = 0;
        position.gridy = 4;
        position.gridwidth = 1;
        panel.add(clear, position);
        
        sqrt = new JButton("sqrt");
        position.gridx = 1;
        position.gridy = 5;
        position.gridwidth = 1;
        panel.add(sqrt, position);
        
        //percent = new JButton("%");
        //position.gridx = 2;
        //position.gridy = 5;
        //position.gridwidth = 1;
        //panel.add(percent, position);
        
        period = new JButton(".");
        position.gridx = 2;
        position.gridy = 4;
        position.gridwidth = 1;
        panel.add(period, position);
        
        equals = new JButton("=");
        position.gridx = 3;
        position.gridy = 5;
        position.gridwidth = 1;
        panel.add(equals, position);
        
        // adds action listener to buttons and menu items
        quitItem.addActionListener(this);
        zero.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        clear.addActionListener(this);
        sqrt.addActionListener(this);
        //percent.addActionListener(this);
        period.addActionListener(this);
        equals.addActionListener(this);
    }
    
    /**
     * Section dedicated to responding to specific item selections
     * 
     * @param e action event triggered by user
     */
    public void actionPerformed (ActionEvent e) {
        double temp = 0;
        String stringTemp = "";
        //String[] parNums;
        //double[] numb;
        
        if (e.getSource() == quitItem) {
            System.exit(1);
        }
        if (e.getSource() == zero) {
            display.append("0");
        }
        if (e.getSource() == one) {
            display.append("1");
        }
        if (e.getSource() == two) {
            display.append("2");
        }
        if (e.getSource() == three) {
            display.append("3");
        }
        if (e.getSource() == four) {
            display.append("4");
        }
        if (e.getSource() == five) {
            display.append("5");
        }
        if (e.getSource() == six) {
            display.append("6");
        }
        if (e.getSource() == seven) {
            display.append("7");
        }
        if (e.getSource() == eight) {
            display.append("8");
        }
        if (e.getSource() == nine) {
            display.append("9");
        }
        if (e.getSource() == add) {
            display.append(" + ");
        }
        if (e.getSource() == sub) {
            display.append(" - ");
        }
        if (e.getSource() == mul) {
            display.append(" * ");
        }
        if (e.getSource() == div) {
            display.append(" / ");
        }
        if (e.getSource() == clear) {
            display.setText("");
            //display.append("0");
        }
        if (e.getSource() == sqrt) {
            temp = Double.parseDouble(display.getText());
            temp = Math.sqrt(temp);
            stringTemp = Double.toString(temp);
            display.setText(stringTemp);
        }
        //if (e.getSource() == percent) {
        //    
        //}
        if (e.getSource() == period) {
            display.append(".");
        }
        if (e.getSource() == equals) {
            stringTemp = display.getText();
            String[] parNums = stringTemp.split(" ");
            double[] numb = new double[parNums.length];
            for (int i = 0; i < parNums.length; i++) {
                numb[i] = Double.parseDouble(parNums[i]);
            }
            
            for (int i = 0; i < stringTemp.length(); i++) {
                if (stringTemp.charAt(i) == '+') {
                    stringTemp = Double.toString(calc.add(numb[0], numb[1]));
                    display.setText(stringTemp);
                    break;
                } else if (stringTemp.charAt(i) == '-') {
                    stringTemp = Double.toString(calc.subtract(numb[0], numb[1]));
                    display.setText(stringTemp);
                    break;
                } else if (stringTemp.charAt(i) == '*') {
                    stringTemp = Double.toString(calc.multiply(numb[0], numb[1]));
                    display.setText(stringTemp);
                    break;
                } else if (stringTemp.charAt(i) == '/') {
                    stringTemp = Double.toString(calc.divide(numb[0], numb[1]));
                    display.setText(stringTemp);
                    break;
                }
            }
        }
    }
    
    /**
     * Main method
     */
    public static void main(String [] args) {
        CalculatorGUI gui = new CalculatorGUI();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setTitle("Java Calculator");
        gui.pack();
        gui.setVisible(true);
    }
}
