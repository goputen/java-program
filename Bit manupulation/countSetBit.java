import java.util.*;

public class countSetBit {
    public static int countBit(int number) {
        int count=0;
        while (number!=0) {
            if((number&1)==1){
                count++;
            }
            number=number>>1;
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any number");
        int number = input.nextInt();
        int count = countBit(number);
System.out.println("the number of set bit is "+count);
        input.close();
    }
}
