import java.util.Scanner;

public class upbound {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("enter target element :");
       int target=sc.nextInt();
       System.out.print("enter array size :");
       int n=sc.nextInt();
       int[] arr=new int[n];
       System.out.print("enter array element :");
       for(int i=0;i<n;i++)
       {
          arr[i]=sc.nextInt();
       } 
       int ub=n;
       int lo=0,hi=n-1;
       while(lo<=hi)
       {
         int mid=lo+(hi-lo)/2;
         if(arr[mid]>target)
         {
            ub=Math.min(ub,mid);
            hi=mid-1;
         }
         else   lo=mid+1;
       }
       System.out.print("upper bound of a array :"+ub);
    }
}
 

