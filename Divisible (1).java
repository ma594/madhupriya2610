import java.util.*;
public class Divisible
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers  you want to check  whether it is divisible by 5 or 11");
int number=sc.nextInt();
if((number%5==0)&&(number%11==0))
{
System.out.println("The number is divisible by 5 or 11");
}
else
{
System.out.println("The number is not divisible by 5 or 11");
}
}
}