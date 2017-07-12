import Algos.BitManipulation.GrayCode;
import Utilities.Basics.Binary;
import Utilities.Services.MathOps;

import java.util.Arrays;
import java.util.Deque;

/**
 * Created by ANJALI on 5/10/2017.
 */
public class Buffer {

    public  boolean Happy(Deque<Character> deq) {

        while (!deq.isEmpty()) {

            int count = 0;
            char tmp = deq.peekFirst();
          //  System.out.println("call begin");
            //System.out.println(tmp);
            while (tmp == deq.peekFirst()) {
              //  System.out.println(tmp);
                deq.pollFirst();
                count++;
                if (deq.isEmpty())
                    break;
            }
          //  if (count != map.get(tmp))
           //     return false;
        }

        return true;
    }

    private static int toDecimal(String a) {
        int n = a.length();
        int num = Integer.parseInt(a);
        int power=0,sum=0,r;
        while(num!=0){
            r=num%10;
            sum=sum+r*(int) Math.pow(2,power);
            num=num/10;
            power++;
        }
        return sum;
    }

    private static int toBinary(int num) {
        int power=0,sum=0,r;
        while(num!=0){
            r=num%2;
            sum=sum+r*(int) Math.pow(10,power);
            num=num/2;
            power++;
        }
        return sum;
    }
String[] splited;
    void stringFreq(String A, String B){


    }
    int splitandSort(String str)
    {
        String[] splited= str.split(" ");
        for(String chun:splited)
        {
            Arrays.sort(chun.toCharArray());
             for(char c: chun.toCharArray()){

             }

        }
        return 0;
    }

   int findSmallestCount(char[] temp){
char smallest=temp[0];
int smallestCount=0;
       for(int i=0;i<temp.length-1;i++){
           if(temp[i]==smallest)
               smallestCount++;
           else
               break;
       }
return smallestCount;
   }
   public static void main(String args[]) {
       /* Buffer run = new Buffer();
     //   int res = toBinary(13);
       // System.out.println(res);
       Deque<Character> input = new ArrayDeque<Character>();
       input.addLast('A');
       input.addLast('A');
       input.addLast('R');
       input.addLast('A');
       run.Happy(input);
       */
      Binary b=new Binary();
             GrayCode gc=new GrayCode();
       MathOps m=new MathOps();

             /*System.out.println(b.countSetBits(1111111110));

System.out.println(b.binaryDecimalConversion(5000,2));
System.out.println(1<<1);
       System.out.println(Long.bitCount(9));

       System.out.println(gc.isGrayCode(0,3));
System.out.println(gc.generateGrayCode(5));*/

System.out.println(m.divideANumberBy2WithoutDivisionOp(200));

System.out.println(gc.isGrayCode(0x0a,0x0a));
   }
}
