package Assignment2;

import java.util.LinkedList;

class Stack1{
    LinkedList obj = new LinkedList();

    void push(int data){
        obj.addLast(data);
    }

    void pop(){
        if(obj.isEmpty()){
            System.out.println("Stack underflow");
        }else {
            obj.removeLast();
        }
    }

    void clear(){
        obj.clear();
    }

    void tos(){
       System.out.println(obj.peekLast());
    }

    void print(){
        System.out.println(obj.toString());
    }
}
public class LinkedListStack {
    public static void main(String[] args){
        Stack1 obj = new Stack1();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.print();
        obj.tos();
    }
}
