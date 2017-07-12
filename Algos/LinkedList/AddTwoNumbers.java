package Algos.LinkedList;

/**
 * Created by ANJALI on 7/5/2017.
 */
public class AddTwoNumbers {
    /*
    You are given two non-empty linked lists representing two non-negative integers.
    The digits are stored in reverse order and each of their nodes contain a single digit.
    Add the two numbers and return it as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
     */

   LinkedList.Node add2numbers(LinkedList.Node l1,LinkedList.Node l2){
       LinkedList.Node sum=new LinkedList.Node(0);
       int iSum=0;

       LinkedList.Node l1Iter=l1;
       LinkedList.Node l2Iter=l2;
       LinkedList.Node sumIter=sum;


       while(l1Iter!=null || l2Iter!=null)
       {
           //System.out.println(l1Iter.data+ " " + l2Iter.data+ " = "+ iSum);
          if(l2Iter!=null){
              iSum=iSum+(Integer)l2Iter.data;
              l2Iter=l2Iter.next;
          }
          if(l1Iter!=null){
              iSum=iSum+(Integer)l1Iter.data;
              l1Iter=l1Iter.next;
          }
           sumIter.next=new LinkedList.Node(iSum%10);
           iSum=iSum/10;
           sumIter=sumIter.next;
       }
       return sum.next;
   }

   public static void main(String args[]){
       AddTwoNumbers a2=new AddTwoNumbers();
       System.out.println("***ADD 2 NUMBERS***");
       LinkedList l1=new LinkedList();
       l1.addFromTail(new LinkedList.Node(2));
       l1.addFromTail(new LinkedList.Node(4));
       l1.addFromTail(new LinkedList.Node(3));

       LinkedList l2=new LinkedList();
       l2.addFromTail(new LinkedList.Node(5));
       l2.addFromTail(new LinkedList.Node(6));
       //l2.addFromTail(new LinkedList.Node(4));

       LinkedList.print(a2.add2numbers(l1.head,l2.head));
   }
}
