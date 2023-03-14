import java.util.*;
class AgeInvalid extends Exeption() 
{
    

}
class UserDefined
{
    public static void main(String arr[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter your age :");
        int iAge=sobj.nextInt();

        try 
        {
            if(iAge<15)
            {
                throw new AgeInvalidException("Your age is less then 15");

            }
            else
            {
                System.out.println("Age is invalid ");

            }
            catch(AgeInvalidException obj)
            {
                System.out.println(obj);
            
            }
        }

    }
}