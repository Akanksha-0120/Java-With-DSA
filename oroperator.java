import java.util.Scanner;
public class oroperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number:");
        int n = sc.nextInt();
        if(n%5==0||n%3==0)
        System.out.println("divisible");
        else{
            System.out.println("not divisible");
        }
    }
}
