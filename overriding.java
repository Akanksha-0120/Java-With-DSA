class Parent
{
    public void property()
    {
        System.out.println("land+cash+gold");
    }
    public void marry()
    {
        System.out.println("relative girl");
    }
}

class Child extends Parent
{
    
   public void marry()
   {
    System.out.println("someother girl");
   }
}

public class overriding {
    public static void main(String[] args) {
    System.err.println("what parent wants::-");
    Parent p=new Parent();
    p.property();
    p.marry();
    System.out.println("this is what child wants::-");
    Child c=new Child();
    c.property();
    c.marry();
    }
}
