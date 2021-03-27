package Algos.ArraysAndStrings.Arrays.Matrix;

import Utilities.Services.Inputs;

/**
 * Created by ANJALI on 6/14/2017.
 */
public class NumberOfIslands {
    /*
    Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
Example 1:
11110
11010
11000
00000
Answer: 1
Example 2:
11000
11000
00100
00011
Answer: 3
     */

    int r, c;

    private int findNumOfIslands(int[][] grid) {
        r = grid.length;
        if (r == 0) return 0;
        c = grid[0].length;
        int numOfIslands = 0;
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (grid[i][j] == 1) {
                    connectLands(grid, i, j);
                    numOfIslands++;
                }


        return numOfIslands;
    }

    private void connectLands(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i > r || j > c || grid[i][j] != 1)
            return;
        grid[i][j] = 1;
        connectLands(grid, i + 1, j);
        connectLands(grid, i - 1, j);
        connectLands(grid, i, j + 1);
        connectLands(grid, i, j - 1);
    }

    private static void main(String[] args) {
        NumberOfIslands ni = new NumberOfIslands();
        ni.findNumOfIslands(new Inputs().get2DIntMatrix());

    }

}
/*
REFERENCE:
http://javabypatel.blogspot.in/2016/08/find-number-of-islands-using-dfs.html
 */