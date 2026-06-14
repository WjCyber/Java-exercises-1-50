/*  Crie um programa que leia nome, idade e profissão e exiba uma frase formatada(OK) */

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type your name:");
        String name = sc.nextLine();
        System.out.println("Type your age:");
        int age = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.println("Type your profession:");
        String profession = sc.nextLine();

        System.out.println("Hello, my name is " + name + ", I am " + age + " years old and I work as a " + profession + ".");

        sc.close();
    }

}
