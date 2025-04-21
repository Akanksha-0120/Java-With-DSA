class Person
{
    public String name,add;
    public int age;
}

class Student extends Person{
     public int marks;
     public String grade;

     Student(String name,String add,int age,int marks,String grade)
     {
        this.name=name;
        this.add=add;
        this.age=age;
        this.marks=marks;
        this.grade=grade;
     }

     public void disp()
     {
        System.out.println("Name is:"+name);
        System.out.println("Address is:"+add);
        System.out.println("Age is:"+age);
        System.out.println("Marks is:"+marks);
        System.out.println("Grade is:"+grade);
        System.out.println("Thank You!");
     }
}

public class inhertUsingconst {
    public static void main(String[] args) {
        
        Student stud =new Student("Akanksha","Ara",22,94,"A");
         stud.disp();
   
    }
}
