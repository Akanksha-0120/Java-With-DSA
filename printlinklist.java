class Node{
    int val;
    Node next;
    Node(int val)
    {
        this.val=val;
    }
}

public class printlinklist {
    public static void printll(Node head){
       if(head==null) return;
       
       printll(head.next);
       System.out.println(head.val);
       //printll(head.next);

    }
    public static void print(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(17);
        Node c=new Node(25);
        Node d=new Node(40);
        Node e=new Node(49);
        a.next=b;
        b.next=c;
        c.next=d;
       // d.next=e;
       // print(a); 
       
        printll(a);
      
}
}
