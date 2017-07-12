package Algos.ArraysAndStrings.Arrays.Matrix;

import java.util.Scanner;

/**
 * Created by ANJALI on 5/9/2017.
 */

/*
Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
 */

public class ZeroMatrix {
/*
At first glance, this problem seems easy:
just iterate through the matrix and every time we see a cell with value zero, set its row and column to 0.
There's one problem with that solution though:
when we come across other cells in that row or column, we'll see the zeros and change their row and column to zero.
Pretty soon, our entire matrix will be set to zeros
 */
  public  int[][] readMatrix()
    {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int r=s.nextInt();

        System.out.println("Enter the number of columns");
        int c=s.nextInt();

        int[][] matrix=new int[r][c];

        System.out.println("Enter the elements");

        for(int i=0;i<r;i++)
        for(int j=0;j<c;j++)
        {
            matrix[i][j]=s.nextInt();
        }
        System.out.println("Given matrix:");
        printMatrix(matrix);
        return matrix;
    }

    int[][] setZeroInPlace(int[][] matrix)
    {
        boolean zeroInFirstRow=false;
        boolean zeroInFirstColumn=false;

        //check if the first row have zero
        for(int i=0;i<matrix.length;i++)
        if(matrix[i][0]==0)
        {
            zeroInFirstColumn=true;
            break;
        }
        // checks if the first column has zero
        for(int j=0;j<matrix[0].length;j++)
                if(matrix[0][j]==0){
                    zeroInFirstRow=true;
                     break;
                }

        //Checking the remaining rows and columns for zeroes. so that the first row and column acts as the marker for the remaining rows.
        for(int i=1;i<matrix.length;i++)
            for(int j=1;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }

            //now, if any value in the first row or column is zero, make the respective row or column zero
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[0].length;j++)
                if(matrix[i][0]==0)
                    nullifyRow(matrix,i);


        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[0].length;j++)
                if(matrix[0][j]==0)
                    nullifyColumn(matrix,j);

            //check for the first row and column to set zeroes.
        if(zeroInFirstColumn)
            nullifyColumn(matrix,0);
        if(zeroInFirstRow)
            nullifyRow(matrix,0);
         return matrix;
    }

    private void nullifyColumn(int[][] matrix, int col) {
      for(int i=0;i<matrix.length;i++)
          matrix[i][col]=0;
    }

    private void nullifyRow(int[][] matrix, int row) {
      for(int j=0;j<matrix[0].length;j++){
          matrix[row][j]=0;
      }

    }
    void printMatrix(int[][] matrix)
    {
        System.out.println("Output matrix");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();
        }

    }


    public static void main(String args[])
    {
       ZeroMatrix zm =new ZeroMatrix();

       System.out.println("***ZERO MATRIX***");
       zm.printMatrix(
               zm.setZeroInPlace(
                       zm.readMatrix()));

    }
}
