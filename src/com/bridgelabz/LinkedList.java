package com.bridgelabz;
/**
 * Purpose - To delete the last element in the LinkedList
 * Final sequence to be printed - 56 - 30
 * @author - Sakshi Shetty
 * @version - 16.0
 * @since - 2021-08-18
 */
public class LinkedList {
    public static void main(String[] args) {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.displayNode();
        //To delete the last element in the sequence
        myLinkedList.popLastNode();
        myLinkedList.displayNode();

    }
}
