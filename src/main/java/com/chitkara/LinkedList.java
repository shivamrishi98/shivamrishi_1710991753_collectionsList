package com.chitkara;


public class LinkedList {

    static Node head;
    public int s;
    public static class Node
    {
        int data;
        Node nxt;
    }


    public LinkedList(){
        this.s=10;

        for(int i=0;i<this.s;i++){
            Node node = new Node();
            node.data = i;
            if(i == 0){
                head=new Node();
            }
            else{
                Node n = head;

                while(n.nxt != null)
                {
                    n = n.nxt;
                }
                n.nxt = node;

            }
        }
    }

    public static void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.nxt = null;

        if(head==null)
        {
            head = node;
        } else {
            Node n = head;

            while(n.nxt != null)
            {
                n = n.nxt;
            }
            n.nxt = node;

        }

    }

    public static void insertAtStart(int data)
    {
        Node node = new Node();
        node.data = data;
        node.nxt = head;
        head = node;
    }

    public static void insertAt(int ind,int data)
    {
        Node node = new Node();
        node.data = data;


        if(ind==0)
        {
            insertAtStart(data);
        } else {
            Node n = head;
            for (int i = 0; i < ind - 1; i++) {
                n = n.nxt;
            }
            node.nxt = n.nxt;
            n.nxt = node;

        }
    }

    public static void deleteAtStart()
    {
        head = head.nxt;
    }

    public static void deleteFromEnd()
    {
        Node n = head;
        Node n1 = null;
        if (head==null) {
            System.out.println("Linked List is empty");
        } else {

            while (n.nxt != null) {
                n1 = n;
                n = n.nxt;
            }
            n1.nxt = null;

        }
    }



    public static void deleteAt(int ind)
    {
        Node n = head;
        Node n1 = null;
        if(ind==0)
        {
            deleteAtStart();
        } else {
            for (int i = 0; i < ind - 1; i++) {
                n = n.nxt;
            }
            n1 = n.nxt;
            n.nxt = n1.nxt;
            n1 = null;
        }
    }


    public static void show()
    {
        Node node = head;

        while(node.nxt != null)
        {
            System.out.print(node.data+" ");
            node = node.nxt;
        }
        System.out.print(node.data);
    }


}
