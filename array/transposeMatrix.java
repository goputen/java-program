import java.util.*;

public class transposeMatrix {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter no of rows");
        int rows = input.nextInt();
        System.out.println("enter no of columns");
        int columns = input.nextInt();
        float matrix[][] = new float[rows][columns];
        System.out.println("enter matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextFloat();
            }
        }

// tanspose matrix

float transpose[][]=new float[columns][rows];
for(int i=0;i<rows;i++){
    for(int j=0;j<columns;j++){
        transpose[j][i]=matrix[i][j];
    }
}

        System.out.println("orignal matrix \n");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
            input.close();
        }

        System.out.println("transpose matrix:\n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= columns; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
            input.close();
        }
    }
}