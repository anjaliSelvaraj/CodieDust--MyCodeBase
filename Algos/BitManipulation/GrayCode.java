package Algos.BitManipulation;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ANJALI on 6/22/2017.
 */
public class GrayCode {

    /*
    The gray code is a binary numeral system where two successive values differ in only one bit.
00 - 0
01 - 1
11 - 3
10 - 2*/


    /*
    Given two numbers, find if they are gray code
     */
    public boolean isGrayCode(long number1, long number2) {
        //taking a binary  as bitset does not allow SHIFT OPERATION
        //taking a binary as byte have the range of 127

        long xor = number1 ^ number2;
        int count1 = 0;
        while (xor != 0) {
            xor = xor & xor - 1;
            count1++;
            if (count1 > 1)
                return false;
        }
        return true;
    }

    /*Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.
For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:
00 - 0
01 - 1
11 - 3
10 - 2
Note:
For a given n, a gray code sequence is not uniquely defined.
For example, [0,2,3,1] is also a valid gray code sequence according to the above definition.
     */
    public List<Integer> generateGrayCode(int n) {
        List<Integer> grayCode = new LinkedList<>();
        for (int i = 0; i < 1 << n; i++)
            grayCode.add(i ^ i >> 1);
        // SHIFT OPERATOR has more precedence than the relational operators and logical operators
        return grayCode;
    }


    public static void main(String[] args) {

    }
}
