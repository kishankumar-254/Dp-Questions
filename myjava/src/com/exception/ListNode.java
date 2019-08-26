package com.exception;
import java.util.Scanner;
public class ListNode {
     static int data;
    static  ListNode next;
   static ListNode head;

    public static void main(String[] args) {
        head=null;
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many number you want to Enter");
        int size=scanner.nextInt();
        System.out.println("Enter the item:");
        int item=scanner.nextInt();
        for (int i=0;i<=size;i++)
        {
            insert(item);
            print();
        }


    }
    public static void insert(int data){
        ListNode node=new ListNode();
          node.data=data;
          node.next=head;
          head=node;
    }
    public  static void print(){
        ListNode current=head;
        while (current!=null){
            System.out.print(" "+current.data);
            current=current.next;
        }
    }
}
