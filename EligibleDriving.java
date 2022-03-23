class EligibleDriving
{
    static void drivingLicense(int age,String bike)
    {
        if(age>18&& bike.equals("yes"))
        {
            System.out.println("Eligible");
        }
        else
        {
            throw new StringIndexOutOfBoundsException("Not Eligible");
        }
    }
        public static void main(String args[])
        {
            try 
            {
                drivingLicense(17,"yes");
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            finally
            {
                }
                }
            }
             
            