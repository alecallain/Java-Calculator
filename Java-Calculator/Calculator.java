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
        result = x - y;
        return result;
    }
    
    public double multiply(double x, double y) {
        double result = 0;
        result = x * y;
        return result;
    }
    
    public double divide(double x, double y) {
        double result = 0;
        result = x / y;
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
        for (;;) {
            System.out.println("Please enter the first number or type 'exit' to leave the application");
            exp = input.nextLine();
            if (exp.contains("exit")) {
                break;
            }
            first = Double.parseDouble(exp);
            System.out.println("Please enter the second number");
            exp = input.nextLine();
            second = Double.parseDouble(exp);
            System.out.println("Now please enter the mathematical expression you would like to use: \nAddition (+ or add), Subtraction (- or subtract), \nMultiplication (* or multiply), or Division (/ or divide)");
            exp = input.nextLine();
            if (exp.contains("+") || exp.contains("add")) {
                result = ca.add(first, second);
                System.out.println("The result of " + first + " + " + second + " is " + result);
            } else if (exp.contains("-") || exp.contains("subtract")) {
                result = ca.subtract(first, second);
                System.out.println("The result of " + first + " - " + second + " is " + result);
            } else if (exp.contains("*") || exp.contains("multiply")) {
                result = ca.multiply(first, second);
                System.out.println("The result of " + first + " * " + second + " is " + result);
            } else if (exp.contains("/") || exp.contains("divide")) {
                result = ca.divide(first, second);
                System.out.println("The result of " + first + " / " + second + " is " + result);
            }
        }
        System.out.println("Goodbye!");
        System.exit(1);
    }
}
