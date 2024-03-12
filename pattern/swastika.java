import java.util.*;

public class swastika {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any odd number above 3  ");
        int number = input.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == (number / 2) || j == (number / 2) || i < (number / 2) && j == 0
                        || i > (number / 2) && j == number - 1 || i == 0 && j > (number / 2)
                        || i == (number - 1) && j < (number / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        input.close();
    }
}
