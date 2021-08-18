package com.bridgelabz;
/**
 * Purpose - To create a Linked List
 * @author - Sakshi Shetty
 * @version - 16.0
 * @since - 2021-08-18
 */
public class LinkedList {
    public static void main(String[] args) {
            MyNode<Integer> myFirstNode = new MyNode<>(56);
            MyNode<Integer> mySecondNode = new MyNode<>(30);
            MyNode<Integer> myThirdNode = new MyNode<>(70);
            myFirstNode.setNext(mySecondNode);
            mySecondNode.setNext(myThirdNode);
            boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
            System.out.println(result);
    }
}
