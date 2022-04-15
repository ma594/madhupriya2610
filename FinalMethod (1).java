import java.util.*;
public class FinalMethod
{
    final int rolln0=123;
    void display()
    {
        System.out.println("display");
    }
}
class Main
{
    public static void main(String args[])
    {
        Student s= new Student();
        s.rolln0=345;
        s.display();
        System.out.println(s.rolln0);
    }
}