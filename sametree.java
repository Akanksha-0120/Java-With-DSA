class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}
public class sametree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null) return true;
        if(p==null||q==null) return false;
        if(p.val!=q.val) return false;
        if(isSameTree(p.left,q.left)==false) return false;
         if(isSameTree(p.right,q.right)==false) return false;
         return true;
    }
    public static void main(String[] args) {
        TreeNode a=new  TreeNode(2);
        TreeNode b=new  TreeNode(8);
        TreeNode c=new  TreeNode(11);
        TreeNode d=new  TreeNode(6);
        TreeNode e=new  TreeNode(13);
        TreeNode f=new  TreeNode(20);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f;
        TreeNode p=new  TreeNode(2);
        TreeNode q=new  TreeNode(8);
        TreeNode r=new  TreeNode(11);
        TreeNode s=new  TreeNode(6);
        TreeNode t=new  TreeNode(13);
        TreeNode u=new  TreeNode(20);
        p.left=q; p.right=r;
        q.left=s; q.right=t;
        r.right=u;
        System.out.println(isSameTree(a,p));
    }
}
