import java.util.*;
class Arithmatic 
{
    public int Division(int A,int B)throws ArithmaticException
    {
        int Ans=0;
        Ans=A/B;
        return Ans;

    }
}
class ThrowsDemo
{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number ");
        int iNo1=sc.nextInt();
        System.out.println("Enter second number ");
        int iNo2=sc.nextInt();

        Arithmatic aobj=new Arithmatic();
        try
        {
            int Ret=aobj.Division(iNo1,iNo2);
            System.out.println("Division is  "+Ret);


        }
        catch(ArithmaticException obj)
        {
            System.out.println("Exception occured ");
            System.out.println(obj);
        }


    }
}