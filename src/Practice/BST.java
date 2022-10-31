package Practice;

import java.util.Scanner;

public class BST {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. you want to search between 1-10: ");
        int n = sc.nextInt();
        int g=0;
        int md = a.length/2;
        if (n < md){
            md=md-1;
        }
    }
}
