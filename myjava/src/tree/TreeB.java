package tree;

public class TreeB {
    int data;
    TreeB left;
    TreeB right;

    TreeB(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
    class TreeC{
        TreeB root;
        public static void main(String[] args) {
            TreeB tree=new TreeB(10);
            TreeB tree1=new TreeB(5);
            TreeB tree2=new TreeB(8);
            TreeB tree3=new TreeB(15);
            TreeB tree4=new TreeB(9);
            TreeB tree5=new TreeB(13);
            TreeB tree6=new TreeB(14);
            TreeB tree7=new TreeB(7);
            TreeB tree8=new TreeB(12);
            TreeC treeC=new TreeC();
            treeC.root=tree;
            tree.left=tree1;
            tree.right=tree2;
            tree1.left=tree3;
            tree1.right=tree4;
            tree2.left=tree5;
            tree2.right=tree6;
            tree4.left=tree7;
            tree5.left=tree8;

        }

    }

