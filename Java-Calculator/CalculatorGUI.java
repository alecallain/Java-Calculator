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
        display = new TextArea();
        add(display);
        
        // creates buttons
        zero = new JButton("0");
        one = new JButton("1");
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
            
        }
        if (e.getSource() == one) {
            
        }
        if (e.getSource() == two) {
            
        }
        if (e.getSource() == three) {
            
        }
        if (e.getSource() == four) {
            
        }
        if (e.getSource() == five) {
            
        }
        if (e.getSource() == six) {
            
        }
        if (e.getSource() == seven) {
            
        }
        if (e.getSource() == eight) {
            
        }
        if (e.getSource() == nine) {
            
        }
        if (e.getSource() == add) {
            
        }
        if (e.getSource() == sub) {
            
        }
        if (e.getSource() == mul) {
            
        }
        if (e.getSource() == div) {
            
        }
        if (e.getSource() == clear) {
            
        }
        if (e.getSource() == sqrt) {
            
        }
        if (e.getSource() == percent) {
            
        }
        if (e.getSource() == period) {
            
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
