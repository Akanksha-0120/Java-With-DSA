import java.util.Scanner;
public class opptriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
        //int count=1;
        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=n;j++)
           {
              if(i+j>n)
              System.out.print("* ");
              else System.out.print("  ");//for one space it print like a pyramid and for two sapce it print like a opposite half triangle
           }
           System.out.println();
        }

    }
}
