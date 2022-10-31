package Sorting;

public class SelectionSort {
    public static void main(String[] args){
        int tmp, least, i, j;
        int a[] = {13,231,17,6,5,90,10};
        for(i = 0; i<a.length; i++){
            for(j=i+1, least = i; j<a.length; j++) {
                if (a[j] < a[least]) {
                    least = j;
                }
            }if(i != least){
                    tmp = a[least];
                    a[least] = a[i];
                    a[i] = tmp;
            }
        }
        for (int n: a
             ) {
            System.out.print(n + "\t");
        }
    }
}
