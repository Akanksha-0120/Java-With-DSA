import java.util.Scanner;
public class m2Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number");
        int n = sc.nextInt();
        int nsp=n-1;
        int nst=1;
        for ( int i = 1; i<=n; i++) {
            for(int j=1;j<=nsp;j++)
            {
                System.out.print(" "+" ");
            }
            for(int j=1;j<=nst;j++)
            {
                //System.out.print("*"+" ");
                System.out.print(j+" ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
         nsp=1;
         nst=nst-4;
        for ( int i = 1; i<=n; i++) {
            for(int j=1;j<=nsp;j++)
            {
                System.out.print(" "+" ");
            }
            for(int j=1;j<=nst;j++)
            {
               // System.out.print("*"+" ");
                System.out.print(j+" ");
            }
            nsp++;
            nst-=2;
            System.out.println();
        }
    }
}
