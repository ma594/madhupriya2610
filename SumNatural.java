import java.util.*;
public class SumNatural
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value");
int n=sc.nextInt();
int i=1,sum=0;
while(i<=n)
{
sum=sum+i;
i++;
}
System.out.println("sum of first n natural numbers="+sum);
}
}