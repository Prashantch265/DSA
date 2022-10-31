package Queues;

import java.util.Scanner;

class Array{
    int[] queue;
    int front,rear;
    int max;
    void create(int max){
        this.max = max;
        front = rear = -1;
        queue = new int[max];
    }
    void enqueue(int data){
        if (front == -1){
            front = rear = 0;
            queue[front] = data;
        }else if((front == 0 && rear == (max - 1)) || (front == rear + 1)){
               System.out.println("Queue is full");
        }else{
            rear = (rear+1)%max;
            queue[rear] = data;
        }
    }
    Integer dequeue(){
        if(front == -1){
            System.out.println("Queue is Empty");
            return null;
        }else if(front == rear){
            int deleted = queue[front];
            front = rear = -1;
            return deleted;
        }else{
            int deleted = queue[front];
            front = (front+1)%max;
            return deleted;
        }
    }
    void print(){
        for (int data:
             queue) {
            System.out.println(data);
        }
    }
}

public class Queue1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of queue");
        int max = sc.nextInt();
        Array obj = new Array();
        obj.create(max);
        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.print();
        System.out.println("Deleted no:"+obj.dequeue());
        obj.print();
    }
}
