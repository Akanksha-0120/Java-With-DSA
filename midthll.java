class Node{
    int val;
    Node next;
    Node(int val)
    {
        this.val=val;
    }
}


public class midthll {
  /*   public Node midth(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    */
    public static void main(String[] args) {
    
            Node slow=head;
            Node fast=head;
            while(fast!=null&&fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        //midth(a);
    }
}
