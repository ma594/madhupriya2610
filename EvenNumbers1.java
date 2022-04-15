import java.util.*;
public class EvenNumbers1
{
public static void main(String args[])
{
int i,num;
int evenSum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number for num");
num=sc.nextInt();
i=0;
while(i<=num)
{
if(i%2==0)
evenSum=evenSum+i;
i++;
}
System.out.println("sum of all even numbers are:"+evenSum);
}
}