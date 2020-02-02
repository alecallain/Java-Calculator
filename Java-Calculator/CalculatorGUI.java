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
    private JPanel panel;
    
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
        // adds grid layout to GUI
        setLayout(new GridBagLayout());
        GridBagConstraints position = new GridBagConstraints();
        
        // creates taskbar items 
        menu = new JMenuBar();
        fileMenu = new JMenu("File");
        quitItem = new JMenuItem("Quit");
        
        fileMenu.add(quitItem);
        menu.add(fileMenu);
        setJMenuBar(menu);
        
        // creates text display area
        //panel = new JPanel();
        display = new TextArea(5,45);
        add(display);
        //add(panel, "North");
        
        
        // creates buttons
        zero = new JButton("0");
        
        one = new JButton("1");
        position.gridx = 0;
        position.gridy = 1;
        position.gridwidth = 1;
        add(one, position);
        
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("x");
        div = new JButton("/");
        clear = new JButton("c");
        sqrt = new JButton("sqrt");
        percent = new JButton("%");
        period = new JButton(".");
        
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
        percent.addActionListener(this);
        period.addActionListener(this);
    }
    
    /**
     * Section dedicated to responding to specific item selections
     * 
     * @param e action event triggered by user
     */
    public void actionPerformed (ActionEvent e) {
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
            display.append("+");
        }
        if (e.getSource() == sub) {
            display.append("-");
        }
        if (e.getSource() == mul) {
            display.append("*");
        }
        if (e.getSource() == div) {
            display.append("/");
        }
        if (e.getSource() == clear) {
            display.append("0");
        }
        if (e.getSource() == sqrt) {
            
        }
        if (e.getSource() == percent) {
            
        }
        if (e.getSource() == period) {
            display.append(".");
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
