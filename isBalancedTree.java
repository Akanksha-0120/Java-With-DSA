class  TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val)
    {
        this.val=val;
    }
}
public class isBalancedTree {
    private static int level( TreeNode root)
    {
        if(root==null) return 0;
        return  Math.max(level(root.right),level(root.left))+1;
     }
    public static boolean isbalanced(TreeNode root)
    {
      if(root==null) return true;
      int diff=Math.abs(level(root.left)-level(root.right));
      if(diff>1) return false;
      return isbalanced(root.left)&& isbalanced(root.right);
    }
   public static void main(String[] args) {
    TreeNode a=new  TreeNode(1);
    TreeNode b=new  TreeNode(2);
    TreeNode c=new  TreeNode(3);
    TreeNode d=new  TreeNode(4);
    TreeNode e=new  TreeNode(5);
    TreeNode f=new  TreeNode(6);
    a.left=b; //a.right=c;
    b.left=d; b.right=e;
   // c.right=f;
    System.out.println(isbalanced(a));
  } 
}
