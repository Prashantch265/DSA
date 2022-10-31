package Hashing;

import java.util.Scanner;

class HashTable{
    int tableSize;
    Integer[] arr;
    public HashTable(int tableSize){
        this.tableSize = tableSize;
        arr = new Integer[tableSize];
    }
    
    int hashFunction(int key){
        return key%this.tableSize;
    }

    boolean collision(int index){
        return (arr[index]!=null);
    }

    void insert(int key){
        int index = hashFunction(key);
        int i=1;
        while (collision(index)){
            index = (hashFunction(key)*i) % this.tableSize;
            i++;
        }
        arr[index] = key;
    }

    void search(int key){
        int index = hashFunction(key);
        if(arr[index] == key){
            System.out.print("Found");
        }else{
            int i = 1;
            while (arr[index] != key && i <= arr.length){
                index = (hashFunction(key)*i) % this.tableSize;
                if(arr[index] == key){
                    System.out.print("Found");
                    break;
                }else{
                    System.out.print("Not Found");
                }
                i++;
            }
        }
    }

    void delete(int key){
        int index = hashFunction(key);
        if(arr[index] == key){
            System.out.print(arr[index] + " Deleted");
            arr[index] = null;
        }else{
            int i = 1;
            while (arr[index] != key && i <= arr.length){
                index = (hashFunction(key)*i) % this.tableSize;
                if(arr[index] == key){
                    System.out.print(arr[index] + " Deleted");
                    arr[index] = null;
                    break;
                }else{
                    System.out.print("Not Found");
                }
                i++;
            }
        }
    }

    void print(){
        System.out.println("Result");
        for (int n:
             arr) {
            System.out.print(n + " ");
        }
    }
}
public class LinearProbing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Hash Table");
        int size = sc.nextInt();
        HashTable obj = new HashTable(size);
        System.out.print("1.Add data \n 2.Search data \n 3.Delete data \n");
        System.out.print("Enter your choice");
        int c = sc.nextInt();
        switch (c){
            case 1: System.out.println("How many data you want to enter: ");
                int n = sc.nextInt();
                for (int i = 0; i < n ; i++) {
                    System.out.print("Enter data: ");
                    obj.insert(sc.nextInt());
                }
                obj.print();
                break;

            case 2: System.out.println("Enter Data: ");
                    obj.search(sc.nextInt());
                    obj.print();
                    break;

            case 3: System.out.print("Enter data: ");
                    obj.delete(sc.nextInt());
                    obj.print();
                    break;

            default: System.out.print("Invalid choice");
        }
    }
}
