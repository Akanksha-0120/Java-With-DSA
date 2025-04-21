class Person
{
    public int age;
    public String name,address;
}
//single inheritance
class Student extends Person{
    public String course;
    public int rollno;
   /*  public int marks;
    public String grade;
    Student(String name,int age,int marks,String grade,String address)
    {
        this.name=name;
        this.age=age;
        this.marks=marks;
        this.grade=grade;
        this.address=address;
    }
    public void disp()
    {
        System.out.println("Id of a Student--->");
        System.out.println("Name :: "+name);
        System.out.println("Age :: "+age);
        System.out.println("Marks :: "+marks);
        System.out.println("Grade :: "+grade);
        System.out.println("Address :: "+address);
    }
*/
}
//multilevel inheritance
class Exam extends Student{
    public int marks;
    public String grade;
    Exam(String name,int rollno,int age,int marks,String grade,String course,String address)
    {
        this.name=name;
        this.rollno=rollno;
        this.age=age;
        this.marks=marks;
        this.grade=grade;
        this.course=course;
        this.address=address;
    }
    public void disp()
    {
        System.out.println("Id of a Student--->");
        System.out.println("Name :: "+name);
        System.out.println("Roll-No. :: "+rollno);
        System.out.println("Age :: "+age);
        System.out.println("Marks :: "+marks);
        System.out.println("Grade :: "+grade);
        System.out.println("Course :: "+course);
        System.out.println("Address :: "+address);
    }
}
//multiple inheritance
class Result extends Student  Exam{
      public String result;
      Result(String name,int rollno,int age,int marks,String grade,String course,String address)
    {
        this.name=name;
        this.rollno=rollno;
        this.age=age;
        this.marks=marks;
        this.grade=grade;
        this.course=course;
        this.address=address;
    }
    public void disp()
    {
        System.out.println("Id of a Student--->");
        System.out.println("Name :: "+name);
        System.out.println("Roll-No. :: "+rollno);
        System.out.println("Age :: "+age);
        System.out.println("Marks :: "+marks);
        System.out.println("Grade :: "+grade);
        System.out.println("Course :: "+course);
        System.out.println("Address :: "+address);
    }
}
//hierarchical inheritance
class Empolyee extends Person{
     public String id;
     Empolyee(String name,int age,String id,String address){
        this.name=name;
        this.age=age;
        this.id=id;
        this.address=address;
     }
     public void show()
     {
        System.out.println("Id of a Empolyee--->");
        System.out.println("Name :: "+name);
        System.out.println("Age :: "+age);
        System.out.println("Id No. :: "+id);
        System.out.println("Address :: "+address);
    }
 }


public class singleinhe {
    public static void main(String[] args) {
        Exam st=new Exam("Akanksha Bharti",2210401,22,90,"A","BTech","Ara-Bihar");
        st.disp();
        System.out.println();
      // Empolyee em=new Empolyee("Akanksha Bharti",22,"AB-22IT","Ara-Bihar");
       // em.show();
    }
}
