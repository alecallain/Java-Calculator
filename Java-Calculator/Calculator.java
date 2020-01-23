import javax.swing.*;
import java.util.*;

/**
 * This class simulates a basic calculator.
 * 
 * @author Alec Allain 
 * @version 1/20/20
 */
public class Calculator {
    /**
     * Constructor
     */
    public Calculator() {
        double first = 0;
        double second = 0;
        double result = 0;
    }
    
    public double add(double x, double y) {
        double result = 0;
        result = x + y;
        return result;
    }
    
    public double subtract(double x, double y) {
        double result = 0;
        result = x + y;
        return result;
    }
    
    public double multiply(double x, double y) {
        double result = 0;
        result = x + y;
        return result;
    }
    
    public double divide(double x, double y) {
        double result = 0;
        result = x + y;
        return result;
    }
    
    public static void main (String [] args) {
        Calculator ca = new Calculator();
        Scanner input = new Scanner(System.in);
        String exp = new String();
        double first = 0;
        double second = 0;
        double result = 0;
        System.out.println("Welcome to my Java Calculator");
        while (exp != "exit") {
            System.out.println("Please enter your addition (+), subtraction (-), multiplication (*) or division (/) mathmatical expression");
            exp = input.nextLine();  
            if (exp.contains("+")) {
                result = ca.add(first, second);
            } else if (exp.contains("-")) {
                result = ca.subtract(first, second);
            } else if (exp.contains("*")) {
                result = ca.multiply(first, second);
            } else if (exp.contains("/")) {
                result = ca.divide(first, second);
            }
            System.out.println("The result your expression is " + result);
        }
    }
}
