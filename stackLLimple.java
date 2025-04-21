public class stackLLimple {
    public static class Node
    {
       int val;
       Node next;
       Node(int val)
       {
         this.val=val;
       }
    }
    public static class Stack{
        Node head=null;
        int size=0;
        void push(int x)
        {
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        int size()
        {
            return size;
        }
        int peek()
        {
            if(head==null)
            {
                System.out.println("stack is empty");
            }
            int x=head.val;
            return x;
        }
        int pop()
        {
            if(head==null)
            {
                System.out.println("stack is empty");
            }
            int x=head.val;
            head=head.next;
            size--;
            return x;
        }
        void display()
        {

            //displayRec(head);
            Node temp=head;
            while(temp!=null)
            {
               System.out.println(temp.val);
               temp=temp.next;
            }
        }
        void displayRec(Node h)
        {
            if(h==null) return;
            displayRec(h.next);
            System.out.println(h.val);
        }
        boolean isEmpty()
        {
            if(head==null) return true;
            else return false;
        }
        boolean isFull()
        {
            if(head!=null) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(67);
        st.push(7);
        st.push(31);
        st.push(56); 
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.pop());
        st.display();
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
    }
}
