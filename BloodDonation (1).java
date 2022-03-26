import java.util.*;
class BloodDonation
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int age,weight;
System.out.println("Enter age");
age=sc.nextInt();
System.out.println("Enter weight");
weight=sc.nextInt();
if(age>=18 && weight>=50)
{
System.out.println("eligible for blood donation");
}
else
{
    System.out.println("not eligible for blood donation");
}
}
}