import java.io.*;
class FinalInput
{
    public static void main(String args[])
    {
        try 
        {
          FileInputStream file=new FileInputStream("abc.txt");
          int i=0;
          while((i=file.read())!=-1)
          {
              System.out.println((char)i);
          }
          }
          catch(Exception e) 
          {
            }finally
            {
              
        }
    }
}