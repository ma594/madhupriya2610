import java.util.*;
public class Swap
{
    public static void main(String args[])
    {
        int i,j,n,max;
        Scanner sc=new Scanner("System.in");
        System.out.println("Enter size of an array");
        n=sc.nextInt();
        int a[]=new int[n];
        //reading  elements from user
        System.out.println("Enter array elements");
        for(inti=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        //sorting
        for(inti=0;i<n;i++)
        {
            if(a[i]>a[j])
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
}