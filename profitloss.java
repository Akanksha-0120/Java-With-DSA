import java.util.Scanner;
public class profitloss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter selling price:");
        int sp=sc.nextInt();
        System.out.print("enter cost price:");
        int cp=sc.nextInt();
        if(sp>cp)
        {
            System.out.println("profit is");
            System.out.println(sp-cp);
            
        }
        else if(cp>sp){
           System.out.println("loss is");
           System.out.println(cp-sp);
        }
        else  System.out.println("no profit no loss");
    }
}
