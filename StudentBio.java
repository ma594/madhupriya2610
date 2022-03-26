import java.util.*;
class StudentBio
{
    int rollno;
    String name;
    String section;
    int marks;
    String address;
    Static string college name;
    Static
    {
    College name="bitlabs";
    }
    //constructor overloading
    Student (int rollno,String name,String section,int marks,String address)
    {
        this.rollno=rollno;
        this.name=name;
        this.section=section;
        this.marks=marks;
        this.address=address;
    }
    Student()
    {
        this(123,"madhu","A",50,"vijayawada");
    }
    Student(int r)
    {
        rollno=r;
    }
    void display()
    {
        System.out.println(rollno+"\n"+name+"\n"+section+"\n"+marks+"\n"+address);
    }
    void reading()
    {
        System.out.println(name+"reading");
    }
    void writing()
    {
        this.reading();
        System.out.println(name+"writing");
    }
}
class main
{
    public static void main(String args[])
    {
        Student std1=new Student (123,"priya","A",94,"manthena");
        //student .college name="bitlabs";
        System.out.println("Student 1 information");
        std1.display();
        System.out.println(Student.collegename);
        std1.reading();
        std1.writing();
        Student std2=new Student(3,4,5);
        System.out.prntln("student 2  information");
        std2.display();
        System.out.println(student.collegename);
        std2.reading();
        std2.writing();
        Student std3=new Student();
        System.out.println("student 3 information");
        std3.display();
        System.out.println(student.collegename);
        std3.reading();
        std3.writing();
    }
}
        