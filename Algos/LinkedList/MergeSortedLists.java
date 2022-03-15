package Algos.LinkedList;

import DataStructures.LinkedList;
import Utilities.Services.Inputs;

/**
 * Created by ANJALI on 6/6/2017.
 */
public class MergeSortedLists {
    /*
    Merge two sorted linked lists and return it as a new list.
    The new list should be made by splicing together the nodes of the first two lists.
     */
    LinkedList list1 = new LinkedList();
    LinkedList list2 = new LinkedList();

    public static void main(String[] args) {
        MergeSortedLists ms = new MergeSortedLists();
        LinkedList list3 = new LinkedList();

        System.out.println("***MERGE 2 SORTED LISTS INTO NEW LIST***");
        ms.list1 = new Inputs().insertNumbersFromTail();
        ms.list2 = new Inputs().insertNumbersFromTail();
        System.out.println("RESULT: ");
        LinkedList.print(ms.mergeSortedListsIntoNewList(ms.list1.head,ms.list2.head ));

        System.out.println("***MERGE K SORTED LISTS***");
        ms.list1 = new Inputs().insertNumbersFromTail();
        ms.list2 = new Inputs().insertNumbersFromTail();
        list3 = new Inputs().insertNumbersFromTail();
        System.out.println("RESULT: ");
        LinkedList.Node[] nodes = {ms.list1.head, ms.list2.head, list3.head};
        LinkedList.print(ms.myMergeKSorted(nodes));

        System.out.println("***MERGE 2 SORTED LISTS BY SPLICING***");
        ms.list1 = new Inputs().insertNumbersFromTail();
        ms.list2 = new Inputs().insertNumbersFromTail();
        System.out.println("RESULT: ");
        LinkedList.print(ms.mergeSortedListsIntoNewList(ms.list1.head,ms.list2.head ));
    }

    private LinkedList.Node mergeSortedListsIntoNewList(LinkedList.Node head1, LinkedList.Node head2) {

        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;

        LinkedList.Node mergedHead = new LinkedList.Node(0);
        if ((Integer) head1.data <= (Integer) head2.data) {
            mergedHead = head1;
            mergedHead.next = mergeSortedListsIntoNewList(head1.next, head2);
        } else {
            mergedHead = head2;
            mergedHead.next = mergeSortedListsIntoNewList(head1, head2.next);
        }

        return mergedHead;
    }

    /* You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.

Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

Example 3:
Input: list1 = [], list2 = [0]
Output: [0]

Constraints:
    The number of nodes in both lists is in the range [0, 50].
    -100 <= Node.val <= 100
    Both list1 and list2 are sorted in non-decreasing order.

     */
    private LinkedList.Node mergeSortedListsBySplicing(LinkedList.Node first, LinkedList.Node second) {
        if (first == null) {
            return second;
        }

        if (second == null) {
            return first;
        }

        if ((Integer) first.data <= (Integer) second.data) {
            first.next = mergeSortedListsBySplicing(first.next, second);
            return first;
        } else {
            second.next = mergeSortedListsBySplicing(first, second.next);
        }
        return second;
    }

    private LinkedList.Node myMergeKSorted(LinkedList.Node[] heads) {

        LinkedList merged = new LinkedList();
        merged.head = heads[0];
        int k = heads.length;
        for (int i = 1; i < k; i++) {
            merged.head = mergeSortedListsIntoNewList(merged.head, heads[i]);
        }
        return merged.head;
    }
}
