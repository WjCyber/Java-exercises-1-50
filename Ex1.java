//Crie um programa que leia nome, idade e profissão e exiba uma frase 

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    
    

    System.out.println("Welcome! Type your name:");
    String name = sc.nextLine();
    
    System.out.println("Type your age:");
    int age = sc.nextInt();
    sc.nextLine();

    System.out.println("Type your profession:");
    String profession = sc.nextLine();

    System.out.println("Hello " + name + "," + "you are " + age + " years old and work as a " + profession);

    sc.close();
    }
}