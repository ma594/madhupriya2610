import java.util.*;
class Number1
{
    public static void main(String args[])
      {
          int number;
          Scanner sc=new Scanner(System.in);
          System.out.println("enter number");
          number=sc.nextInt();
          if(number>0)
          {
              System.out.println("positive number");
          }
          else if(number<0)
          {
              System.out.println("negative number");
          }
          else
          {
              System.out.println("zero");
          }
      }  
}