import java.util.Scanner;
public class character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter any character:");
        char ch=sc.next().charAt(0);
        System.out.println("the value of character:"+(int)ch);
    }
}
