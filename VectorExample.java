import java.util.*;
    public class VectorExample
    {
        public static void main(String args[])
        {
            Vector<Integer> ok=new Vector();
            ok.add(10);
            ok.add(20);
            ok.add(30);
            ok.add(40);
            ok.add(20);
            System.out.println(ok);
            System.out.println(ok.remove(1));
            /*ok.addFirst(10);
            ok.addLast(90);*/
            
            System.out.println(ok.get(3));
            System.out.println(ok.indexOf(40));
        }
        
    }
