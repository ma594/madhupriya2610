import java.util.*;
public class NumberCount
{
    public static void main(String args[])
    {
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();
        while(n!=10)
        {
            n=n/10;
            count ++;
        }
        System.out.println(count);
    }
}