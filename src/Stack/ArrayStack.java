package Stack;

import java.util.Scanner;

class Stack1{
    int[] stack;
    int tos = -1;
    void create(int max){
        stack = new int[max];
    }
    void push(int data){
        stack[++tos] = data;
    }
    Integer pop(){
        if (tos == -1){
            System.out.println("Stack underflow");
            return null;
        }else{
            return stack[tos--];
        }
    }
    void print(){
        for (int i=tos; i>=0; i--) {
            System.out.println(stack[i]);
        }
    }
    void tos(){
        System.out.println("Top Element " + stack[tos]);
    }
}
public class ArrayStack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Max size of stack");
        int max = sc.nextInt();
        Stack1 obj = new Stack1();
        obj.create(max);
        for(int i=1; i<=max; i++) {
            System.out.print("Enter the element");
            obj.push(sc.nextInt());
        }
        System.out.println("Before pop");
        obj.print();
        obj.tos();
        obj.pop();
        System.out.println("After pop");
        obj.tos();
        obj.print();
    }
}
