import java.util.*;
public class InterfaceShape
{
    void draw();
    default void print()
    {
        System.out.println("hi");
    }
    static void show()
    {
        System.out.println("bitlabs");
    }
}
class circle implements shape
{
    public void draw()
    {
        System.out.println("circle");
    }
}
class main
{
    public static void main(String args[])
    {
       Circle c=new Circle();
       c.draw();
       c.print();
       shape.show();
    }
}