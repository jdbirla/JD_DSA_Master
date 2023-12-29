package com.jd.doublylinkedlist;


import com.jd.linkedlist.LinkedList;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append (int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if(length == 0) return null;
        Node temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if(length == 0) return null;
        Node temp = head;
        if(length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        if (index < length/2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if(temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if(index < 0 || index > length) return false;
        if(index == 0) {
            prepend(value);
            return true;
        }
        if(index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = get(index - 1);
        Node after = before.next;
        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if(index < 0 || index >= length) return null;
        if(index == 0) return removeFirst();
        if(index == length - 1) return removeLast();

        Node temp = get(index);

        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;

        length--;
        return temp;
    }

    public static void main(String[] args) {
       /*  New list test
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(1);
        myDoublyLinkedList.getHead();
        myDoublyLinkedList.getTail();
        myDoublyLinkedList.getLength();
        myDoublyLinkedList.printList();*/

        // Append method test
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(1);
        myDoublyLinkedList.append(20);
        myDoublyLinkedList.append(30);
        myDoublyLinkedList.getHead();
        myDoublyLinkedList.getTail();
        myDoublyLinkedList.getLength();
        myDoublyLinkedList.printList();


        /*
         // RemoveLast method test
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(1);
        myDoublyLinkedList.append(20);
        myDoublyLinkedList.append(30);
        myDoublyLinkedList.getHead();
        myDoublyLinkedList.getTail();
        myDoublyLinkedList.getLength();
        myDoublyLinkedList.printList();
        myDoublyLinkedList.removeLast();
        myDoublyLinkedList.getHead();
        myDoublyLinkedList.getTail();
        myDoublyLinkedList.getLength();
        myDoublyLinkedList.printList();
         */

        /*
        // prepend method test
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(1);
        myDoublyLinkedList.getHead();
        myDoublyLinkedList.getTail();
        myDoublyLinkedList.getLength();
        myDoublyLinkedList.printList();
        myDoublyLinkedList.prepend(5);
        myDoublyLinkedList.getHead();
        myDoublyLinkedList.getTail();
        myDoublyLinkedList.getLength();
        myDoublyLinkedList.printList();
        */

        /*
         // RemoveFirst method test
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(1);
        myDoublyLinkedList.append(5);
        myDoublyLinkedList.getHead();
        myDoublyLinkedList.getTail();
        myDoublyLinkedList.getLength();
        myDoublyLinkedList.printList();
        myDoublyLinkedList.removeFirst();
        myDoublyLinkedList.getHead();
        myDoublyLinkedList.getTail();
        myDoublyLinkedList.getLength();
        myDoublyLinkedList.printList();
         */

        /*
        // get method test
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(1);
        System.out.println(myDoublyLinkedList.get(0));
         */

        /*
        // set method test
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(1);
        System.out.println(myDoublyLinkedList.set(1, 5));
        myDoublyLinkedList.printList();
         */

        /*
        //insert Method test
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(1);
        myDoublyLinkedList.append(5);
        myDoublyLinkedList.append(8);

        myDoublyLinkedList.getHead();
        myDoublyLinkedList.getTail();
        myDoublyLinkedList.getLength();
        myDoublyLinkedList.printList();
        myDoublyLinkedList.insert(1,10);
        myDoublyLinkedList.getHead();
        myDoublyLinkedList.getTail();
        myDoublyLinkedList.getLength();
        myDoublyLinkedList.printList();
         */

        /*
          // remove method test
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(1);
        myDoublyLinkedList.append(5);
        myDoublyLinkedList.append(8);

        myDoublyLinkedList.getHead();
        myDoublyLinkedList.getTail();
        myDoublyLinkedList.getLength();
        myDoublyLinkedList.printList();
        myDoublyLinkedList.remove(1);
        myDoublyLinkedList.getHead();
        myDoublyLinkedList.getTail();
        myDoublyLinkedList.getLength();
        myDoublyLinkedList.printList();
         */



    }

}












