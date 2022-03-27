import java.util.*;
public class NumberMul
{
    public  static void main(String args[])
    {
        int n,sum=0,i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();
        while(i<=10)
        {
            int mul=n*i;
            System.out.println(n+"*"+i+"="+mul);
            i ++;
        }
    }
}