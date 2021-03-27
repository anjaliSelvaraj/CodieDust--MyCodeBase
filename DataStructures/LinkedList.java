package DataStructures;

/**
 * Created by ANJALI on 5/17/2017.
 */
public class LinkedList {
    public Node head;

    public static class Node<AnyType> {
        public AnyType data;
        public Node next;

        public Node(AnyType data) {
            this.data = data;
            // this.next=null;
        }
    }

    public static void print(LinkedList.Node n) {
        while (n != null) {
            System.out.print(n.data + "-> ");
            n = n.next;
        }
        System.out.println("null");
    }

    public void print() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + "-> ");
            n = n.next;
        }
        System.out.println("null");
    }

    public void addFromHead(Node newNode) {
        if (head == null) {
            head = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addFromTail(Node newNode) {

        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;

    }

    public void addAfter(Node prevNode, Node newNode) {
        if (prevNode == null || head == null) {
            throw new NullPointerException();
        }
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void deletNode(Node node) {
        Node current = head;
        Node prev = null;
        if (node.data == head.data) {
            head.next = head;
            return;
        }
        while (current != null) {
            if (node.data == current.data) {
                prev.next = current.next;
            }
            prev = current;
            current = current.next;
        }
    }

    public void deleteNode(int pos) {
        //find the node that lies before the node to be deleted and move its next pointer
        Node current = head;
        if (head == null)
            return;

        if (pos == 0) {
            head.next = head;
            return;
        }
        for (int i = 0; current != null && i < pos - 1; i++) {
            current = current.next;
        }
        if (current == null || current.next == null)
            return;

        Node next = current.next.next;
        current.next = next;
    }

    public static int getSize(LinkedList.Node head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }

    public static void main(String[] arg) {
        LinkedList llist = new LinkedList();

        Node head = new Node(5);
        Node first = new Node(8);
        Node second = new Node(3);
        llist.head = head;
        head.next = first;
        first.next = second;
        llist.print();

        llist.addFromHead(new Node('a'));
        llist.print();

        llist.addFromTail(new Node("tail"));
        llist.print();

        llist.addAfter(head, new Node("add after"));
        llist.print();

        llist.deletNode(first);
        llist.print();
    }
    /*public void addLL(String data){
        //add head
        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
        }else {
            newNode.next=head;
            head=newNode;
        }
    }
    public void removeLL(String data){
        Node current=head;
        Node prev=null;
        while(current!=null){
            if(current.data==data)
              prev.next = current.next;
            else{
                prev=current;
                }
            current=current.next;
            }
        }


    public void printLL() {
        Node curr = head;
        while(curr!=null) {
            System.out.print(curr.data +"->");
            curr = curr.next;
        }
        System.out.println("null");

    }*/
}
