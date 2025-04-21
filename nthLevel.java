class  TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val)
    {
        this.val=val;
    }
}
public class nthLevel {   
   // static int n;
    private static void nthlevel(TreeNode root,int level,int lvl)
    {
        if(root==null) return;
       // if (level==n)
        if(level==lvl) System.out.print(root.val+" ");
       // nthlevel(root.right,level+1);
        nthlevel(root.left,level+1,lvl);
        nthlevel(root.right,level+1,lvl);
    }
    public static void main(String[] args) {
        TreeNode a=new  TreeNode(1);
        TreeNode b=new  TreeNode(2);
        TreeNode c=new  TreeNode(3);
        TreeNode d=new  TreeNode(4);
        TreeNode e=new  TreeNode(5);
        TreeNode f=new  TreeNode(6);
        TreeNode g=new  TreeNode(7);
        TreeNode h=new  TreeNode(8);
        TreeNode i=new  TreeNode(9);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f;c.right=g;
        d.left=h;d.right=i;
       // nthlevel(a,0); particularily that level
        for(int x=0;x<=3;x++)//level wise whole tree
        {
           // n=x;
            //nthlevel(a,0);
            nthlevel(a,0,x);
            System.out.println();
        }
    }
}
