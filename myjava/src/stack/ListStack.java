package stack;
import java.util.Scanner;
public class ListStack {
    int data;
    ListStack next;
    ListStack(int data){
        this.data=data;
        this.next=null;
    }
}
class ListA{
    ListStack head;
    public static void main(String[] args) {
        ListA listA=new ListA();
        listA.push(2);
        listA.push(8);
        listA.push(6);
        listA.traverse();
        listA.pop();
        listA.push(4);
        listA.getTop();

    }
    public void push(int data){
        ListStack cur=head;
        if(head==null){
            cur=new ListStack(data);
            head=cur;
        }
        else{
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=new ListStack(data);
        }
    }
    public  void pop(){
        ListStack node=head;
        ListStack prevTolast=null;
        while(node.next!=null){
            prevTolast=node;
            node=node.next;
        }
        System.out.println("Popped Element " +node.data);
        prevTolast.next=null;
    }
    public void getTop(){
        ListStack node=head;
        while (node.next!=null){
            node=node.next;
        }
        System.out.print("Top Element " +node.data);
    }
    public void traverse(){
        ListStack node=head;
        while(node!=null){
            System.out.println(node.data +" ");
            node=node.next;
        }
    }


}


