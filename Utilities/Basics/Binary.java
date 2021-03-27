package Utilities.Basics;


/**
 * Created by ANJALI on 6/20/2017.
 */
public class Binary {

    public int countSetBits(int number) {
        int count = 0;
        number = number;
        while (number != 0) {
            //Subtraction of 1 from a number toggles all the bits (from right to left) till the rightmost set bit(including the righmost set bit).
            // So if we subtract a number by 1 and do bitwise & with itself (n & (n-1)), the rightmost set bit can be obtained.
            // If we do n & (n-1) in a loop and count the no of times loop executes we get the set bit count.
            number = number & number - 1;
            count++;
        }
        return count;
    }

    public long binaryDecimalConversion(long number, int toBase) {
        int fromBase = 2;
        if (toBase == 2) {
            //number=0b0+number;
            fromBase = 10;
        }
        long sum = 0;
        //sum is taken as long type because the number range of the int allows it to store the binary value of 1023 only
        int r, power = 0;
        while (number != 0) {
            r = (int) number % toBase;
            sum = sum + r * (long) Math.pow(fromBase, power);
            number = number / toBase;
            power++;
        }
        return sum;
    }
//REFERENCE : https://code.tutsplus.com/articles/understanding-bitwise-operators--active-11301
}
