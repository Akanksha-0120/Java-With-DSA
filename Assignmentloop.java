import java.util.Scanner;
public class Assignmentloop {
    public static int gcd(int x,int y)
    {
        if(y==0) return x;
         return gcd(y,x%y);
    }
    static boolean ispalindrome(String s)
    {
        int low=0;
        int high=s.length()-1;
        while(low<high)
        {
            if(s.charAt(low)!=s.charAt(high)) return false;
            low++;
            high--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Q-1:
        System.out.print("enter a nuumber:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum of "+n+" natural number is "+sum);
        //Q-2:
        System.out.println("table of "+n+" number is: ");
        for(int i=1;i<=10;i++)
        {
            System.out.println(i*n);
        }
        //Q-3:
        System.out.print("enter a nuumber:");
        int m=sc.nextInt();
        int resgcd=gcd(n,m);
        System.out.println(resgcd);
        //Q-4:
        System.err.println("enter a string:");
        String s=sc.nextLine();
        System.out.println(s+" is palindrome : "+ispalindrome(s));
        //Q-5:
        int n1=0,n2=1,n3,i,count=13;
        System.out.println(n1);
        System.out.println(n2);
        for(i=2;i<count;i++)
        {
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
}
