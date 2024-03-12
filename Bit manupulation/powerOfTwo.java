import java.util.*;

public class powerOfTwo {
 public static boolean isPowerOfTwo(int number){
    return (number&(number-1))==0;
 }
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
      System.out.println("enter any number to check the power of two: ");
      int number=input.nextInt();
      boolean check=isPowerOfTwo(number);
      System.out.println(check);
      
      input.close();
    }
}