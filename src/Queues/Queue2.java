package Queues;

import java.util.LinkedList;

class LL{
    LinkedList obj = new LinkedList();

    void clear(){
        obj.clear();
    }

    boolean isEmpty(){
        return obj.isEmpty();
    }

    void enqueue(int el){
        obj.addLast(el);
    }

    void dequeue(){
        if (isEmpty())
            throw new java.util.EmptyStackException();
        obj.removeFirst();
    }

    void display(){
        for(int i = 0; i < obj.size(); i++)
            System.out.println( obj.get(i) );
    }
}
public class Queue2 {
    public static void main(String[] args){
        LL obj1 = new LL();
        obj1.enqueue(5);
        obj1.enqueue(9);
        obj1.enqueue(7);
        obj1.display();
        obj1.dequeue();
        obj1.display();
    }
}
