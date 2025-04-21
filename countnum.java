import java.util.Scanner;
public class countnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int n = sc.nextInt();
       // int count =0;
       int sum=0;
       int rem=0;
        while(n!=0) {
        // n=n/10;
        rem= n%10;
        sum=sum+rem;
        // count++;
         n=n/10;



       }
       System.out.println(sum);
    } 
}
