import java.util.*;

public class clearRangeBit {
    public static void clearRangeBitPos(int number,int startPos,int lastPos){
        int bitMask=(~(0)<<lastPos+1)|(1<<startPos-1);
        number=number&bitMask;
        System.out.println("number is "+number);
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any number ");
        int number = input.nextInt();
        System.out.println("enter starting position");
        int startPos = input.nextInt();
        System.out.println("enter last position");
        int lastPos = input.nextInt();
        clearRangeBitPos(number,startPos,lastPos);
        input.close();
    }
}
