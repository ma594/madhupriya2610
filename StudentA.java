import java.util.*;
class StudentA
{
    int rollno;
    String name;
    String sec;
     student(int r,String n,String s);
{
    rollno=r;
    name=n;
    sec=s;
}
}
class Main
{
    public static void main(String args[])
    {
        ArrayList<Student>stu=new ArrayList();
        Scanner s=new Scanner(System.in);
        int rollno;
        String name;
        String sec;
        for(int i=0;i<2;i++)
        {
            System.out.println("Enter rollno");
            rollno=sc.nextInt();
            System.out.println("Enter name");
            name=sc.nextInt();
            System.out.println(" Enter section");
            sec=sc.nextInt();
            stu.add(newstudent(rollno,name,sec));
        }
        for(student st:stu)
        {
            System.out.println(st.name+st.sec+st.rollno);
        }
    }
}
        
