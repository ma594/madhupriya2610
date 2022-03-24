import java.util.*;
public class StudentS
{
    public static void main(String args[])
    {
        ArrayList<String> stu=new ArrayList();
        stu.add("1234");
        stu.add("Madhu");
        stu.add("cse");
        stu.add("9963585810");
        stu.add("12.78");
        stu.add("Madhu");
        System.out.println("studentDetails");
        for(String s:stu)
        {
            System.out.println(s);
        }
    }
}