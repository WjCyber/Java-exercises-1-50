/*Leia um número e informe se é par ou ímpar.*/

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type a number:");

        // 1. O loop roda ENQUANTO a próxima entrada NÃO for um número inteiro
        while (!sc.hasNextInt()) {
            System.out.println("Invalid number, try again:");
            sc.next(); // Limpa a entrada inválida do buffer do teclado
        }

        // 2. Agora que garantimos que é um inteiro, podemos ler o valor com segurança
        int userNumber = sc.nextInt();

        // 3. Verifica se é par ou ímpar
        if (userNumber % 2 == 0) {
            System.out.println("This number is even");
        } else {
            System.out.println("This number is odd");
        }
        sc.close();
    }
}