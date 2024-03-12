import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args){
        int number,reminder,copyNumber,sum=0;
        Scanner input =new Scanner(System.in);
        System.out.println("enter number to check armstrong : ");
        number=input.nextInt();
        copyNumber=number;
        while(number!=0){
            reminder=number%10;
            sum=sum+(reminder*reminder*reminder);
            number=number/10;
        }
        if(sum==copyNumber){
            System.out.println("number is armstrong number");
        }
        else{
            System.out.println("number is not armstrong number");

        }
        input.close();
    }
}
// output:
// enter number to check armstrong: 153
// number is armstrong number
