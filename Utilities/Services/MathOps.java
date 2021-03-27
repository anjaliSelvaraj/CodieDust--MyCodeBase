package Utilities.Services;

import java.util.ArrayList;

/**
 * Created by ANJALI on 4/7/2017.
 */
public class MathOps {

    static int findFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++)
            factorial = factorial * i;
        return factorial;
    }

    static void printFibonacceUptoN(int n) {
        int a = -1, b = 1;
        fiboRec(a, b, n);
    }

    static void fiboRec(int a, int b, int n) {
        if (n > 0) {
            System.out.println("\t " + (a + b));
            fiboRec(b, a + b, n - 1);
        }
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*static boolean isPerfectnumber(int n)
    {
        return true;
    }*/
    static ArrayList<Integer> findFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int num = 2; num <= Math.sqrt(n); num++) {
            if (n % num == 0) {
                factors.add(num);
            }
        }
        return factors;
    }

    public int find2PowerWithoutPowFn(int n) {
        return 1 << n;
    }

    public int divideANumberBy2WithoutDivisionOp(int num) {
        return num >> 1;
    }
}
