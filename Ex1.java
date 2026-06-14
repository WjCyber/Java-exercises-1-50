/* Faça uma calculadora com soma, subtração, multiplicação e divisão. */

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.println("Type the sentence, dont forget the spaces");
    String sentence = sc.nextLine();
    
    String[]parts = sentence.split(" ");

    try {
        double num1 = Double.parseDouble(parts[0]);
        String operator = parts[1];
        double num2 = Double.parseDouble(parts[2]);

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