import java.util.Arrays;
public class stockspan {
    public static void calculatespan(int[] arr,int n,int[] ans)
    {
        ans[0]=1;
        for(int i=1;i<n;i++)
        {
            ans[i]=1;
            for(int j=i-1;j>=0&&(arr[i]>=arr[j]);j--)
            {
               ans[i]++;
            }
        }
    }
    public static void print(int[] ans)
    {
        System.out.println(Arrays.toString(ans));
    }
   public static void main(String[] args) {
      int[] arr={1,4,5,70,90,50};
      print(arr);
      int n=arr.length;
      int[] ans=new int[n];
      calculatespan(arr,n,ans);
      print(ans);
   } 
}
