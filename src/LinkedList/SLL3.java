package LinkedList;

class LinkedList3{
    public Node head,tail;
    public LinkedList3(){
        head = tail = null;
    }

    public void addToTail(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void print(){
        while (head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
}
public class SLL3 {
    public static void main(String[] args){
        LinkedList3 obj = new LinkedList3();
        obj.addToTail(1);
        obj.addToTail(2);
        obj.addToTail(3);
        obj.print();
    }
}
