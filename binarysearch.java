import java.util.Scanner;
public class binarysearch
{
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
       int lo=0,hi=n-1;

       boolean flag=false;

       while(lo<=hi)
       {
         int mid=lo+(hi-lo)/2;
         if(arr[mid]==target)
         {
            flag=true;
            break;
         }
         else if(arr[mid]>target) hi=mid-1;
         else if(arr[mid]<target)  lo=mid+1;
       }
       if(flag==true) 
       System.out.print("target present");
       else System.out.print("target not found");
    }
}