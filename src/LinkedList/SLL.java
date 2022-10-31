package LinkedList;

//method 1
class LinkedList{
    Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    public void print(){
        while (head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}
public class SLL {
    public static void main(String[] args){
        LinkedList obj = new LinkedList();
        obj.head = new LinkedList.Node(1);
        LinkedList.Node second = new LinkedList.Node(2);
        LinkedList.Node third = new LinkedList.Node(3);
        obj.head.next = second;     //same as next.next instead of it we assign it to a var
        second.next = third;
        obj.print();
    }
}
