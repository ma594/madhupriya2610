class Palindrome
{
    Public Static Void Main(String args[])
    {
        string s;
        int n,count=0,i,j;
        System.out.println("enter a string");
        Scanner s=new Scanner(System.in);
        s=sc.nextInt();
        n=s.length();
        j=n-1;
        for(i=0;i<n;i++)
        {
            if(char At(i)==charAt())
            {
                count++;
                j--;
            }
            else
            {
                break;
            }
        }
        if(count==0)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a plaindrome");
        }
            }
            }
        }
    }
}