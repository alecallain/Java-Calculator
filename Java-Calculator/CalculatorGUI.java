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
    
    public CalculatorGUI() {
        calc = new Calculator();
    }
    
    public void actionPerformed (ActionEvent e) {
        
    }
    
    public static void main(String [] args) {
        CalculatorGUI gui = new CalculatorGUI();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setTitle("Java Calculator");
        gui.pack();
        gui.setVisible(true);
    }
}
