import java.util.*;
 public class Binary
{
    public static void main(String args[])
    {
        int i,n,start,end,mid,key;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array size:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Elements to Array:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The Elements in an Array is:");
        for(i=0;i<n;i++)
        {
            System.out.println(" "+a[i]);
        }
    System.out.println("\nEnter the value for search:");
    key=sc.nextInt();
    start=0;
    end=a.length-1;
    mid=(start +  end)/2;
    while(start <= end)
    {
        if(a[mid] < key)
        {
            start=mid + 1;
        }
        else if (a[mid] == key)
        {
            System.out.println(key+"Element is found at index:" + mid);
            break;
        }
        else
        {
            end=mid - 1;
        }
        mid=(start + end)/2;
        }
        if(start >end)
        {
            System.out.println("Element is not found");
        }
    }
}