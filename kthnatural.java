public class kthnatural {
    public static void print(int i,int k,int n, String s,String ans)
    {
        if(i==n||k==n)
        {
            System.out.println(ans);
            return;
        }
        char ch=s.charAt(i);
        print(i+1,4,6,s,ans);
        ans+=ch;
        print(i+1,4,6,s,ans);

    } 
    public static void main(String[] args) {
        String s="123456";
        int k=4;
        int n=s.length();
        print(1,k,n,s,"");
    }
}
