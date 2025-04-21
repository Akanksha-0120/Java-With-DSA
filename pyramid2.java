import java.util.Scanner;
public class pyramid2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
        int nst=1;
        int spc=n-1;
        for(int i=1;i<=n;i++)
        {
           // for(int j=1;j<=n+1-i;j++)
           for(int j=1;j<=spc;j++)
           {
              System.out.print(" "+" ");
            }
            for(int j=1;j<=nst;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
            spc--;
            nst+=2;
        }
    }
}
