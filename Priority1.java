import java.util.*;
public class Priority1
{
    public static void main(String args[])
    {
        PriorityQueue <Integer> os=new PriorityQueue();
        os.add(12);
        os.add(45);
        os.add(32);
        os.add(22);
        os.add(22);
        //Os.add(null);
        os.remove(3);
        System.out.println("os");
    }
}