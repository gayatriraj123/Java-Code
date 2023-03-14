import java.util.*;

class ExcetiondemoSolution
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int ino1=0 , ino2=0, ians = 0;
        System.out.println("Enter first number :");
        ino1 = sobj.nextInt();
        System.out.println("Enter second number :");
        ino2 = sobj.nextInt();

        try 
        {
            System.out.println("Inside try block ");
            ians = ino1 / ino2;
            System.out.println("Division is :"+ians);
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Inside catch 1");
            System.out.println(obj);
        }

        catch(NullPointerException obj)
        {
            System.out.println("Inside catch 2");
        }

        catch(Exception obj)
        {
            System.out.println("Inside catch 3");
            System.out.println(obj);
        }

        finally
        {
            System.out.println(" Inside Finally Block ");
            sobj.close();

        }
    }
}