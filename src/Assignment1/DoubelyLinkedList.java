package Assignment1;

import java.util.Scanner;

class LinkedList2{
    public Node head,tail;
    class Node{
        int data;
        Node next,prev;
        public Node(int data){
            this.data = data;
            next = null;
            prev = null;
        }
    }

    public void addToHead(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addToTail(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = null;
            tail = newNode;
        }
    }

    public void addToPosition(int position, int data){
        Node newNode = new Node(data);
        if(head == null){
            System.out.println("List is Empty");
            head = tail = newNode;
        }else{
            Node tmp = head;
            for (int i = 1; i < position-1; i++) {
                tmp = tmp.next;
                if(tmp == null){
                    System.out.println("invalid position");
                    return;
                }
            newNode.next = tmp.next;
            newNode.prev = tmp;
            tmp.next = newNode;
            }
        }
    }

    public void removeFromHead(){
        if (head == tail){
            System.out.println("List is empty");
            head = tail = null;
        }else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeFromTail(){
        if (head == tail){
            System.out.println("List is empty");
            head = tail = null;
        }else {
            Node tmp = head;
            while (tmp.next != tail){
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
    }

    public void removeFromPosition(int position){
        if (head == null){
            System.out.println("List is empty");
            head = tail = null;
            return;
        } else if(position == 1){
            removeFromHead();
            return;
        } else{
            Node tmp = head;
            for (int i = 0; i < position-1; i++) {
                if(tmp == null){
                    System.out.println("invalid position");
                    break;
                }
                tmp = tmp.next;
            }
            Node lastnode = tmp.next.next;
            tmp.next = lastnode;
            lastnode.prev = tmp;
        }
    }

    public void print(){
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }

    public void reverse(){
        if(head == null){
            System.out.println("List is empty");
        }
        Node tmp = tail;
        while(tmp != null){
            System.out.println(tmp.data);
            tmp = tmp.prev;
        }
    }
}

public class DoubelyLinkedList {
    public static void main(String[] args){
        LinkedList2 obj = new LinkedList2();
        Scanner sc = new Scanner(System.in);
        obj.addToHead(4);
        obj.addToHead(3);
        obj.addToHead(2);
        obj.addToTail(5);
        obj.addToTail(6);
        obj.addToTail(7);
//        obj.removeFromHead();
//        obj.removeFromHead();
//        obj.removeFromTail();
//        obj.removeFromTail();
//        obj.print();
//        obj.reverse();

        int n,info,l;
        System.out.print("1.Add To Head\n" +
                "2.Add To Tail\n" +
                "3.Add to any position\n" +
                "4.Remove from Head\n" +
                "5.Remove from Tail\n" +
                "6.Remove from specific position\n" +
                "7.Reverse Traverse\n");
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

            case 7: System.out.println("Reverse Traverse");
                obj.reverse();
                break;

            default: System.out.println("Wrong input");
        }
    }
}
