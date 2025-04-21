//import java.util.Arrays;
public class subsetstr {
   // static ArrayList<String> arr = new ArrayList<>();
    public static void subset(int i,String s,String ans)
    {
        if(i==s.length())
        {
           // arr.add(ans);
           System.out.println(ans);
            return;
        }
        char ch=s.charAt(i);
        subset(i+1,s,ans);
        ans+=ch;
        subset(i+1,s,ans);
    }
    public static void main(String[] args) {
        String s="123";
       // arr=new ArrayList<>();
       System.out.println("subset of a string is :");
        subset(0,s,"");
        
    }
}
