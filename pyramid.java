import java.util.Scanner;
public class pyramid {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
        int count=1;
        for(int i=1;i<=n;i++)
        {
           // for(int j=1;j<=n+1-i;j++)
           for(int j=1;j<=n-i;j++)
           {
              System.out.print(" "+" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print(j+" ");
                //System.out.print(count+" ");
                //count++;
            }
            System.out.println();
        }
    }
}
