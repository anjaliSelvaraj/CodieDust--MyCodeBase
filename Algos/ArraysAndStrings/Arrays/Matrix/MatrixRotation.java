package Algos.ArraysAndStrings.Arrays.Matrix;

import java.util.Scanner;

/**
 * Created by ANJALI on 5/10/2017.
 */
 /*Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
    write a method to rotate the image by 90 degrees.
    Can you do this in place? */
public class MatrixRotation {
    int[][] sqrMatrix;

    int[][] getSquareMatrix() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the row and column for the square matrix");
        int n = s.nextInt();
        sqrMatrix = new int[n][n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                sqrMatrix[i][j] = s.nextInt();
            }
        System.out.println("Given matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(sqrMatrix[i][j] + " ");
            System.out.println();

        }
        return sqrMatrix;
    }

    // swap on each layer, starting from the outermost layer and working our way inwards.
    int[][] rotateMatrix(int[][] sqrMatrix) {
        int n = sqrMatrix.length;
        for (int layer = 0; layer < n / 2; layer++) { // starting from the outer layer
            int firstRow = layer; // the row of the first element
            int lastCol = (n - 1) - layer;
            for (int i = firstRow; i < lastCol; i++) {
                int offset = i - firstRow; // to keep the count of number of elements in  edge got swapped

                //Swapping
                int tempTop = sqrMatrix[firstRow][i];

                //swapping top and left
                sqrMatrix[firstRow][i] = sqrMatrix[lastCol - offset][firstRow];

                //swapping left and bottom edge indices
                sqrMatrix[lastCol - offset][firstRow] = sqrMatrix[lastCol][lastCol - offset];

                //swapping bottom and right edge indices
                sqrMatrix[lastCol][lastCol - offset] = sqrMatrix[i][lastCol];

                //temporary to top
                sqrMatrix[i][lastCol] = tempTop;
            }
        }
        return sqrMatrix;
    }


    public static void main(String[] args) {
        MatrixRotation mr = new MatrixRotation();
        System.out.println("***MATRIX ROTATION***");

        ZeroMatrix zm = new ZeroMatrix();
        zm.printMatrix(
                mr.rotateMatrix(
                        mr.getSquareMatrix()));
    }
}
