import java.util.*;
class Employee
{
    int id;
    String name;
    String department;
    int salary;
    Employee (int i,String n,String d,int sy)
    {
    id =i;
    name=n;
    department=d;   
    salary=sy;
    }
}
class Main
{
    public static void main(String args[])
    {
        ArrayList<Employee> emp=new ArrayList();
        
            Scanner sc=new Scanner(System.in);
        int id;
        String name;
        String department;
        int salary;
        for( int i=0;i<2;i++)
        {
                        System.out.println("Enter id no");
            id=sc.nextInt();
            System.out.println("enter name");
                        name=sc.next();
            System.out.println("enter department");
            department=sc.next();
            System.out.println("enter salary");
            salary=sc.nextInt();
                emp.add(new Employee(id,name,department,salary));
        }
                    for(Employee st:emp)
            {
                System.out.println(st.name+" "+st.department+" "+st.id+" "+st.salary);
            }
    }
}
        
        