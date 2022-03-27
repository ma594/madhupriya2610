import java.util.*;
public class Static&NonStatic
{
    int rolln0;
    String name;
    String section;
    int marks;
    String address;
    //constructor overloading
    Student(int rolln0,String name,String section,int marks,String address)
    {
        this.rolln0=rolln0;
        this.name=name;
        this.section=section;
        this.marks=marks;
        this.address=address;
    }
    Student()
    {
        this(123,"madhu",'A',50,"manthena");
    }
    Student(int r)
    {
        rolln0=r;
    }
    //static methods
    static void collegename()
    {
        System.out.println("bitlabs");
    }
    void display()
    {
        System.out.println(rolln0+"\n"+name+"\n"+section+"\n"+marks+"\n"+address);
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