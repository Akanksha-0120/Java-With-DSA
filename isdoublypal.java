class dNode
{
    int val;
    dNode next;
    dNode prev;
    dNode(int val)
    {
        this.val=val;
    }
}
public class isdoublypal {
    public static void main(String[] args) {
    dNode a=new dNode(10);
    dNode b=new dNode(20);
    dNode c=new dNode(10);
   // dNode d=new dNode(40);
    a.next=b;  b.prev=a;
    b.next=c;  c.prev=b;
    //c.next=d;  d.prev=c;
    dNode temp=a;
    int h=0;
    while(temp!=null)
    { 
        h=temp.val;
        System.out.print(h+" ");
        temp=temp.next;
    }
    System.out.println();
     temp=c;
     int t=0;
    while(temp!=null)
    {
        t=temp.val; 
        System.out.print(t+" ");
        temp=temp.prev;
    }
    System.out.println();
    if(h==t) System.out.println("palindrome");
   if(h!=t)  System.out.println("not");

    }
}
