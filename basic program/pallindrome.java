import java.util.Scanner;
public class pallindrome {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int number,copyNumber,reminder,sum=0;
        System.out.println("enter number to check number is pallindrome : ");
        number =input.nextInt();
        copyNumber=number;
        while(number!=0){
            reminder=number%10;
            sum=(sum*10)+reminder;
            number=number/10;
        }
        if(copyNumber==sum){
            System.out.println("number is pallindrome");
        }
        else{
            System.out.println("number is not pallindrome");
        }
        input.close();
    }
}
// output
// enter number to check number is pallindrome : 232
// number is pallindrome