package com.linklist;

import java.util.Scanner;

public class StackImplementation {
    int top = -1;

    public static void main(String[] args) {
        StackImplementation staIp = new StackImplementation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int length = scanner.nextInt();
        int[] array = new int[length];
        staIp.push(array, 8);
        staIp.push(array, 7);
        staIp.push(array, 5);
        System.out.println();
        System.out.println("top element: "+staIp.getTop(array));
        System.out.println("Size of stack is: "+staIp.getSize(array));
        System.out.println("Poped element is: "+staIp.pop(array));
        System.out.println("Poped element is: "+staIp.pop(array));
        System.out.println("top element is: "+staIp.getTop(array));
        System.out.println("Size of stack is: "+staIp.getSize(array));

    }

    public void push(int[] array, int value) {
        if (isFull(array)) {
            System.out.println("Stack is full");
        } else {
            top++;
            array[top] = value;

        }
        System.out.print(array[top] + " ");
    }

    public int pop(int array[]) {
        if (isEmpty()) {
            System.out.println("Stack is Empty:");
            return 0;
        } else {
             return array[top--];


        }

    }
    public boolean isEmpty(){
        if (top==-1){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isFull(int array[]){
        if (top==array.length-1){
            return true;
        }
        else {
            return false;
        }
    }
    public int getTop(int array[]){
        return array[top];
    }
    public int getSize(int array[])
    {
        return top+1;
    }

    public int getMinimum(int array[]){
        return 0;
    }

}
