public class subsetarr {
    public static void subset(int i,int[] arr,int[] ans)
    {
        if(i==arr.length)
        {
            System.out.println(ans);
            return;
        }
        subset(i+1,arr,ans+arr[i]);
        
        subset(i+1,arr,ans);

    }
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        int[] ans={};
        subset(0,arr,ans);
    }
}
