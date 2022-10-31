package Stack;

import java.util.Stack;
import java.util.Scanner;


class CharacterStack{
    Stack <Character> obj1 = new Stack();
    Stack <Character> obj2 = new Stack();
    Stack obj3 = new Stack();

    void getnum(String n1, String n2){
        for (int i = 0; i < n1.length() ; i++) {
            char c = n1.charAt(i);
            obj1.push(c);
        }
        for (int i = 0; i < n2.length() ; i++) {
            char c = n2.charAt(i);
            obj2.push(c);
        }
    }

    void sum(){
        int sum, carry= 0;
        while (!obj1.isEmpty() || !obj2.isEmpty()){
            char n1 = (!obj1.isEmpty()) ? obj1.pop() : '0';
//            System.out.println(obj1.isEmpty() + " " + n1);
            char n2 = (!obj2.isEmpty()) ? obj2.pop() : '0';
//            System.out.println(obj2.isEmpty() + " " + n2);
            sum = Character.getNumericValue(n1) + Character.getNumericValue(n2) + carry;
//            System.out.println(sum + " " + n1 + " " + n2 + " " + carry);
            carry = sum/10;
            sum = sum%10;
            obj3.push(sum);
        }
        System.out.println("\nRESULT");
        String result = obj3.toString();
        for (int i = result.length()-1; i >=0 ; i--) {
            System.out.print(result.charAt(i));
        }
    }
}

public class AdditionStack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CharacterStack obj = new CharacterStack();
        System.out.print("Enter the 1st number");
        String n1 = sc.next();
        System.out.print("Enter the 2nd number");
        String n2 = sc.next();
        obj.getnum(n1, n2);
        obj.sum();
    }
}
