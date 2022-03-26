import java.util.*;
public class Negative
{
    public static void main(String args[])
    {
        int size,i;
        int positive count=0,negative count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("please Enter Number of elements in an array");
        size=sc.nextInt();
        int a[]=sc.nextInt[size];
        System.out.println("please Enter"+size+"elements of an Array");
        for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<size;i++)
        {
            if(a[i]>=0)
            {
                negative count++;
            }
        }
        System.out.println("\n Total Number of Positive Numbers in this Array="+Positive count);
        System.out.println("\n Total Number of Negative Numbers in this Array="+Negative count);
            }
        }
        
