package Recursion;

import java.util.Scanner;

class F{
    int b = 0, c = 1, sum;
    void fibo(int n){
        if(n>1){
            sum = b + c;
            b = c;
            c = sum;
            System.out.print(c+"\t");
            fibo(n-1);
        }
    }
}
public class Fibonaci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers you want:");
        int n = sc.nextInt();
        F obj = new F();
        obj.fibo(n);
    }
}
