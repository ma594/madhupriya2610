import java.util.*;
public class NumberDo
{
    public static void main(String args[])
    {
        int i=1,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        n=sc.nextInt();
        do
        {
            System.out.println(i);
            i++;
        }
        while(i<=n);
        }
    }