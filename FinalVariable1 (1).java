import java.util.*;
public class FinalVariable1
{
    finalint rolln0=123;
    void display()
    {
        System.out.println("display");
    }
}
class Toppers
{
    void display()
    {
        System.out.println("edit");
    }
}
class Main
{
    public static void main(String args[])
    {
        Student s=new Student();
        s.rolln0=345;
        s.display();
        System.out.println(s.rolln0);
    }
}