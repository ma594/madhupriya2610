import java.util.*;
public class Alphabet1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any character:");
char ch=sc.next().charAt(0);
if((ch=='a'&&ch=='z')||(ch=='A'&&ch=='Z'))
{
System.out.println(ch +"is Alphabet");
}
else if(ch>='0'&&ch<='9')
{
System.out.println(ch +" is A DIGIT.");
}
System.out.println(ch +" is A CHARACTER");
}
}