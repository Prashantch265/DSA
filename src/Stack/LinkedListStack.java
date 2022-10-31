package Stack;

import java.util.LinkedList;
import java.util.Scanner;

class Stack {
    LinkedList obj = new LinkedList();

    public void clear() {
        obj.clear();
    }

    public boolean isEmpty() {
        return obj.isEmpty();
    }

    public Object topEl() {
        if (isEmpty())
            throw new java.util.EmptyStackException();
        return obj.getLast();
    }

    public Object pop() {
        if (isEmpty())
            throw new java.util.EmptyStackException();
        return obj.removeLast();
    }

    public void push(Object el) {
        obj.addLast(el);
    }

    public String toString() {
        return obj.toString();
    }
}

public class LinkedListStack {
    public static void main(String[] args){
        Stack obj = new Stack();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Max size of stack");
        int max = sc.nextInt();
        for(int i=1; i<=max; i++) {
            System.out.print("Enter the element");
            obj.push(sc.nextInt());
        }
        System.out.println("Before pop");
        System.out.println("Top Element "+obj.topEl());
        obj.pop();
        System.out.println("after popping out the element from the stack");
        System.out.println("Top Element " + obj.topEl());
        System.out.println(obj.toString());
    }
}
