import java.util.Stack;
public class reversestackrecusive {
    public static void displayreverse(Stack<Integer> st) 
    {
        if(st.size()==0) return ;

        int topmost=st.pop();
       // System.out.println(topmost);
        displayreverse(st);
        System.out.println(topmost);
        st.push(topmost);
    
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(34);
        st.push(4);
        st.push(64);
        st.push(21);
        st.push(77);
        st.push(52);
        displayreverse(st);
        System.out.println();
       while(!st.isEmpty()){
          System.out.println(st.pop());
        }
        
    }
}
