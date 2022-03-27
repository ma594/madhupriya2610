import java.util.*;
public class TwoDimension
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][4];
        System.out.println("Enter array elements");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                a[i][j]=sc.nextInt();
            }
            System.out.println("i+j+t");
        }
        System.out.println();
    }
}