package com.linklist;
import java.util.Scanner;
public class QueueImplementation {
    int front=-1;
    int rear=-1;

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int Size=scanner.nextInt();
        QueueImplementation queue=new QueueImplementation();
        int []Queue=new int[Size];

        queue.enQueue(Queue,5);
        queue.enQueue(Queue,8);
        queue.enQueue(Queue,9);

    }
    public void enQueue(int []Queue,int value){
        if (isFull(Queue)) {
            System.out.println("Queue is Full");
        }else{
            front++;
            Queue[front]=value;
        }
        System.out.print(Queue[front]+" ");
    }
    public void deQueue(int Queue[]){
        if (isEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            rear++;

        }
    }
    public boolean isEmpty(){
        if (rear==-1&&front==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFull(int Queue[]){
        if (front==Queue.length){
         return true;
        }
        else{
            return false;
        }
    }
}
