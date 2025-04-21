import java.util.Scanner;
public class comprime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int n = sc.nextInt();
        for (int i = 2; i <= n-1; i++) {
            if (n%i==0) {
                System.out.println("compsite number");
                break;
            }
        }
        System.out.println("prime number");
        System.err.println("manish raj");
            }
    }
