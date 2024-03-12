import java.util.*;

public class multiply2Matrix {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter rows of first matrix: ");
        int rows1 = input.nextInt();
        System.out.println("enter column of first matrix:");
        int column1 = input.nextInt();
        float firstMatrix[][] = new float[rows1][column1];
        System.out.println("enter first matrix :");
        for (int i = 0; i < rows1; i++) {

            for (int j = 0; j < column1; j++) {
                firstMatrix[i][j] = input.nextFloat();
            }
        }
        System.out.println("enter rows of second matrix: ");
        int rows2 = input.nextInt();
        System.out.println("enter column of second matrix:");
        int column2 = input.nextInt();
        float secondMatrix[][] = new float[rows2][column2];
        System.out.println("enter  second matrix :");
        for (int i = 0; i < rows2; i++) {

            for (int j = 0; j < column2; j++) {
                secondMatrix[i][j] = input.nextFloat();
            }
        }

        // find the big and small row and

        int bigRow, bigColumn, smallRow, smallColumn;
        if (rows1 > rows2) {
            bigRow = rows1;
            smallRow = rows2;
        } else {
            bigRow = rows2;
            smallRow = rows1;

        }
        if (column1 > column2) {
            bigColumn = column1;
            smallColumn = column2;
        } else {
            bigColumn = column2;
            smallColumn = column1;

        }

        float copyFirst[][] = new float[bigRow][bigColumn];
        float copySecond[][] = new float[bigRow][bigColumn];

        // intialize 0 and copy values to extra column and rows
        for (int i = 0; i < bigRow; i++) {
            for (int j = 0; j < bigColumn; j++) {
                if (i >= rows1 || j >= column1) {
                    copyFirst[i][j] = 0;
                } else {
                    copyFirst[i][j] = firstMatrix[i][j];
                }
                if (i >= rows2 || j >= column2) {
                    copySecond[i][j] = 0;
                } else {
                    copySecond[i][j] = secondMatrix[i][j];
                }
            }
        }

        // print first and second matrix

        System.out.println("\n\nfirst matrix:\n\n");
        for (int i = 0; i < bigRow; i++) {
            for (int j = 0; j < bigColumn; j++) {
                System.out.print(copyFirst[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n\nsecond matrix:\n\n");
        for (int i = 0; i < bigRow; i++) {
            for (int j = 0; j < bigColumn; j++) {
                System.out.print(copySecond[i][j] + "\t");
            }
            System.out.println();
        }

        // create and print product matrix

        float finalMatrix[][] = new float[bigColumn][bigRow];

        for (int i = 0; i < bigRow; i++) {
            for (int j = 0; j < bigColumn; j++) {
                for (int k = 0; k < bigColumn; k++) {

                    finalMatrix[i][j] = finalMatrix[i][j] + (copyFirst[i][k] * copySecond[k][j]);
                }

            }
        }

        System.out.println("the matrix is : ");
        for (int i = 0; i < smallRow; i++) {

            for (int j = 0; j < smallColumn; j++) {
                System.out.print(finalMatrix[i][j] + "\t");
            }
            System.out.println("\n\n");
        }

        input.close();
    }

}


