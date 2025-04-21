class Empolyee
{
    private int age;
    private String id,name,add;
    public void setInfo(int age,String id,String name,String add)
    {
        this.age=age;
        this.id=id;
        this.name=name;
        this.add=add;
        
    }
      public void disp()
      {
        System.out.println("name::"+name);
        System.out.println("age::"+age);
        System.out.println("id::"+id);
        System.out.println("add::"+add);
      }
    

}

public class classempolyee {
    public static void main(String[] args) {
        Empolyee em=new Empolyee();
        em.setInfo(27,"Ak3245","Akanksha","Ara-Bihar");
        em.disp();
        
    }
}
