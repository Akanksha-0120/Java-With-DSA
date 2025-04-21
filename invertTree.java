class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}
public class invertTree {
    private static void invert( TreeNode root)
    {
        if(root==null) return;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        System.out.print(root.val+" ");
        invert(root.left);
        invert(root.right);
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
        
        invert(a);
    }
}
