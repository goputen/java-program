import java.util.Scanner;

public class reversNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, reminder, newNumber = 0;
        System.out.println("enter any number to reverse :");
        number = input.nextInt();
        while (number != 0) {
            reminder = number % 10;
            newNumber = (newNumber * 10) + reminder;
            number = number / 10;
        }
        System.out.println("revers number is : " + newNumber);

        input.close();
    }
}

// output:
// enter any number to reverse : 123
// revers number is : 321