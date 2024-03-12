import java.util.*;
public class setBit {
    public static void setBitPos(int number,int pos){
        int bitmask=1<<pos;
        int newNumber=number|bitmask;
        System.out.println("new number is "+newNumber);
    }
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("enter any number :");
    int number=input.nextInt();
    System.out.println("enter position to convert bit into 1 :");
    int pos=input.nextInt();
    setBitPos(number,pos);

    input.close();
}
    
}