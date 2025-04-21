class Node{
    int val;
    Node next;
    Node prev;
    Node(int val)
    {
        this.val=val;
    }
}
class CLL
{
    Node head;
    Node tail;
    int size=0;
     void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void list(int val)
    {
        Node temp=new Node(val);
        if(size==0) head=tail=temp;
        while(true)
        {
            System.out.print(temp.val+" ");
            if(temp.next==head) break;
            temp=temp.next;
        }
        size++;
    }
}

public class circularlist {
    public static void main(String[] args) {
        CLL l=new CLL();
        l.print();
        l.list(11);
        l.list(22);
        l.list(33);
        l.list(50);
        l.list(62);
        l.print();

    }
    
}
