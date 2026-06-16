import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);



        System.out.println("Type a number between 0 and 10, we will calculate the factorial of it: ");
        int numberUser = sc.nextInt();

        while(numberUser <0 || numberUser >10) {
            System.out.println("Invalid number, try again(between 0 and 10)");
            numberUser = sc.nextInt();
        }
        
        if (numberUser == 0) {
            System.out.println("The factorial of 0 and 1 is: 1");
            return;
        }

        int factorial = 1;
        for(int i = 1; i<=numberUser; i++){
            factorial*=i;
        }       

        System.out.println("The factorial of " + numberUser + " is: " + factorial);



    }
}
