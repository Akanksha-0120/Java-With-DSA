import java.util.Scanner;

public class naturnum {
   /*  public static void nat(int n)
    {
        if(n==0) return ;
        nat(n-1);

        System.out.println(n);
        //nat(n-1);
    }
    */
    public static void nat(int x,int n)
    {
        if(x>n) return ;
        System.out.println(x);
        nat(x+1,n);
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int n=sc.nextInt();
       // System.out.print("all number of "+n+" is "+nat(n));
      // nat(n);
        nat(1,n);
    }
}  

