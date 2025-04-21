import java.util.Scanner;
public class numSpiral {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
       // int count=1;
        for(int i=1;i<=2*n-1;i++)
        {
           // for(int j=1;j<=n+1-i;j++)
           for(int j=1;j<=2*n-1;j++)
           {
            int a=i,b=j;
            if(i>n) a=2*n-i;
            if(j>n)  b=2*n-j;
           // int a=2*n-i,b=2*n-j;
           // if(i<n) a=i;
            //if(j<n)  b=j;
            //int a=i,b=2*n-j;
           // if(i>n) a=2*n-i;
            //if(j>n)  b=j;
            System.out.print(n+1-Math.min(a,b)+" ");
           // System.out.print(Math.max(a,b)+" ");
           }
           System.out.println();
        }
    }
}
