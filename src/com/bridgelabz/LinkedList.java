package com.bridgelabz;
/**
 * Purpose - To delete 40 from the Linked list
 * Final sequence to be printed - 56 - 30 - 70
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
        //To insert 40
        myLinkedList.insertAtPosition(40, 2);
        myLinkedList.displayNode();
        // Deleting 40.
        myLinkedList.deleteAtPosition(2);
        myLinkedList.displayNode();

    }
}
