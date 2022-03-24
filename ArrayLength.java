import java.util.*;
public class ArrayLength
{
    public static void main(String args[])
    {
       ArrayList stu=new ArrayList();
        stu.add("1234");
        stu.add("Mdhupriya");
        stu.add ("cse");
        stu.add ("9154516102");
        stu.add ("12.78");
        System.out.println("studentDetails");
        //System.out.println(stu.size());
        //System.out.println(stu.get(3));
        for(int i=0;i<stu.size();i++)
        {
            System.out.println(stu.get(i));
        }
    }
}