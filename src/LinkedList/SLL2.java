package LinkedList;

//method 2
class LinkedList2{
    public Node head,tail;
    public LinkedList2(){
        head = tail = null;
    }
    public boolean isEmpty(){
        return head==null && tail==null;
    }
    public void addToHead(int data){
        head = new Node(data,head);
        if(tail == null)
            tail = head;
    }

    public void print(){
        while (head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }

//    public void del(){
//        if(head==tail){
//            head=tail=null;
//        }else{
//            Node temp = head;
//               while (temp.next != tail){
//                   temp = temp.next;
//            }
//               temp.next = null;
//               tail = temp;
//            System.out.println("deleted");
//        }
//    }

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
}
public class SLL2 {
    public static void main(String[] args){
        LinkedList2 obj = new LinkedList2();
        obj.addToHead(1);
        obj.addToHead(2);
        obj.addToHead(3);
        obj.print();
    }
}
