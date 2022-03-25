import java.util.*;
public class Stack1
{
    public static void main(String args[])
    {
        Stack<Integer>ls=new Stack();
        ls.push(12);
        ls.push(45);
        ls.push(32);
        ls.push(22);
        ls.push(22);
        ls.push(null);
        ls.pop();
        //s.remove(3);
        System.out.println(ls);
    }
    }