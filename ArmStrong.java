import java.util.*;
public class ArmStrong
{
    public static void main(String args[])
    {
        int t,d=0,sum=0,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        while(n!=0)
        {
            temp=d%10;
            sum=sum*temp*temp*temp;
            d=d%10;
        }
        if(n==sum)
        {
          System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not an ArmStrong");
        }
        }
        }