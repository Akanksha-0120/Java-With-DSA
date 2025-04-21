import java.util.Scanner;
public class abcdpattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
        //int count='A'-n-1;
        for(int i=1;i<=n;i++)
        {
           // for(int j=1;j<=i;j++)
          for(int j=1;j<=i;j++)
          //for(int j=n;j>=i;j--)
          //for(int j=1;j<=n+1-i;j++)
            {
               // if(i%2==1)
               // {
                    System.out.print(j+" ");
                    
                //}
               // else System.out.print((char)(j+64)+" ");
               //System.out.print((char)(j+64-64)+" ");
               //System.out.print((char)(j+64+i-1)+" ");
              // System.out.print((char)(j+97)+" ");
             // System.out.print("* ");
             // System.out.print((char)(j+64)+" ");
              //System.out.print((char)(i+64)+" ");
             //System.out.print(j+" ");
             //System.out.print(i+" ");
              System.out.print(2*j-1+" ");
             // System.out.print((char)(j+64+i*3-n+1)+" ");
            }
            System.out.println();
        }
    }
}