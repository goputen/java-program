import java.util.*;

public class largestNumberOfArray {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int rows;
        System.out.println("enter number of rows :");
        rows = input.nextInt();
        float number[] = new float[rows];
        System.out.println("enter your array: ");
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }

        System.out.println("the largest element of array : ");
        float largestNumber = 0;
        for (int i = 0; i < number.length; i++) {
            if (largestNumber < number[i]) {
                largestNumber = number[i];
            }

        }
        System.out.print(largestNumber);

        input.close();
    }

}
