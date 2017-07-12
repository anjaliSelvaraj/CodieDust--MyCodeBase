package Algos.LinkedList;

import Utilities.Services.Inputs;

/**
 * Created by ANJALI on 6/6/2017.
 */
public class MergeSortedLists {
    /*
    Merge two sorted linked lists and return it as a new list.
    The new list should be made by splicing together the nodes of the first two lists.
     */
    LinkedList list1=new LinkedList();
    LinkedList list2=new LinkedList();

   private LinkedList.Node mergeSortedLists(LinkedList.Node head1, LinkedList.Node head2){

        if(head1==null)
            return head2;
        if(head2==null)
            return head1;

       LinkedList.Node mergedHead=new LinkedList.Node(0);
       if((Integer)head1.data<= (Integer)head2.data){
           mergedHead=head1;
           mergedHead.next=mergeSortedLists(head1.next,head2);
       }
       else {
           mergedHead=head2;
           mergedHead.next=mergeSortedLists(head1,head2.next);
       }

return mergedHead;
    }
    public LinkedList.Node myMergeKSorted(LinkedList.Node[] heads){

       LinkedList merged= new LinkedList();
       merged.head=heads[0];
       int k=heads.length;
       for (int i=1;i<k;i++){
           merged.head=mergeSortedLists(merged.head,heads[i]);
       }
       return merged.head;
    }

    public static void main(String args[])
    {
    MergeSortedLists ms=new MergeSortedLists();
    LinkedList list3 =new LinkedList();
    System.out.println("***MERGE 2 SORTED LISTS***");
    ms.list1=new Inputs().insertNumbersFromTail();
    ms.list2=new Inputs().insertNumbersFromTail();
       list3=new Inputs().insertNumbersFromTail();
    //LinkedList.print(ms.mergeSortedLists(ms.list1.head,ms.list2.head ));
    LinkedList.Node[] nodes={ms.list1.head, ms.list2.head, list3.head};
    LinkedList.print(ms.myMergeKSorted(nodes));
}
}
