import java.util.Stack;

public class displaystack {
    public static void main(String[] args) {
         Stack<Integer> st=new Stack<>();
        st.push(34);
        st.push(4);
        st.push(64);
        st.push(21);
        st.push(77);
        st.push(52);
        while(!st.isEmpty()){
          System.out.println(st.pop());
        }
    }
}
