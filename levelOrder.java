import java.util.LinkedList;
import java.util.Queue;

class  TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val)
    {
        this.val=val;
    }
}
public class levelOrder {
    public static class Pair{
        TreeNode node;
        int level;
        Pair(TreeNode node,int level){
          this.level=level;
          this.node=node;
        }
      }
  /* private static void levelOrder(TreeNode root)
    {
        Queue<TreeNode> q=new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0)
        {
            TreeNode front=q.remove();
            System.out.print(front.val+" ");
           // if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
            if(front.left!=null) q.add(front.left);
        }
    }*/
    public static void levelorder(TreeNode root)
    {
        int prevlevel=0;
        Queue<Pair> q=new LinkedList<>();
        if(root!=null) q.add(new Pair(root,0));
        while(q.size()>0){
            Pair front=q.remove();
            TreeNode temp=front.node;
            int lvl=front.level;
            if(lvl!=prevlevel){
                System.out.println();
                prevlevel++;
            }

            System.out.print(temp.val+" ");

            if(temp.left!=null) q.add(new Pair(temp.left,lvl+1));
            if(temp.right!=null) q.add(new Pair(temp.right,lvl+1)); 
        }
        System.out.println();
    }
    public static void main(String[] args) {
        TreeNode a=new  TreeNode(1);
        TreeNode b=new  TreeNode(2);
        TreeNode c=new  TreeNode(3);
        TreeNode d=new  TreeNode(4);
        TreeNode e=new  TreeNode(5);
        TreeNode f=new  TreeNode(6);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f;
        System.out.println("levelorder: ");
       // levelOrder(a);
       levelorder(a);
    }
}
