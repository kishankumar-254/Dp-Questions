package tree;
import java.util.*;

public class FirstTree {
    FirstTree left;
    FirstTree right;
    int data;
    FirstTree(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class TreeA {
   static FirstTree root;
    public static void main(String[] args) {
        FirstTree tree=new FirstTree(12);
        FirstTree left=new FirstTree(7);
        FirstTree right=new FirstTree(13);
        FirstTree tree1=new FirstTree(5);
        FirstTree tree2=new FirstTree(8);
        FirstTree tree4=new FirstTree(11);
        FirstTree tree5=new FirstTree(15);
        FirstTree tree6=new FirstTree(17);
        tree.left=left;
        tree.right=right;
        left.left=tree1;
        left.right=tree2;
        right.left=tree4;
        right.right=tree5;
        tree5.left=tree6;
        TreeA treeA=new TreeA();
        treeA.root=tree;
        //treeA.preOrder(treeA.root);
        //System.out.println();
        //System.out.println("LevelOrder Traversal-->");
        treeA.levelOrder(root);
        System.out.println();
        //treeA.getLevel(root,11);

        int ht=treeA.getHeight(root);
        System.out.println("Height is " + ht);
        //treeA.leftView(root,0);
        System.out.println("Diameter");
        int dia=treeA.diameter(root);
        System.out.print(dia);
        FirstTree node=treeA.lCA(root,12,15);
        System.out.println("lca is "+ node.data);
    }
    public  void preOrder( FirstTree root){
        if (root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder( root.right);

    }
    FirstTree tmp=null;
    public  void levelOrder(FirstTree root){
        Queue<FirstTree> q=new LinkedList<>();
        q.add(root);
        int result =root.data;

        while (!q.isEmpty()) {
            int count = q.size();
            int sum=0;
            while (count-- > 0) {
                tmp = q.poll();
                sum = sum+tmp.data;

                if (tmp.left != null) {
                    q.add(tmp.left);
                }
                if (tmp.right != null) {
                    q.add(tmp.right);
                }
                result=Math.max(sum,result);
            }

        }
        System.out.println( "MaxLevel sum " +result);

    }
    public  void getLevel(FirstTree root,int k){
        Queue<FirstTree> q=new LinkedList<>();
        int level=1;
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            FirstTree tmp=q.peek();
            q.poll();
            if(tmp==null){
                if(q.peek()!=null){
                    q.add(null);
                }
                level++;
            }
            else {
                if(tmp.data==k){
                    System.out.println(level);
                }
                if(tmp.left!=null){
                    q.add(tmp.left);
                }
                if (tmp.right!=null){
                    q.add(tmp.right);
                }
            }
        }
    }
    public int getHeight(FirstTree root){
        if(root==null){
            return 0;
        }
        int left=getHeight(root.left);
        int right=getHeight(root.right);
        return Math.max(left,right)+1;
    }
    int level1=0;

    public void leftView(FirstTree root,int level){
        if(root==null){
            return ;
        }
        if(level>=level1){
            System.out.print(root.data+ " ");
            level1++;
        }
        leftView(root.right,level+1);
        leftView(root.left,level+1);

    }
    public int diameter(FirstTree root){
        if (root==null){
            return 0;
        }
        int leftd=diameter(root.left);
        int rightd=diameter(root.right);
        int h=getHeight(root.left)+getHeight(root.right);
        return Math.max(h,Math.max(leftd,rightd));
    }

    public void topView(FirstTree root,int ht){
        List<Integer> list;
        HashMap<Integer,List<Integer> > map=new HashMap<>();
        if (root==null){
            return ;
        }
        topView(root.left,ht-1);
        map.put(ht,new ArrayList<>(root.data));
        topView(root.right,ht+1);

    }
    public FirstTree lCA(FirstTree root,int data1,int data2){
        if(root==null){
            return root;
        }
        if(root.data==data1 || root.data==data2){
            return root;
        }
        FirstTree left=lCA(root,data1,data2);
        FirstTree right=lCA(root,data1,data2);
        if(left!=null && right!=null){
            return root;
        }
        if(left==null && right==null){
            return null;
        }
        return left!=null?left:right;

    }

}


