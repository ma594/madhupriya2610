import java.util.*;
class Amount
{
    Public Staic Void Main(String args[])
    {
        int amount,note=0,remain=0;
        scanner s=new scanner(system.in);
        System.out.println("enter amount");
        amount=sc.nextInt();
        if(amount>0)
        {
            note=amount/100;
            remain=amount%100;
        }
        Systemout.println("the no.of 100 notes are"+note);
        System.out.orintln("remaining amount is "+remain);
    
        }
    }
