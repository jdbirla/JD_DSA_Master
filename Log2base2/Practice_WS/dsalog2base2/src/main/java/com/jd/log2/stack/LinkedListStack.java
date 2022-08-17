package com.jd.log2.stack;
class Node
{   
    int data;
    Node next;
}
public class LinkedListStack {
	Node head = null;

    public void push(int val)
    {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = head;

        head = newNode;
    }

    public void pop()
    {
        if(head == null)
            System.out.println("Stack is Empty");
        else
        {
            System.out.println("Popped element = "+head.data);
            head = head.next;
        }
    }
    
    public static void main(String args[])
    {

    	LinkedListStack list = new LinkedListStack();

          list.pop();

          System.out.println("Pushing element: "+10);
          list.push(10);
          System.out.println("Pushing element: "+20);
          list.push(20);
          System.out.println("Pushing element: "+30);
          list.push(30);

          list.pop();
          list.pop();
          list.pop();
          list.pop();
    }
}
