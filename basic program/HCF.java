import java.util.Scanner;
public class HCF {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int number1,number2,hcf;
        System.out.printf("enter first number : ");
        number1=input.nextInt();
        System.out.printf("enter second number : ");
        number2=input.nextInt();
       if(number1<=number2){
        hcf=number1;
       }
       else{
        hcf=number2;
       }
        while (true) {
            if(number1%hcf==0&&number2%hcf==0){
                break;
            }
            hcf--;
        }
        System.out.printf("HCF of %d and %d is = %d",number1,number2,hcf );
        input.close();
    }
    
}
