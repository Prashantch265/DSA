//package Assignment2;
//
//import java.util.Scanner;
//
//public class test2 {
//    //Do not edit the main function
//    public static void main(String[] args) {
//
//        String input;
//
//        //Get the input
//        Scanner scanner = new Scanner(System.in);
//        input = scanner.nextLine();
//
//        //Print output returned from the logic function
//        System.out.println(logic(input));
//    }
//
//
//    //The function is expected to return a String.
//    //The function accepts String as parameter.
//    public static String logic(String input){
//        //Write your code here
//        //You can create other functions and call from here
//        //Don't print anything. Just return the intended output
//        char[] sentence = input.toCharArray();
//        int count = 0, length = 0, index = 0;
//
//        for (int i = 0; i < sentence.length ; i++) {
//            if(sentence[i] == ' '){
//                for (int j = 0; j < sentence[i]; j++) {
//                    count ++;
//                }
//                if(count > length){
//                    length = count;
//                    count = 0;
//                }
//            }
//        }
//
//        for (int i = 0; i < sentence.length; i++) {
//            if(sentence[i] == ' '){
//                for (int j = 0; j < sentence[i]; j++) {
//                    count ++;
//                }
//                if (length == count){
//                    for (int j = 0; j < sentence[i]; j++) {
//                        new char[] = sentence[j];
//                    }
//                }
//        }
//        return  ;
//    }
//}
