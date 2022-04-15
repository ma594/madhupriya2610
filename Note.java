import java.util.*;
public class Note
{
public static void main(String args[])
{
int amount,r2000=0,r500=0,r200=0,r100=0,r50=0,r20=0,r10=0,r5=0,r2=0,r1=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter amount");
amount=sc.nextInt();
while(amount>=2000)
{
r2000=amount/2000;
amount=amount%2000;
System.out.println("\nTotal Number of 2000 Rupees Notes are:"+r2000);
break;
}
while(amount>=500)
{
r500=amount/500;
amount=amount%500;
System.out.println("\nTotal Number of 500 Rupees Notes are:"+r500);
break;
}
while(amount>=200)
{
r200=amount/200;
amount=amount%200;
System.out.println("\n Total Number of 200 Rupees Notes are:"+r200);
break;
}
while(amount>=100)
{
r100=amount/100;
amount=amount%100;
System.out.println("\n Total Number of 100 Rupees Notes are:"+r100);
break;
}
while(amount>=50)
{
r50=amount/50;
amount=amount%50;
System.out.println("\n Total Number of 50 Rupees Notes are:"+r50);
break;
}
while(amount>=20)
{
r20=amount/20;
amount=amount%20;
system.out.println("\n Total Number of 20 Rupees Notes are:"+r20);
break;
}
while(amount>=10)
{
r10=amount/10;
amount=amount%10;
System.out.println("\n Total Number of 10 Rupees Notes are:"+r10);
break;
}
while(amount>=5)
{
r5=amount/5;
amount=amount%5;
System.out.println("\n Total Number of 5 Rupees Coin are:"+r5);
break;
}
while(amount>=2)
r2=amount/2;
amount=amount%2;
System.out.println("\nTotal Number of 2 Rupees Coin are:"+r2);
break;
}
while(amount>=1)
r1=amount/1;
amount=amount%1;
System.out.println("\nTotal Number of 1 Rupees Coin are:"+r1);
break;
int sum=r2000+r500+r200+r100+r50+r20+r10+r5+r2+r1;
System.out.println("\nTotal Number of Notes require:\n"+sum);
}