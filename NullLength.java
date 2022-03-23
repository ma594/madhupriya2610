import java.util.*;
public class NullLength
{
    public static void main(String args[])
    {
        String s=null;
        try 
        {
            System.out.println(s.length());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("my name is madhu");
        }
    }