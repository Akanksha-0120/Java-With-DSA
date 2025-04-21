import java.util.Scanner;
public class AssignmentCondition {
    public static void profitloss(float x,float y)
    {
        if(x==y) System.out.println("no loss no profit");
        else if(x>y) System.out.println("profit");
        else if(y>x) System.out.println("loss"); 
    }
   public static void leapyear(int n)
    {
       if(n%4==0||n%400==0) System.out.println("leap year");
       else System.out.println("not");
    }
    public static void greatest3num(int x,int y,int z)
    {
        if(x>y&&x>z) System.out.println("a is greatest");
        else if(y>x&&y>z) System.out.println("b is greatest");
        else System.out.println("c is greatest");
    }
    public static void typesOfTriangle(int a,int b,int c)
    {
        if(a==b&&b==c&&c==a) System.out.println("equilateral triangle");
        else if(a==b||b==c||a==c) System.out.println("isosceles triangle");
        else System.out.println("saclene triangle");
    }

    public static void leastnum(int x,int y,int z)
    {
        if(x<y&&x<z) System.out.println("a is smallest");
        else if(y<x&&y<z) System.out.println("b is smallest");
        else System.out.println("c is smallest");
    }
    public static void main(String[] args) {
    //Q-1:
    Scanner sc=new Scanner(System.in);
     System.out.print("enter any number:");
    int n=sc.nextInt();
    if(n%2==0) System.out.println("even");
    else System.out.println("odd");
    //Q-3:
    System.out.print("enter selling price:");
    float sp=sc.nextFloat();
    System.out.print("enter cost price:");
    float cp=sc.nextFloat();
    profitloss(sp,cp)
    //Q-4:
    System.out.println("enter any year:");
    int year=sc.nextInt();
    leapyear(year);
   //Q-5:
    System.out.println("enter a :");
    int a=sc.nextInt();
    System.out.println("enter b :");
    int b=sc.nextInt();
    System.out.println("enter c :");
    int c=sc.nextInt();
    greatest3num(a,b,c);
    //Q-6:
    System.out.println("enter side x :");
    int x=sc.nextInt();
    System.out.println("enter side y :");
    int y=sc.nextInt();
    System.out.println("enter side z :");
    int z=sc.nextInt();
    typesOfTriangle(x,y,z);
    System.out.println("enter a :");
    int a=sc.nextInt();
    System.out.println("enter b :");
    int b=sc.nextInt();
    System.out.println("enter c :");
    int c=sc.nextInt();
    leastnum(a,b,c);
    //Q-2:
    System.out.print("enter any number:");
    int m=sc.nextInt();
    System.out.print("absolute integers:");
    if(m<0)
   {
        System.out.println((-1)*n);
    }
    if(m>0)
   {
        System.out.println(n);
    }
      
 }

}
