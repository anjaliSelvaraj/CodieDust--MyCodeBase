/**
 * Created by ANJALI on 01/30/17.
 */
package Algos;

import java.io.IOException;
import java.util.Scanner;

class ExcelSheetColumn {
    private int generateColNum(char c) {
        int column_no = 0;
        column_no = c - 64;
        return column_no;

    }

    private double generateColNum2(String title) {
        double column_no = 0;
        int l = title.length();
        int index = l - 1;
        int power = 0;
        while (index >= 0) {
            column_no = column_no + (generateColNum(title.charAt(index)) * (Math.pow(26.0d, power)));
            index--;
            power++;
        }
        return column_no;

    }

    private void getTitle() {
        Scanner s = new Scanner(System.in);
        String title = s.next();
        if (title.length() == 1)
            System.out.println(title + " --> " + generateColNum(title.charAt(0)));

        else
            System.out.println(title + " --> " + ((int) (generateColNum2(title))));

    }

    public static void main(String[] args) throws IOException {
        ExcelSheetColumn ea = new ExcelSheetColumn();
        System.out.println("Enter a Column name");
        ea.getTitle();
    }
}

