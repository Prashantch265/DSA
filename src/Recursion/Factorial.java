   package Recursion;

import java.util.Scanner;

class Fact{
    int Factorial(int n){
        if(n == 1){
            return 1;
        }else {
            return n * Factorial(n-1);
        }
    }
}
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
        Fact obj = new Fact();
        System.out.println(obj.Factorial(n));
    }
}
