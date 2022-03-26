import java.util.*;
class Student
{
    int rollno;
    String name;
    String section;
    int marks;
    String address;
    //constructor overloading
    Student(int r,String n,String s,int m,String a);
    {
        rollno=r;
        name=n;
        Section=s;
        marks=m;
        address=a;
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
        System.out.println(name+"writing");
    }
}
    class main
    {
        public static void main(String args[])
        {
            Student std1=new Student(123,"madhu","n",90,"manthena");
            System.out.println("student 2 information");
            std2.display();
            std2.reading();
            std2.writing();
            Student std3=new Student();
            System.out.println("student 3 information");
            std3.display();
            std3.reading();
            std3.writing();
        }
    }