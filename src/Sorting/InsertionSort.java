package Sorting;

public class InsertionSort {
    public static void main(String[] args){
        int a[] = {43,22,24,17,2,1,60};
        int i,j,tmp;
        for(i=1; i<a.length; i++){
            tmp = a[i];
            for (j = i; j > 0 && tmp < a[i-1]; j--)
                a[j] = a[j-1];
                a[j] = tmp;
        }
        for (int n: a
             ) {
            System.out.print(n + "\t");
        }
    }
}
