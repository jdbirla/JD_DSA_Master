package com.jd.log2.LinkedList;


public class InsertingAtBeginning {
	Node head;

    public void addFirst(int val)
    {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = head;

        head = newNode;
    }
    
    public void addLast(int val)
    {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;

        if(head == null)
            head = newNode;
        else
        {
            Node lastNode = head;

            while(lastNode.next != null)
            {
                lastNode = lastNode.next;
            }

            lastNode.next = newNode;
        }
    }
    
    public void delete(int key)
    {
        if(head.data == key)
        {
            head = head.next;
        }
        else
        {
            Node temp = head;

            while(temp.next != null)
            {
                if(temp.next.data == key)
                {
                    temp.next = temp.next.next;
                    break;
                }
                else
                    temp = temp.next;
            }
        }
    }
    public boolean search(int key)
    {
        Node temp = head;

        while(temp != null)
        {
            if(temp.data == key)
                return true;
            temp = temp.next;
        }

        return false;
    }

    public void print()
    {
        Node temp = head;

        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String args[])
    {

    	InsertingAtBeginning list = new InsertingAtBeginning();

        System.out.println("Inserting at Begininng:");

        
          System.out.println("Inserting Element: "+10);
          list.addFirst(10);
          System.out.println("Inserting Element: "+20);
          list.addFirst(20);
          System.out.println("Inserting Element: "+30);
          list.addFirst(30);
          System.out.println("Inserting Element: "+40);
          list.addFirst(40);

          System.out.println("The LinkedList Elements Are:");
          list.print();
          System.out.println("===========================================");

          System.out.println("Inserting at Last:");

          System.out.println("Inserting Element: "+50);
          list.addLast(50);
          System.out.println("Inserting Element: "+60);
          list.addLast(60);
          System.out.println("Inserting Element: "+70);
          list.addLast(70);
          System.out.println("Inserting Element: "+80);
          list.addLast(80);
          
          System.out.println("The LinkedList Elements Are:");
          list.print();
          System.out.println("===========================================");

          System.out.println("The LinkedList Elements Are [Before Deletion]:");
          list.print();

          System.out.println("Deleting Element: "+30);
          list.delete(30);

          System.out.println("The LinkedList Elements Are [After Deletion]:");
          list.print();
          System.out.println("===========================================");

          System.out.println("Searching Element: "+30);
          if(list.search(30))
              System.out.println("Search Found");
          else
              System.out.println("Search Not Found");

          System.out.println("Searching Element: "+100);
          if(list.search(100))
              System.out.println("Search Found");
          else
              System.out.println("Search Not Found");
    }
}
