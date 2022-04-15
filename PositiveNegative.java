import java.util.*;
public class PositiveNegative
{
public static void main(String args[])
{
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number you want to check");
 num =sc.nextInt();
if(num>0)
{
System.out.println("Enter the number is positive");
}
else if(num<0)
{
System.out.println("Enter the number is negative");
}
else
{
System.out.println("Enter the number is zero");
}
}
}