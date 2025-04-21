import java.util.Scanner;

public class stairpath {
     public static int strpth(int n)
    {
       // if(n<=1) return 1;
       //if(n<=2)  return n;
       if(n<=3)  return n;
     // return strpth(n-1)+strpth(n-2);
        return strpth(n-1)+strpth(n-3);
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int n=sc.nextInt();
        System.out.print("all  possible number of "+n+" stair path is "+strpth(n));
   }
}
