import java.util.*;
public class ArrayElement
{
    public static void main(String args[])
    {
        int a[]=new int[100];
        Scanner sc=new Scanner(System.in);
        //read the elements from user to arrays
        System.out.println("Enter array elements");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
            //print array elements
            System.out.println("array elements are");
            for(int i=0;i<5;i++)
            {
            System.out.println(a[i]);
        }
    }
}