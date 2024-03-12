import java.util.*;

public class fastExponentiation {
    public static int calculatePow(int number, int pow) {
        int ans = 1;
        while (pow != 0) {
            if ((pow & 1) != 0) {
                ans = ans * number;
            }
            number = number * number;
            pow = pow >> 1;

        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number ");
        int number = input.nextInt();
        System.out.println("enter power ");
        int pow = input.nextInt();
        int ans = calculatePow(number, pow);
        System.out.println("the answer is " + ans);
        input.close();
    }
}
