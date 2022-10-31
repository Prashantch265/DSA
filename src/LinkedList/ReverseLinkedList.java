package LinkedList;

class LinkeList3{
    public Node head,tail;
    public LinkeList3(){
        head = tail = null;
    }

    public void addToHead(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }else {
            tail = head;
            head = newNode;
            head.next = tail;
        }
    }

    public void reverse(){
        Node current;
        while(head != null){
            current = head;
            head = tail;
            tail = current;
            head = head.next;
        }
    }

//    Node reverse(Node node)
//    {
//        Node prev = null;
//        Node current = node;
//        Node next = null;
//        while (current != null) {
//            next = current.next;
//            current.next = prev;
//            prev = current;
//            current = next;
//        }
//        node = prev;
//        return node;
//    }

    public void print()
    {
        while (head != null) {
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
public class ReverseLinkedList {
    public static void main(String[] args){
        LinkeList3 obj = new LinkeList3();
        obj.addToHead(1);
        obj.addToHead(2);
        obj.addToHead(3);
        obj.print();
        obj.reverse();
        obj.print();
    }
}
