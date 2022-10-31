package Assignment1;

import  java.util.Scanner;

class LinkedList3{
    public Node head,tail;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    public void addToHead(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
            tail.next = newNode;
        }
    }

    public void addToTail(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            tail = tail.next;
            tail.next = head;
        }
    }

    public void delFromHead(){
        if(head == null){
            System.out.println("List is empty");
            head = tail = null;
        }else{
            head = head.next;
            tail.next = head;
        }
    }

    public void delFromTail(){
        if (head == null){
            System.out.println("List is empty");
            head = tail = null;
        }else{
            Node tmp = head;
            while (tmp.next != tail){
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
            tail.next = head;
        }
    }

    public void print(){
        Node tmp = head;
        if (head != null)
        {
            do
            {
                System.out.print(tmp.data + " ");
                tmp = tmp.next;
            }
            while (tmp != head);
        }
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {
        LinkedList3 obj = new LinkedList3();
        Scanner sc = new Scanner(System.in);
        int n, data, l;
        System.out.print("1.Add To Head\n" +
                "2.Add To Tail\n" +
                "3.Remove from Head\n" +
                "4.Remove from Tail\n" );
        System.out.println("Enter your choice");
        n = sc.nextInt();
        obj.addToHead(4);
        obj.addToHead(3);
        obj.addToHead(2);
        obj.addToTail(5);
        obj.addToTail(6);
        obj.addToTail(7);
        switch (n){
            case 1: System.out.println("How many data you want to enter");
                 l = sc.nextInt();
                for (int i = 0; i < l; i++) {
                    System.out.println("Enter the data");
                    data = sc.nextInt();
                    obj.addToHead(data);
                }
                obj.print();
                break;

            case 2: System.out.println("How many data you want to enter");
                l = sc.nextInt();
                for (int i = 0; i < l; i++) {
                    System.out.println("Enter the data");
                    data = sc.nextInt();
                    obj.addToTail(data);
                }
                obj.print();
                break;

            case 3: obj.delFromHead();
                    System.out.println("Removed from head");
                    obj.print();
                    break;

            case 4: obj.delFromTail();
                System.out.println("Removed from head");
                obj.print();
                break;
        }
    }
}
