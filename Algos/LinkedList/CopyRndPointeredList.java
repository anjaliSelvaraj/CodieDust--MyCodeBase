package Algos.LinkedList;

/**
 * Created by ANJALI on 7/4/2017.
 */
public class CopyRndPointeredList {
    /*
    A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
Return a deep copy of the list.
     */
    private RandomPointeredListNode copy(RandomPointeredListNode head){
        RandomPointeredListNode iter,next;
        iter=head;

        while(iter!=null){
            next=iter.next;

        RandomPointeredListNode copy= new RandomPointeredListNode(iter.label);
            iter.next=copy;
            copy.next=next;

            iter=next;
        }


        iter=head;
        while (iter!=null){
            if(iter.random!=null)
                iter.next.random=iter.random.next;
            iter=iter.next.next;
        }


        iter=head;
        RandomPointeredListNode listCopy=new RandomPointeredListNode(0);
        RandomPointeredListNode copyIter=listCopy,copy;
        while (iter!=null){
            next=iter.next.next;

            copy=iter.next;
            copyIter.next=copy;
            copyIter=copy;

            iter.next=next;
            iter=next;
        }
        return listCopy.next;
    }



    public static void main(String args[]){

    }
}
