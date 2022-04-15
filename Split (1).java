import java.util.*;
public class Split
{
    public static void main(String args[])
    {
        String name=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter studentdetails");
        name=sc.nextLine();
        String words[]=name.split("");
        for(int i=0;i<words.length;i++)
        {
            System.out.println(words[i]);
        }
    }
}