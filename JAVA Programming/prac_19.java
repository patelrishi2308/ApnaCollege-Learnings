import java.util.*;

public class prac_19 {

    public static void numberofseven(int matrix1[][]) {
        int count =0;
        for(int i=0; i<matrix1.length; i++){
            for(int j=0; j<matrix1[0].length; j++){
                if (matrix1[i][j] == 7){
                    count ++;
                }
            }
        }
        System.out.println("Number of 7's in given matrix is " + count);
    }


    public static void sumofsecondrow(int matrix2[][]) {
        int sum =0;
        int i=1;
            for(int j=0; j<matrix2[0].length; j++){
                sum += matrix2[i][j];
            }
        System.out.println("Sum of numbers in 2nd row is " + sum);
    }

    public static void printMatrix (int[][] matrix){
        System.out.println("The matrix is: ");
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix [i][j] +" ");
            }
            System.out.println();
        }
    }


    public static void main(String args[]) {
        // Answer1: Print the number of 7’s that are inthe 2d array.
        int matrix1[][] = {{4,7,8},
                          {8,8,7}};
        numberofseven(matrix1); 
        // Answer2: Print out the sum of the numbers inthe second row of the “matrix2” array.
        int matrix2[][] = {{1,4,9},
                           {11,4,3},
                           {2,2,3}};
        sumofsecondrow(matrix2);
        // Answer3: Write a program to FindTransposeofa Matrix.What is Transpose?
        int row=2;
        int column=3;
        int[][] matrix= { {2,3,7}, {5,6,7} };
        // Display original matrix
        printMatrix(matrix);
        // Transpose the matrix
        int[][] transpose = new int [column] [row];
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        // print the transposed matrix
        printMatrix(transpose);
    }
}