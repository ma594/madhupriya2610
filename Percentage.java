import java.util.*;
public class Percentage
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the marks of five subjects::\n");
Float physics=in.nextFloat();
Float chemistry=in.nextFloat();
Float biology=in.nextFloat();
Float mathematics=in.nextFloat();
Float computer=in.nextFloat();
Float total;
Float average;
Float percentage;
char grade;
total=physics+chemistry+biology+mathematics+computer;
average=(float)(total/5.0);
percentage=(float)((total/500.0)*100);
if(average>=90)
grade='A';
else if(average>=80 && average<90)
grade='B';
else if(average>=70  && average<80)
grade='C';
else if(average>=60 && average<70)
grade='D';
else if(average>=40 && average<50)
grade='E';
else
grade='F';
System.out.println("\nThe Total marks  ="+total +"/500.0");
System.out.println("\nThe Average marks ="+ average);
System.out.println("\nThe Percentage     ="+ percentage +"%");
System.out.println("\nThe Grade           ="+grade+"");
}
}



