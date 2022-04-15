import java.io.*;
 class FinalOutputA
{
    public static void main(String args[])
    {
        try 
        {
          FileOutputStream file=new FileOutputStream("abc.txt");
          String s="Welcome bitlabs Welcome bitlabs Welcome bitlabs";
          byte a[]=s.getBytes();
          file.write(a);
          file.close();
        } 
        catch(Exception e) 
        {
        System.out.println(e);
        } 
        }
        }