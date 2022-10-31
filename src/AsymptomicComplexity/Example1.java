package AsymptomicComplexity;

public class Example1 {
    public static void main(String[] args) {
        int i, sum;
        int[] a = {1,2,3,4,5,6,7,8};
        for (i = sum = 0; i < a.length; i++) {     //i=0 => 1 and sum=0 => 1
            sum += a[i];    //sum updates n times and a[i] => i updates n times
        }
        System.out.println(sum);
    }       //complexity 2+2n => 1+1+n+n
}
