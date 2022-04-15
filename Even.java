import java.util.*;
public class Even
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value");
int n=sc.nextInt();
int i=0;
while(i<=n)
{
if(n%2==0)
{
System.out.println(i+"is even number");
i++;
}
}
}
}