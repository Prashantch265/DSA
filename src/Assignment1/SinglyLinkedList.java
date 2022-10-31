package Assignment1;

import java.util.Scanner;

class LinkedList1{
    public Node head, tail;

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    public LinkedList1(){
        head = tail = null;
    }

    public void addToHead(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
            head.next = newNode.next;
        }
    }

    public void addToTail(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
            tail.next = null;
        }
    }

    public void addToPosition(int position, int data){
        Node newNode = new Node(data);
        if(head == null){
            System.out.println("list is empty");
            head = tail = newNode;
        }else if(position == 1){
            addToHead(data);
            return;
        }else {
            Node tmp = head;
            for (int i = 1; i < position-1 ; i++) {
                tmp = tmp.next;
                if (tmp == null){
                    System.out.println("invalid position");
                    return;
                }
            }
            newNode.next = tmp.next;
            tmp.next = newNode;
        }
    }

    public void removeFromHead(){
        if(head == tail)
        {
            head = tail = null;
        }
        head = head.next;
    }

    public void removeFromTail(){
        if (head == tail){
            head = tail = null;
        }
        Node tmp = head;
        while (tmp.next != tail){
            tmp = tmp.next;
        }
        tail = tmp;
        tail.next = null;
    }

    public void removeFromPosition(int position){
        if(head == null){
            System.out.println("list is empty");
            head = tail = null;
        }else if(position == 1){
            removeFromHead();
            return;
        }else {
            Node tmp = head;
            for (int i = 1; i < position-1 ; i++) {
                tmp = tmp.next;
                if (tmp == null){
                    System.out.println("invalid position");
                    break;
                }
            }
            tmp.next = tmp.next.next;
        }
    }

    public void print(){
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}

public class SinglyLinkedList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList1 obj = new LinkedList1();

        obj.addToHead(4);
        obj.addToHead(3);
        obj.addToHead(2);
        obj.addToTail(5);
        obj.addToTail(6);
        obj.addToTail(7);
//        obj.print();

        int n,info,l;
        System.out.print("1.Add To Head\n2.Add To Tail\n3.Add to any position\n4.Remove from Head\n5.Remove from Tail\n6.Remove from specific position\n");
        System.out.println("Enter choice");
        n = sc.nextInt();
        switch (n){
            case 1: System.out.println("How many data you want to enter");
            l = sc.nextInt();
                for (int i = 0; i < l; i++) {
                    System.out.println("Enter the data");
                    info = sc.nextInt();
                    obj.addToHead(info);
                }
                obj.print();
            break;

            case 2: System.out.println("How many data you want to enter");
                l = sc.nextInt();
                for (int i = 0; i < l; i++) {
                    System.out.println("Enter the data");
                    info = sc.nextInt();
                    obj.addToTail(info);
                }
                obj.print();
            break;

            case 3: System.out.println("Enter the position");
                l = sc.nextInt();
                System.out.println("Enter the data");
                info = sc.nextInt();
                obj.addToPosition(l,info);
                obj.print();
                break;

            case 4: obj.removeFromHead();
                System.out.println("Successfully removed from head");
                obj.print();
                break;

            case 5: obj.removeFromTail();
                System.out.println("Successfully removed from tail");
                obj.print();
                break;

            case 6: System.out.println("Enter the position");
                l = sc.nextInt();
                obj.removeFromPosition(l);
                System.out.println("Successfully removed from position");
                obj.print();
                break;

            default: System.out.println("Wrong input");
        }
    }
}
