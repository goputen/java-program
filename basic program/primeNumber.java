import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number,flag=0;
        System.out.println("enter any number to check prime : ");
        number=input.nextInt();
        for(int i=2;i<number;i++){
            if(number%i==0){
                flag=1;
                System.out.println("number is composite ");
                break;
            }
        }
        if(flag==0){
            System.out.println("number is prime number");
        }

        input.close();
    }
}


// output:
// enter any number to check prime : 23
// number is prime number