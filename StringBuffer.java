import java.util.*;
public class StringBuffer
{
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer("Madhu");
        //sb.append("Thadiboina");
        sb.insert(9,"Thadiboina");
        System.out.println(sb);
    }
}