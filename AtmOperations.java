import java.util.Scanner.*;
class AtmOperations
{
    //declare Wcount variable
    int wcount=1;
    double bal=10000;
    Scanner sc=new Scanner(System.in);
    //create method called deposit
    public void deposit()
    {
        int amt=0;
        System.out.println("Enter Deposit amount");
        amt=s.nextInt();
        bal=bal+amt;
        System.out.prinln("Available bal:+bal");
    }
    //create method called withdraw()
    public void withdraw()
    {
        int amt=0;
        System.out.println("Enter withdraw amount");
        amt=s.nextInt();
        bal=bal-amt;
        wcount++;
        System.out.print("Availablebal:+bal");
    }
    //create view options()method
    pubic voidview options()
    {
        //display listofoptionssuchas 1.deposit 2.withdraw 3.balanceenquiry  0.Exit
        System.out.println("\n 1.Deposit");
        System.out.println("2.withdraw");
        System.out.println("3.balance enquiry");
        System.out.println("0.exit");
        //accept option from user
        System.out.println("Enter your option");
        int option=s.nextInt();
        switch(option)
        {
            case 1:
                {
        //call deposit() method and view options()method deposit();
        view options();
        break;
                }
                case 2:
                    {
                        //check wcount<=3 or not,if condition is true call withdraw() and view options()
                        if(wcount<=3)
                        {
                            withdraw();
                            view options();
                        }
                        else
                        {
                            //throw Arithmetic Exception thrownew ArthimeticExceptionYourwithdraw limit is over");
                        }
                        break;
                    }
                    case 3:
                        {
                            //call balenquiry() and view options()methodbalenquiry();
                            view options();
                            break;
                        }
                        case 0:
                        {
                            System.out.println("Thank you visit again");
                            break;
                        }
                        default:
                        {
                            System.out.println("Invalid option");
                        }
        }
    }
}
        