package Stack;

import java.util.Stack;
class Transform{
    int precedence(char c){
        switch (c) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    String conversion(String exp) {
        String result = new String();
        Stack<Character> obj = new Stack();

        for (int i = 0; i<exp.length(); ++i)
        {
            char c = exp.charAt(i);

            // If the scanned character is an
            // operand, add it to output.
            if (Character.isLetterOrDigit(c))
                result += c;

                // If the scanned character is an '(',
                // push it to the stack.
            else if (c == '(')
                obj.push(c);

                //  If the scanned character is an ')',
                // pop and output from the stack
                // until an '(' is encountered.
            else if (c == ')')
            {
                while (!obj.isEmpty() &&
                        obj.peek() != '(')
                    result += obj.pop();

                obj.pop();
            }
            else // an operator is encountered
            {
                while (!obj.isEmpty() && precedence(c)
                        <= precedence(obj.peek())){

                    result += obj.pop();
                }
                obj.push(c);
            }

        }

        // pop all the operators from the stack
        while (!obj.isEmpty()){
            if(obj.peek() == '(')
                return "Invalid Expression";
            result += obj.pop();
        }
        return result;
    }

}
public class InfixToPostfix {
    public static void main(String[] args){
        Transform obj = new Transform();
        System.out.print(obj.conversion("a+b*(c^d-e)^(f+g*h)-i"));
    }
}
