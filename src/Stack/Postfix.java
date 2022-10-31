package Stack;

import java.util.LinkedList;
import java.util.Scanner;

class Stack2{
    LinkedList obj = new LinkedList();

    void push(int data){
        obj.addLast(data);
    }

    Integer pop(){
        if(obj.isEmpty()){
            System.out.println("Stack Underflow");
            return null;
        }else{
//            int n = (int) obj.removeLast();
            return (int) obj.removeLast();
        }
    }
}

public class Postfix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack2 obj = new Stack2();
        System.out.println("Enter the Expression");
        String ex = sc.next();
        char[] expression = ex.toCharArray();
        for (char c:
             expression) {
            if (c == '+' || c == '-' || c == '*' || c == '/' || c == '%'){
                int a = obj.pop();
                System.out.print(a + "\t");
                int b = obj.pop();
                System.out.print("\t" + b);
                switch (c){
                    case '+': obj.push(b + a);
                    break;

                    case '-': obj.push(b-a);
                    break;

                    case '*': obj.push(b*a);
                    break;

                    case '/': obj.push(b/a);
                    break;

                    case '%': obj.push(b%a);
                    break;
                }
            }else {
                obj.push(Integer.valueOf(String.valueOf(c)));
            }
        }
        System.out.print("\n" + obj.pop());
    }
}
