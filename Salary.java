class Salary
{
 public static void main(String args[]) 
 {
  float Basic_salary,DA,HRA,da1,hra1,GrossPayment;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Basic Salary Of Employee: ");
  Basic_salary=sc.nextFloat();
  System.out.println("Enter Basic DA Of Employee: "); 
  da1=sc.nextFloat();
  System.out.println("Enter Basic HRA Of Employee: ");
  hra1=sc.nextFloat();
  DA=(da1*Basic_salary)/100;
  HRA=(hra1*Basic_salary)/100;
  GrossPayment=Basic_salary+DA+HRA;
  System.out.println("Gross Salary Of Employee: "+GrossPayment);
  }
}