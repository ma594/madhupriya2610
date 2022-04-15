import java.util.*;
public class Odd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value");
int n=sc.nextInt();
int i=1;
while(i<=n)
{
if(i%2==1)
{
System.out.println(i+"is odd number");
i++;
}
}
}
}