package Assignment2;

import java.util.Scanner;

public class test {
    //Do not edit the main function
    public static void main(String[] args) {

        int x, y;

        //Get the input
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();

        //Print output returned from the logic function
        System.out.println(logic(x, y));
    }

        //The function is expected to return an integer.
        //The function accepts two parameters, both integers.
        public static int logic(int x, int y){
            //Write your code here
            //You can create other functions and call from here
            //Don't print anything. Just return the intended output
            int mul = 1, power = 0;
            while(mul < x){
                mul = mul * y;
                power ++;
            }
            if (mul == x){
                return  1;
            }else{
                return  0;
            }
    }
}
