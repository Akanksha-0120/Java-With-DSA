import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

class  TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val)
    {
        this.val=val;
    }
}
public class nodeOfTree {
    private static void display( TreeNode root)
    {
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
   
     private static void preorder( TreeNode root)
    {
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
     private static void inorder( TreeNode root)
    {
        if(root==null) return; 
        inorder(root.left);
         System.out.print(root.val+" ");
        inorder(root.right);
    }
   /*  private static void postorder( TreeNode root)
    {
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }*/
    private static void postorder( TreeNode root)
    {

         List<Integer> ans=new ArrayList<>();
       Stack<TreeNode> st=new Stack<>();
       if(root!=null) st.push(root);
       while(st.size()>0)
       {
         TreeNode top=st.pop();
         ans.add(top.val);
         if(top.left!=null) st.push(top.left);
         if(top.right!=null) st.push(top.right);      
       }
       Collections.reverse(ans);
       for(int ele:ans)
       {
         System.out.print(ele+" ");
       } 
    }
    private static int sum( TreeNode root)
    {
        if(root==null) return 0;
        int s= sum(root.left)+sum(root.right)+root.val;
        return s;
    }
    private static int product( TreeNode root)
    {
        if(root==null) return 1;
        int p= product(root.left)*product(root.right)*root.val;
        return p;
    }
     private static int prod( TreeNode root)
    {
        if(root.val==0)  return 1;
        int p= prod(root.left)*prod(root.right)*root.val;
        return p;
    }
    private static int min( TreeNode root)
    {
        if(root==null) return Integer.MAX_VALUE;
        int a=root.val,b=min(root.left),c=min(root.right);
        return Math.min(a,Math.min(b,c));
    }
     private static int max( TreeNode root)
    {
        if(root==null) return Integer.MIN_VALUE;
        int a=root.val,b=max(root.left),c=max(root.right);
        return Math.max(a,Math.max(b,c));
    }
     private static int size( TreeNode root)
    {
        if(root==null) return 0;
        int s= size(root.left)+size(root.right)+1;
        return s;
    }
     private static int edge( TreeNode root)
    {
        if(root==null) return 0;
        int s= size(root.left)+size(root.right)+1;
        return s-1;
    }
     private static int level( TreeNode root)
    {
        if(root==null) return 0;
        int l=Math.max(level(root.right),level(root.left))+1;
        return l;
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
       // System.out.println(b);
       // System.out.println(b.val);
        display(a);
       System.out.println();
        preorder(a);
        System.out.println();
        inorder(a);
        System.out.println();
        postorder(a);
       /* System.out.println(sum(a));
        System.out.println(product(a));
          System.out.println(prod(a));
           System.out.println(min(a));
           System.out.println(max(a));
           System.out.println(size(a));
           System.out.println(edge(a));
           System.out.println(level(a));
          System.out.println(b);
          System.out.println(b.val);
           System.out.println(a.left.val);
          System.out.println(e.val);
          System.out.println(a.left.right.val);
          a.left.right.val=32;
          System.out.println(e.val);
          System.out.println(a.left.right.val);
       /*  System.out.println(a.left.val);
        System.out.println(e.val);
        System.out.println(a.left.right.val);
        a.left.right.val=32;
        System.out.println(e.val);
        System.out.println(a.left.right.val);*/
    }
}
