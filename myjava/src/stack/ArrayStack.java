package stack;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayStack {
    int top=-1;
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         ArrayStack stk=new ArrayStack();
        System.out.println("Enter the length");
        int n= sc.nextInt();
        int arr[]=new int[n];
        stk.push(arr,8);
        stk.push(arr,9);
        stk.push(arr,2);
        System.out.println();
        stk.pop(arr);
        stk.push(arr,7);
        System.out.println();
        stk.pop(arr);
        System.out.println();
        System.out.println("Top element is : " + stk.getTop(arr));
        System.out.println("size is : "+ stk.getSize(arr));


    }
    public void push(int arr[],int data){


            top++;
            arr[top] = data;
            System.out.println("pushed elements "+arr[top]);


    }

    public void pop(int arr[]){

        System.out.println("popped element "+arr[top--] +" ");

    }
    public boolean isEmpty(int arr[]){
        if (top==-1){
            return true;
        }
        return  false;
    }

    public int getTop(int arr[]){
        return arr[top];
    }
    public int getSize(int arr[]){
        return top+1;
    }
}
