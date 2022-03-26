import java.io.*;
 public class Throw
{
    void validate()throws IOException
    {
        System.out.println("validating");
    }
    public static void main(String args[])
    {
        try 
        {
           validate();
        }
        catch(Exception e)
        {
            System.out.println("e");