package com.linklist;

class ListOne{
    int data;
    ListOne next;
    ListOne(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkListOne {
    ListOne head;
    int count;
    int position;

    public static void main(String[] args) {

    LinkListOne linkListOne=new LinkListOne();
    linkListOne.addFirst(linkListOne,12);
        linkListOne.addFirst(linkListOne,18);
        linkListOne.addFirst(linkListOne,15);
        linkListOne.addFirst(linkListOne,16);
        linkListOne.addFirst(linkListOne,16);
        linkListOne.addMiddle(linkListOne,10,4);
        //linkListOne.deleteMiddle(linkListOne,1);
        //linkListOne.deleteFirst(linkListOne);
        //linkListOne.deleteFirst(linkListOne);
       //linkListOne.duplicate(linkListOne);
        linkListOne.rotateList(linkListOne,3);
        linkListOne.traverse(linkListOne);
        System.out.println();
        System.out.println("Total Elements is: "+linkListOne.count);
        linkListOne.printMiddle( linkListOne);

}

public void addFirst(LinkListOne linkListOne,int data){
        ListOne tmp;
        if (linkListOne.head==null){
            tmp=new ListOne(data);
            linkListOne.head=tmp;
            this.count++;
        }
        else {
            tmp=new ListOne(data);
            tmp.next=linkListOne.head;
            linkListOne.head=tmp;
            this.count++;
        }

}
public void addMiddle(LinkListOne linkListOne,int data,int position){
        ListOne duplicate=linkListOne.head;
        int counter=1;
        ListOne middle;
        if (duplicate==null){
            middle=new ListOne(data);
            linkListOne.head=middle;
            this.count++;
        }
        else{
            while (counter<position-1){
                duplicate=duplicate.next;
                counter++;

            }
            middle=new ListOne(data);
            middle.next=duplicate.next;
            duplicate.next=middle;
            this.count++;
        }
}
public void printMiddle(LinkListOne linkListOne) {
    ListOne local = linkListOne.head;
    int number = this.count;
    int counter = 1;
    if (number % 2 == 0) {
        number = (number / 2);

        while (counter != number) {
            local = local.next;
            counter++;
        }
        System.out.println("Middle Element is: " + local.data);
        System.out.println("Middle Element is: " + local.next.data);
    }
    else {
        number=(number/2)+1;
        while (counter != number) {
            local = local.next;
            counter++;
        }
        System.out.println("Middle Element is: " + local.data);

    }
}
public void deleteFirst(LinkListOne linkListOne){
        ListOne temp=linkListOne.head;
        head=temp.next;
        this.count--;
}
public void deleteMiddle(LinkListOne linkListOne,int position){
        int counter=1;
        ListOne local=linkListOne.head;

        while (counter<position-1){
            local=local.next;
            counter++;
        }

        ListOne temp=local.next;
        local.next=temp.next;
        temp.next=null;
        this.count--;

}
public void duplicate(LinkListOne linkListOne){
        ListOne temp=linkListOne.head;
        while (temp!=null&&temp.next!=null){
            if (temp.data==temp.next.data){
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
        this.count--;

}
public void checkCircle(LinkListOne linkListOne){
        ListOne temp=linkListOne.head;
        int counter =1;
        int count=counter+2;

        while (count!=counter){
            temp=temp.next;
            counter++;
        }
    System.out.println(temp.data);
}
public void rotateList(LinkListOne linkListOne,int position){
        ListOne temp=linkListOne.head;
        int counter =1;
        while (counter<position-1){
            temp=temp.next;
            counter++;
        }
        ListOne local=temp.next;
        while(local!=null){
            System.out.print(local.data+"->");
        }
}

public void traverse(LinkListOne linkListOne){
        ListOne temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
           temp= temp.next;

        }
    System.out.print("null");

}

}
