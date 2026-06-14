/* Faça uma calculadora com soma, subtração, multiplicação e divisão. */

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Type the sentence, dont forget the spaces");
    String sentence = sc.nextLine();
    
    String[]sentParts = sentence.split(" "); // split the sentence into parts based on spaces

    try {
        double num1 = Double.parseDouble(sentParts[0]); // select i[0] from parts and convert to double
        String operator = sentParts[1]; //select i[1] from parts as operator
        double num2 = Double.parseDouble(sentParts[2]); // select i[2] from parts and convert to double

        double result;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                return;
        }

        System.out.println("Result: " + result);
    } catch (NumberFormatException e) {
        System.out.println("Error: Invalid number format. Please enter valid numbers.");

    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Error: Invalid input format. Please enter in the format 'number operator number'.");
        
    }

    sc.close();
    }
}