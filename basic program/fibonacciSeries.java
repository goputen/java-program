import java.util.Scanner;
public class fibonacciSeries{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1=0,num2=1,num3,count;
        System.out.println("enter number for steps of fibonacci series:");
        count=input.nextInt();
        System.out.print(num1+" "+num2);
        for(int i=0;i<count-2;i++){
            num3=num1+num2;
            System.out.print(" "+num3);
            num1=num2;
            num2=num3;
        }
        input.close();
    }
}

// output:
// enter number for steps of fibonaccis series:10
// 0,1,1,2,3,5,8,13,21,34
