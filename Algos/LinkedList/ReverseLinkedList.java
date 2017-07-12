package Algos.LinkedList;

/**
 * Created by ANJALI on 6/30/2017.
 */
public class ReverseLinkedList {
    public LinkedList.Node reverse(LinkedList.Node current){
        LinkedList.Node rNext=null;
        LinkedList.Node rPrev;
        while (current!=null){
            rPrev=current.next;
            current.next=rNext;

            rNext=current;
            current=rPrev;

        }
        return rNext;
    }

    public LinkedList.Node reverseSecondHalf(LinkedList.Node head){
        int size=LinkedList.getSize(head);

        if(head==null||head.next==null||head.next.next==null)
            return head;

        LinkedList.Node pre=null;
        LinkedList.Node start=head;
        for(int i=0;i<size/2;i++){
          pre=start;
          start=start.next;
        }
        pre.next=reverse(start);
        return head;
    }

    public static void main(String args[]){
        LinkedList list=new LinkedList();
        list.addFromTail(new LinkedList.Node(1));
        list.addFromTail(new LinkedList.Node(2));
        list.addFromTail(new LinkedList.Node(3));
        list.addFromTail(new LinkedList.Node(4));
        list.addFromTail(new LinkedList.Node(5));
        list.addFromTail(new LinkedList.Node(6));
        list.addFromTail(new LinkedList.Node(7));
        list.print();
        ReverseLinkedList rl=new ReverseLinkedList();
        LinkedList.print(rl.reverse(list.head));

    }
}
