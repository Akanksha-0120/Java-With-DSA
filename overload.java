class calculator
{
    int add(int x,int y)
    {
        return 30;
    }
    float add(int x,int y)
    {
        return 30.5;
    }
}
public class overload {
    public static void main(String[] args) {
     calculator clc=new calculator();
     float res=add(10,20);
     System.out.println(res);
    }
}
//output=compilation error that is return type do not have any significance in method overloading