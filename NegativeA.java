import java.util.*;
public class NegativeA
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number you want to check");
 n =sc.nextInt();
if(n >0)
{
System.out.println("Enter the number is positive");
}
else if(n <0)
{
System.out.println("Enter the number is negative");
}
else
{
System.out.println("Enter the number is zero");
}
}
}