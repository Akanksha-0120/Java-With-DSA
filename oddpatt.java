import java.util.Scanner;
public class oddpatt {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
        //int count=1;
        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=n;j++)
           {
            // if(i==n/2+1|| j==n/2+1 )
           // if(i==j||i+j==n+1)
           if(i==n/2||j==n/2)
             {
                System.out.print("*"+" ");
             }
            else System.out.print("  ");
            //else System.out.print('0'+" ");
           }
            System.out.println();
        }
    }
}
