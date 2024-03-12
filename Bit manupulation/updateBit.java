import java.util.*;

public class updateBit {
    public static void updateBitPos(int number,int pos,int bit){
        int bitMask=~(1<<pos);
        number=(number&bitMask);
        bitMask=(bit<<pos);
        number=(number|bitMask);
        System.out.println("the new number is "+number);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any number");
        int number = input.nextInt();
        System.out.println("enter position");
        int pos = input.nextInt();
        System.out.println("enter bit 0 or 1 :");
        int bit = input.nextInt();
        updateBitPos(number, pos, bit);
        input.close();
    }
}
