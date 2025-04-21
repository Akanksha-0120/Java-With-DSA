class dNode{
    int val;
    dNode next;
    dNode prev;
    dNode(int val)
    {
        this.val=val;
    }
}
class DLL{
    dNode head;
    dNode tail;
    int size=0;
     void display()
    {
        dNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
 void inserttail(int val)
{
    dNode temp=new dNode(val);
    if(size==0) head=tail=temp;
    else{
        tail.next=temp;
        temp.prev=tail;
        tail=temp;
    }
    size++;
}
void inserthead(int val)
{
    dNode temp=new dNode(val);
    if(size==0) head=tail=temp;
    else{
       
        //temp.next=head;
         head.prev=temp;
        temp.next=head;
        head=temp;
    }
    size++;
}
void insert(int idx,int val)
{
    if(idx==0) {
         inserthead(val);
         return;
        }
        if(idx==size){
            inserttail(val);
            return;
        }
        if(idx>size||idx<0){
            System.out.println("invalid index");
            return;
        }
        dNode temp=new dNode(val);
        dNode x=head;
        for(int i=1;i<=idx-1;i++)
        {
            x=x.next;
        }
        dNode y=x.next;
        x.next=temp; temp.prev=x;
        y.prev=temp; temp.next=y;
        size++;
}
void deletehead()
{
    if(head==null) System.out.println("not possible");
    head=head.next;
    head.prev=null;
    size--;
}
void deletetail()
{
    if(tail==null) System.out.println("not possible");
    tail=tail.prev;
    tail.next=null;
    size--;
}
void delete(int idx)
{
    if(idx==0) {
        deletehead();
        return;
       }
       if(idx==size){
        deletetail();
           return;
       }
       if(idx>size||idx<0){
           System.out.println("invalid index");
           return;
       }
       dNode temp=head;
       for(int i=1;i<=idx-1;i++)
       {
         temp=temp.next;
       }
       temp.next=temp.next.next;
       temp=temp.next;
       temp.prev=temp.prev.prev;
}
}
public class DList {
    public static void main(String[] args) {
    DLL list = new DLL();
    list.display();
    list.inserttail(10);
    list.inserttail(20);
    list.inserttail(30);
    
    list.display();
    list.inserttail(40);
    list.display();
    list.inserthead(11);
    list.display();
    list.insert(2,50);
    list.display();
    list.deletehead();
    list.display();
    list.deletetail();
    list.display();
    list.delete(2);
    list.display();
    
    }
}
