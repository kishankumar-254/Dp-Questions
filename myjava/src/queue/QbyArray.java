package queue;
import java.util.Scanner;
public class QbyArray {
    int front=-1;
    int rear=-1;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length:");
        int n=sc.nextInt();
        int arr[] =new int[n];
        QbyArray qbyArray=new QbyArray();
        qbyArray.enQueue(arr,8);
        qbyArray.enQueue(arr,7);
        qbyArray.enQueue(arr,10);
        qbyArray.deQueue(arr);
        qbyArray.deQueue(arr);
        qbyArray.deQueue(arr);

    }
    public void enQueue(int arr[],int data){
        if(isEmpty()){
            front++;
            rear++;
            arr[rear]=data;

        }
        else {
            if (!isFull(arr)) {
                rear++;
                arr[rear] = data;
            }
        }
    }
    public void deQueue(int arr[]){
        if (front<=rear){
            int tmp=arr[front];
            System.out.println("enQueue data is " +tmp);
            front++;
        }
        else {
            System.out.println(" Queue is Empty");
        }
    }
    public boolean isEmpty(){
        if(front==-1 && rear==-1){
            return true;
        }
        return false;
    }
    public boolean isFull(int arr[]){
        if (rear==arr.length){
            return true;
        }
        return  false;
    }
}
