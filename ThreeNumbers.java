import java.util.*;
public class ThreeNumbers
{
public static void main(String args[])
Scanner sc=new Scanner(System.in);
System.out.println("Enter three integers:");
int num1=sc.nextInt();
int num2=sc.nextInt();
int num3=sc.nextInt();
if(num1>num2 && num1>num3)
{
System.out.println("The largest integer is: "+num1);
}
else if(num2>num1 && num2>num3)
{
System.out.println("The largest integer is:"+num2);
}
else if(num3>num1 && num3>num2)
{
System.out.println("The largest integer is:" +num3);
}
else
{
System.out.println("The integers are same");
}
}