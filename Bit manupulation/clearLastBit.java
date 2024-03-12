import java.util.*;

public class clearLastBit {
    public static void clearLastIBit(int number, int pos) {
        int bitMask = ~(0) << pos;
        number = number & bitMask;
        System.out.println("number is " + number);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any number ");
        int number = input.nextInt();
        System.out.println("enter position");
        int pos = input.nextInt();
        clearLastIBit(number, pos);

        input.close();
    }
}
