package com.linklist;

class Node{
    int data;
    Node next;
    Node(int data ){
        this.data = data;
        this.next = null;
    }
}
public class LinkList {
    Node head;
    public int count;

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.addLast(15);
        linkList.addLast(17);
        linkList.addLast(14);
        linkList.addLast(16);
        linkList.addFirst(11);
        linkList.addFirst(187);
        linkList.traverse(linkList.head);
        System.out.println();
        System.out.println(linkList.count);
    }

    public void addLast( int data){
        Node tmp = head;
        if(head == null){
            head = new Node(data);
            this.count++;
        }else {
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(data);
            this.count++;
        }
    }

    public void addMiddle(Node head,int data){


    }

    public void addFirst(int data){
        Node tmp = new Node(data);
        if(head == null){
            head = tmp;
            this.count++;
        }else{
            tmp.next = head;
            head = tmp;
            this.count++;
        }


    }

    public void traverse(Node head){
        Node tmp = head;
        while (tmp != null){
            System.out.print(tmp.data + "->");
            tmp = tmp.next;
        }
        System.out.print("null");

    }

}
