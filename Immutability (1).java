import java.util.*;
public class Immutability
{
    public static void main(String args[])
    {
        String s="virat";
        s.concat("kohli");
        System.out.println(s);//will print virat because stings are Immutable objects
        String s1=s.concat("kohli");
        System.out.println(s1);//will print virat  kohli because result is stored in new string
    }
}