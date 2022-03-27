import java.util.*;
public class NWhileLoop
{
    public static void main(String args[])
    {
        int i=1, n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        n=sc.nextInt();
        while(i<=n)
        {
            System.out.println(i);
            i ++;
        }
    }
}  