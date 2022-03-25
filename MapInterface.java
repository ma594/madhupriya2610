import jaa.util.*;
public class MapInterface
{
public static void main(String args[])
{
    HashMap <Integer,String>map=new HashMap();
    map.put("1.Apple");
        map.put("2.Banana");
    map.put("3.Orange");
    map.put("4.Papayya");
    map.put("5.Mango");
    //set.add(null);
    //set.add(null);
    System.out.println(map.get(2));
    for(map.Entry m:map.entryset())
    {
        System.out.print(m.getkey()"+"+m.getvalue());
    }
}
}