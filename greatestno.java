
import java.util.Scanner;
public class greatestno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number:");
        int n1 = sc.nextInt();
        System.out.print("enter 2nd number:");
        int n2 = sc.nextInt();
        System.out.print("enter 3rd number:");
        int n3 = sc.nextInt();
        if(n1>n2 && n1>n3)
        {
            System.out.println("n1 is greatest");
        }
        else if(n2>n1 && n2>n3){
            System.out.println("n2 is greatest");
        }
        else if(n3>n1 && n3>n2){
            System.out.println("n3 is greatest");
        }
        else{
            System.out.println("invalid");
        }
    }
}        