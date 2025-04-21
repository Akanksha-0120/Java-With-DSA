import java.util.Scanner;

public class fplp {
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
       int[] ans=new int[2];
       int lo,hi; 
       int fp=-1;
       lo=0;hi=n-1;
       while(lo<=hi)
       {
          int mid=lo+(hi-lo)/2;
          if(arr[mid]==target)
          {
            if(mid>0 && arr[mid]==arr[mid-1]) hi=mid-1;
          
          else{
            fp=mid;
            break;
          }
        }
          else if(arr[mid]<target) lo=mid+1;
          else if(arr[mid]>target)  hi=mid+1;
       }
       int lp=-1;
       lo=0;hi=n-1;
       while(lo<=hi)
       {
          int mid=lo+(hi-lo)/2;
          if(arr[mid]==target)
          {
            if(mid+1<n && arr[mid]==arr[mid+1]) lo=mid+1;
          
          else{
            lp=mid;
            break;
          }
        }
          else if(arr[mid]<target) lo=mid+1;
          else if(arr[mid]>target)  hi=mid+1;
       }
       ans[0]=fp;
       ans[1]=lp;
       for(int ele:ans)
       {
        System.out.println(ele);
       }
    }
}
