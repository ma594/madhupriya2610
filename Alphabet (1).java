import java.util.*;
public class Alphabet
{
public static void main(String args[])
{
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the character");
ch=sc.next().charAt(0);
if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
System.out.println(ch+"is an alphabet");
else
System.out.println(ch+"is not an alphabet");
}
}