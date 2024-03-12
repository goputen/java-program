import java.util.*;

public class evenOdd {
    public static void checkOddEven(int n){
        int bitmask=1;
if((n&bitmask)==0){
    System.out.println(n+" is even number");
}else{
    System.out.println(n+" is odd number");
}
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("enter any number");
        n=input.nextInt();
        checkOddEven(n);
    input.close();
    }

}
