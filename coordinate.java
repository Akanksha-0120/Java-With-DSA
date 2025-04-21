import java.util.Scanner;
public class coordinate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter x coordinate:");
        int x = sc.nextInt();
        System.out.print("enter y coordinate:");
        int y = sc.nextInt();

        // if(x=0 && y=0)  System.out.println("origin");

          if (x>0 || x<0) 
            System.out.println("x-coordinate");
        


        else if(y<0 || y>0) System.out.println("y-coordinate");
        
        else if(x>0 && y>0)  System.out.println("1st-coordinate");

        else if(x<0 && y>0)  System.out.println("2nd-coordinate");

        else if(x<0 && y<0)  System.out.println("3rd-coordinate");

        else if(x>0 && y<0)  System.out.println("4th-coordinate");

        else   System.out.println("origin");
    }
}
