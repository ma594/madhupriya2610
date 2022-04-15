import java.util.*;
public class StringBuffer1
{
    public static void main(String args[])
    {
        StringBuffer str=new StringBuffer("madhu");
        str.append("Priya");
        System.out.println(str);
        str.insert(0,"priya");
        System.out.println(str);
        System.out.println(str.reverse());
        System.out.println(str.delete(0,4));
    }
}