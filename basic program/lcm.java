import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, lcm;
        boolean run=true;
        System.out.printf("enter first number : ");
        number1=input.nextInt();
        System.out.printf("enter second number : ");
        number2=input.nextInt();

        if(number1>=number2){
            lcm=number1;
        }
        else{
            lcm=number2;
        }

        while(run){
            if(lcm%number1==0&&lcm%number2==0){
                run=false;
            }
            else{
                lcm++;
            }
        }
    System.out.printf("lowest common multiple of %d and %d is  = %d ",number1,number2,lcm);
    input.close();
    }
}

//output:
// enter first number : 20
// enter second number : 30
// lowest common multiple of 20 and 30 is = 60 