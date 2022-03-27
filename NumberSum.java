import java.util.*;
public class NumberSum
{
    public static void main(String args[])
    {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=i+sum;
        }
        System.out.println(sum);
        }
    }