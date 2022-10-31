package Assignment2;

class LinkedList{
    public Node head,tail;
    class Node{
        int data;
        Node next,prev;
        public Node(int data) {
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
            head.prev = newNode;
            head = newNode;
            head.prev = tail;
            tail.next = head;
        }
    }

    public void print(){
        Node tmp = head;
        while(tmp != head){
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }
}
public class DoublyCircularLinkedList {
    public static void main(String[] args){
        LinkedList obj = new LinkedList();
        obj.addToHead(4);
        obj.addToHead(3);
        obj.addToHead(2);
        obj.print();
    }
}
