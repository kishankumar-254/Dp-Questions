package list;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class ListOne {
    int data;
    ListOne next;
    ListOne (int data){
        this.data=data;
        this.next=null;
    }
}
class ListTow{
ListOne head1;
ListOne head2;
 public static void main(String[] args) {
        ListTow list=new ListTow();
        list.addF(3);
     list.addF(4);
     list.addF(2);
     list.addF(7);
     list.addS(4);
     list.addS(6);
     list.addS(5);
     list.listFinal(list.head1,list.head2);

     list.traverse();

 }

public void addF(int data){
     ListOne node=new ListOne(data);
     if (head1==null){
          head1=node;
     }
     else{
         node.next=head1;
         head1=node;
     }
}
    public void addS(int data) {
        ListOne node = new ListOne(data);
        if (head2 == null) {
            head2 = node;
        } else {
            node.next = head2;
            head2 = node;
        }
    }
    public void listFinal(ListOne head1,ListOne head2){
     Stack<Integer> stk1=new Stack<>();
     Stack<Integer> stk2=new Stack<>();
     ListOne cur=head1;
     ListOne next=head2;
     while(cur!=null){
         stk1.push(cur.data);
     }
     while (next!=null){
         stk2.push(next.data);
     }
     int data1=0;

    }


        public void traverse () {
            ListOne tmp = head2;

            while (tmp != null) {
                System.out.print(tmp.data + " ");
                tmp = tmp.next;

            }
            //System.out.print("null");
        }


}