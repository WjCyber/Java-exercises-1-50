/*Leia três números e informe o maior. */

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type a number:");
        int number1 = sc.nextInt();
        System.out.println("Type another number:");
        int number2 = sc.nextInt();
        System.out.println("Type a last time:");
        int number3 =sc.nextInt();

    if (number1 >= number2 && number1 >= number3) {
    System.out.println("The largest number ever typed is: " + number1);
    } else if (number2 >= number3) {
    System.out.println("The largest number ever typed is: " + number2);
    } else {
    System.out.println("The largest number ever typed is: " + number3);
    }
        sc.close();
    }
}
