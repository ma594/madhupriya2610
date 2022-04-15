import java.util.*;
public class Bubble
{
    public static void main(String args[])
    {
        int i,j,n,t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements to array:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The elements before sorting is:");
        for(i=0;i<n;i++)
        {
            System.out.println("\t" +a[i]);
        }
    }
}