import java.util.*;


public class clearBit {
    public static void clearBitPos(int number,int pos){
        int bitMask=~(1<<pos);
        int newNumber=number&bitMask;
        System.out.println("the new number is "+newNumber);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter any number");
        int number=input.nextInt();
        System.out.println("enter position to change bit into 0 :");
        int pos=input.nextInt();
        clearBitPos(number,pos);

        input.close();
    }
}
