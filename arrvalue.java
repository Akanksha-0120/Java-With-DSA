import java.util.Scanner;
public class arrvalue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter target element:");
        int x=sc.nextInt();
        System.out.print("enter size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("enter element of array:");
        
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }
        boolean flag = false;
        int count=0;
        for(int i=0;i<n;i++)
        { 
            if(arr[i]==x)  
            {flag=true;
                count++;
                //break;
            }
        }
        if(flag==true)  System.out.println("element found"+count+"times in this array");
        else  System.out.println("element not found");
   }
}
