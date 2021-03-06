package com.bridgelabz;

/* Purpose - To create methods for Linked List operation. */
public class MyLinkedList {
    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /*This method is used to add elements to the LinkedList */
    public void add(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }

        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = head;
            head = newNode;
            head.setNext(tempNode);
        }
    }

    /* This method is used to append elements to the LinkedList */
     public void append(INode newNode) {
        if (this.tail == null)
            this.tail = newNode;

        if (this.head == null)
            this.head = newNode;

        else {
            tail.setNext(newNode);
            tail=newNode;
        }
    }

    /* This method is used to insert elements in between two elements in the LinkedList */
    public void insertInMiddle(MyNode myNode, MyNode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    /* This Method to delete first node in LinkedList */
    public void popFirstNode() {
        if(head == null)
            System.out.println("Linked List is empty!");
        else
            head = head.getNext();
    }

    /* This Method to delete last element in the LinkedList */
    public void popLastNode() {
        INode tempNode = head;
        while (tempNode.getNext() != tail) {
            tempNode = tempNode.getNext();
        }
        tempNode.setNext(null);
        tail = tempNode;
    }

    /* This Method to get the position of a element. */
    public void searchElement() {
        if (head == null)
            System.out.println("Linked List is empty");
        else {
            INode tempNode = head;
            int position = 0;
            while (tempNode != null) {
                position++;
                if (tempNode.getKey().equals(30)) {
                    System.out.println("Key value 30 is present at position " + position + " in list");
                }
                tempNode = tempNode.getNext();
            }
        }
    }
    /* This Method to insert a element at particular position.. */
    public void insertAtPosition(int key, int position) {
        MyNode newNode = new MyNode(key);
        MyNode nodeAtPreviousIndex = (MyNode) head;
        for (int i = 0; i < position - 1; i++) {
            nodeAtPreviousIndex = (MyNode) nodeAtPreviousIndex.next;
        }
        newNode.next = nodeAtPreviousIndex.next;
        nodeAtPreviousIndex.next = newNode;

    }
    /* This method is used to delete a element at particular position */
    public void deleteAtPosition(int position) {
        MyNode previousNode = (MyNode) head;
        MyNode currentNode = (MyNode) head;
        for (int i = 0; i < position; i++) {
            previousNode = currentNode;
            currentNode = (MyNode) currentNode.next;
        }
        previousNode.next = currentNode.next;
    }


    /* This method is used to display the sequence */
    public void displayNode () {
         INode current = head;
         System.out.print("Nodes are: ");
            while (current != null) {
                if (current.getNext() != null) {
                    System.out.print(current.getKey() + " - ");
                    current = current.getNext();
                } else {
                    System.out.println(current.getKey());
                    current = current.getNext();
                }
            }
        }
    }


