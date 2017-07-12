package Algos.LinkedList;

/**
 * Created by ANJALI on 7/5/2017.
 */
public class IntersectionNode {

    public LinkedList.Node getIntersectionNode(LinkedList.Node headA, LinkedList.Node headB) {
        //boundary check
        System.out.println("--");
        if(headA == null || headB == null) return null;

        LinkedList.Node a = headA;
        LinkedList.Node b = headB;
System.out.println("----");
        //if a & b have different len, then we will stop the loop after second iteration
        while( a != b){
            //for the end of first iteration, we just reset the pointer to the head of another linkedlist
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;
        }
System.out.println(a.data);
        return a;
    }
    public static void main(String args[]){
        IntersectionNode is=new IntersectionNode();
LinkedList A=new LinkedList();
LinkedList.Node second=new LinkedList.Node(2);
        LinkedList.Node third=new LinkedList.Node(3);
        LinkedList.Node fourth=new LinkedList.Node(4);
        LinkedList.Node fifth=new LinkedList.Node(5);
        //LinkedList.Node second=new LinkedList.Node(2);


A.addFromTail(new LinkedList.Node(1));
        A.addFromTail(second);
        A.addFromTail(third);
        A.addFromTail(fourth);
        A.addFromTail(fifth);

        LinkedList B=new LinkedList();
        B.addFromTail(new LinkedList.Node(0));
        B.addFromTail(new LinkedList.Node(11));
        B.addFromTail(second);
        B.addFromTail(third);
        B.addFromTail(fourth);
        B.addFromTail(fifth);

       // System.out.println((
        is.getIntersectionNode(A.head,B.head);
        // .data));


    }
}
