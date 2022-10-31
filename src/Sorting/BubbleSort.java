package Sorting;

public class BubbleSort {
    public static void main(String[] args){
        int a[] = {1,3,6,2,9,0,10,23,19,15,27,20};
        int i, j, tmp;
        System.out.println("Array before sot");
        for (int n: a
             ) {
            System.out.print(n + "\t");
        }
        System.out.print(a);
        for(i=0; i<a.length; i++){
            for(j=0; j<a.length-i-1; j++){
                if(a[j] > a[j+1]){
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }

        }
        System.out.println("Array After Sort");
        for (int n: a
             ) {
            System.out.print(n + "\t");
        }
    }
}
