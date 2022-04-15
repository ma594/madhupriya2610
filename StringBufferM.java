import java.util.*;
public class StringBufferM
{
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer("Madhu");
        //sb.append("Priya");
        sb.insert(5,"Priya");
        System.out.println(sb.reverse());
    }
}