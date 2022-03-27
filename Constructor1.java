import java.util.*;
public class Constructor1
{
    public static void main(String args[])
    {
        int rolln0;
        String name;
        String section;
        int marks;
        String address;
        //consructor overloading
        {
            Student(int rolln0,String name,string section,int marks,String address)
            {
            this.rolln0=rolln0;
            this.name=name;
            this.marks=marks;
            this.address=address;
            }
            student()
            {
                this.student(123,"madhu","A",50,"manthena");
            }
            student(int r)
            {
                rollno=r;
            }
            void display()
            {
                System.out.println(rollno+"\n"+name+"\n"+section+"\n"+marks+"\n"=address);
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
        class Main
        {
            public static void main(String args[])
            {
                Student std1=new Student(123,"madhu",'A',90,"vijayawada");
                System.out.println("student 1 information");
                std1.display();
                std1.reading();
                std1.writing();
                Student std2=new Student(345);
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