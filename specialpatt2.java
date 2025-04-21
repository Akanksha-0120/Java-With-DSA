import java.util.Scanner;
public class specialpatt2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
       // int count=1;
       for(int i=1;i<=2*n-1;i++)
        {
             System.out.print(i+" ");
        }
           System.out.println();
           n--;
           for(int i=1;i<=n;i++)
          {
            int a =1;
            for(int j=1;j<=n+1-i;j++)
           {
             // System.out.print(j+" ");
              System.out.print(a+++" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
             // System.out.print("  ");
              System.out.print(" "+" ");a++;
             }
           //  for(int j=n+1-i;j>=1;j--)
           for(int j=1;j<=n+1-i;j++)
           {
            
              //System.out.print(2*n+2-j+" ");
              System.out.print(a+++" ");
            }
             System.out.println();
          }
     }
 }

