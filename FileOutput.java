import java.io.*;
 class FileOutput
{
    public static void main(String args[])
    {
        try 
        {
         FileOutputStream file=new FileOutputStream("abc.txt");
         file.write(78);
         file.close();
        } 
        catch(Exception e) 
        {
        
        System.out.println(e);
        }
    }
}