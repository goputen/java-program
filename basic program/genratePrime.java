import java.util.Scanner;

public class genratePrime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, printNumber = 0;
        System.out.println("enter number till you want to get prime numbers : ");
        number = input.nextInt();
        System.out.println("prime numbers are :");
        for (int i = 2; i <= number; i++) {
            printNumber = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    printNumber = 0;
                    break;
                } 
               
                else {
                    printNumber = 1;
                }
            }
            if(i==2){
                printNumber=1;
            }
            if (printNumber == 1) {
                System.out.print(" "+i);
            }
        }
        if (number == 2) {
            System.out.print(number);
        } else if (number < 2) {
            System.out.print("please input value  2 or above ");
        }
        input.close();
    }
}
// output:
// enter number till you want to get prime numbers : 10
// primes numbers are:
// 2 3 5 7 