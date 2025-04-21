class Node{
    int val;
    Node next;
    Node(int val)
    {
        this.val=val;
    }
}

class SLL
{
    private Node head;
    private Node tail;
     int size;
   
     void insertAtEnd(int val)
    {
       Node temp=new Node(val);
       if(head==null) head=tail=temp;
       else {
        tail.next=temp;
        tail=temp;
       }
       size++;
    }

    void insertAtStart(int val)
    {
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else {
         temp.next=head;
         head=temp;
        }
        size++;

    }
    
    void insert(int idx,int val)
    {
        if(idx==size)
        {
            insertAtEnd(val);
            return;
        }
        if(idx>size||idx<0)
        {
            System.out.println("invalid index");
            return;
        }
        Node temp=new Node(val);
        Node x=head;
        for(int i=1;i<=idx-1;i++)
        {
            x=x.next;
        }
        temp.next=x.next;
        x.next=temp;
        size++;
    }

    int getele(int idx) throws Error
    {
        if(idx==size-1) return tail.val;
        if(idx>size||idx<0) throw new Error("invalid index bhai sahab");
        Node temp=head;
        for(int i=1;i<=idx;i++)
        {
            temp=temp.next;
          //  return temp.val;
        }
        return temp.val;
    }
    void disp()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
           // System.out.println();
        }
        System.out.println();
    }
}

public class traverseLL {

    public static void main(String[] args) {
        SLL list =new SLL();
        list.insertAtEnd(23);
        list.insertAtEnd(56);
        list.insertAtEnd(39);
        list.insertAtEnd(12);
        System.out.println("size of linked list: "+list.size);
        list.disp();
        list.insertAtStart(45);
        list.insertAtStart(13);
        list.insertAtStart(29);
        list.insert(2,100);

        System.out.println("size of linked list: "+list.size);
        list.disp();
        System.out.println("element at index 3 : "+list.getele(3));
    }
}
