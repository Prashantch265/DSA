package Assignment2;

import java.util.*;

public class test3 {
    //Do not edit the main function
    public static void main(String[] args) {

        String input;

        //Get the input
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();

        //Print output returned from the logic function
        System.out.println(logic(input));
    }


    //The function is expected to return an integer.
    //The function accepts String as parameter.
    public static int logic(String input){
        //Write your code here
        //You can create other functions and call from here
        //Don't print anything. Just return the intended output
            int n = input.length();

            int count = 0, ans;

            int[] arr = new int[n / 2 + 1];

            // d strores checks the depth of our sequence
            // For example level of () is 1
            // and that of (()) is 2.
            int d = 0;
            for (int i = 0; i < n; i++) {

                // If open bracket
                // increase depth
                if (input.charAt(i) == '(')
                    d++;

                    // If closing bracket
                else {
                    if (d == 1) {
                        for (int j = 2; j <= n / 2 + 1 && arr[j] != 0; j++)
                            arr[j] = 0;
                    }
                    ++count;
                    count += arr[d];
                    arr[d]++;
                    d--;
                }
            }

            // Check Empty Stack
            return ans = input.length() - count;
        }
}
