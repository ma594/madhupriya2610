  interface add
{​
public void addition();
}​
class sub implements add
{​
public void addition()
{​
int a=10,b=20,c;
c=a+b;
System.out.println("The Addition value is:"+c);
}​
}​

class Main
{​
public static void main(String[] args)
{​
sub s=new sub();
s.addition();
}