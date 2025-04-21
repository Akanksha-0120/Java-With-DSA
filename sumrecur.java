import java.util.Scanner;

public class sumrecur {
    public static int sum(int n)
    {
        if(n==0) return 0;
      //  int sum=0;
       // sum=sum+n;
        return n+ sum(n-1);
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int n=sc.nextInt();
        System.out.print(sum(n));
    }
}
