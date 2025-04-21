import java.util.Scanner;
public class facto {
    public static int fact(int n)
    {
        if(n==1) return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int n=sc.nextInt();
        System.out.print("factorial of "+n+" is "+fact(n));
    }
}
