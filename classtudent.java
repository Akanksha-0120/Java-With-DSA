class Student
{
    private int rollno;
    private String name ,standard,address;

    public void setRoll(int rollno)
    {
        this.rollno=rollno;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setStandard(String standard)
    {
        this.standard=standard;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public int getRoll()
    {
        return rollno;
    }
    public String getName()
    {
        return name;
    }
    public String getStandard()
    {
        return standard;
    }
    public String getAddress()
    {
        return address;
    }
}

public class classtudent {
    public static void main(String[] args) {
        Student st=new Student();
        st.setRoll(02);
        st.setName("Akanksha Bharti");
        st.setStandard("BTech");
        st.setAddress("Ara-Bihar");
        System.out.println("name :: "+st.getName());
        System.out.println("roll no :: "+st.getRoll());
        System.out.println("course :: "+st.getStandard());
        System.out.println("address :: "+st.getAddress());
    }
}
