package lab5;

import java.util.*;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] expressions = in.nextLine().trim().split("\\s+");

        for (String expr : expressions)
            evaluate(expr);
    }

    private static void evaluate(String expr) {
        StringTokenizer tokenizer = new StringTokenizer(expr, "+-*/", true);

        try {
            String leftString = tokenizer.nextToken();
            String operator = tokenizer.nextToken();
            String rightString = tokenizer.nextToken();

            double leftOperand, rightOperand;

            try {
                leftOperand = Double.parseDouble(leftString);
            } catch (NumberFormatException nfe) {
                System.out.println("The left operand is not a number: " + leftString);
                return;
            }

            try {
                rightOperand = Double.parseDouble(rightString);
            } catch (NumberFormatException nfe) {
                System.out.println("The right operand is not a number: " + rightString);
                return;
            }

            double result;

            switch (operator) {
                case "+": result = leftOperand + rightOperand; break;
                case "-": result = leftOperand - rightOperand; break;
                case "*": result = leftOperand * rightOperand; break;
                case "/":
                    if (rightOperand == 0.0) {
                        System.out.println("Division by zero");
                        return;
                    }
                    result = leftOperand / rightOperand;
                    break;
                default:
                    System.out.println("Unknown operator: " + operator);
                    return;
            }

            System.out.println("Result: " + result);
        } catch (NoSuchElementException nsee) {
            System.out.println("Invalid syntax");
        }
    }
}
