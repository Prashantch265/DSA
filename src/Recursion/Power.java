package Recursion;

import java.util.Scanner;

class Pow{
    int result = 1;
    int power(int x, int n){
        if (n == 0)
            return result;
        else {
            result = result * x;
            power(x, n-=1);
        }
        return result;
    }
}
public class Power {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x,n;
        System.out.print("Enter x ");
        x = sc.nextInt();
        System.out.print("to the power");
        n = sc.nextInt();

        Pow obj = new Pow();
        System.out.print(obj.power(x, n));
    }
}
