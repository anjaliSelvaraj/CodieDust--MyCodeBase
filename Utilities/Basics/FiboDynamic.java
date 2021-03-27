package Utilities.Basics;

/**
 * Created by ANJALI on 5/13/2017.
 */
public class FiboDynamic {
    int fibo(int num) {
        if (num == 0 || num == 1)
            return 1;
        int[] fib = new int[num];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < num; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[num - 1];
    }

    public static void main(String[] args) {
        FiboDynamic fd = new FiboDynamic();
        System.out.println(fd.fibo(11));
    }
}
