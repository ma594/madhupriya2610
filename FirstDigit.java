import java.util.*;
public class FirstDigit
{
    public static void main(String args[])
    {
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();
        int lastdigit=n%10;
        while(n>=9)
        {
            n=n/10;
        }
        int firstdigit=n;
        System.out.println("first digit");
        System.out.println("last digit");
    }
}