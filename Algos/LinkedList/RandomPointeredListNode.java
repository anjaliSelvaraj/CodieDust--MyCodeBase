package Algos.LinkedList;

import DataStructures.LinkedList;

/**
 * Created by ANJALI on 7/4/2017.
 */
public class RandomPointeredListNode extends LinkedList {
    public int label;
    public RandomPointeredListNode next, random;

    public RandomPointeredListNode(int x) {
        this.label = x;
    }
}
