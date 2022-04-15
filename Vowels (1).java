import java.util.*;
public class Vowels
{
    public static void main(String args[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        s=sc.next();
        s=s.toLowercase();
        System.out.println("Vowels are");
        for(int i=0;i<s.length;i++)
        {
            if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                System.out.println("+"s.charAt(i));
            }
        }
        System.out.println("\n consonants are");
        for(int i=0;i<s.length;i++)
        {
            if(s.charAt(i)!='a'&&s.charAt(i)!='e'&&s.charAt(i)!='i'&&s.charAt(i)!='o'&&s.charAt(i)!='u')
            {
                System.out.println("+"s.charAt(i));
            }
        }