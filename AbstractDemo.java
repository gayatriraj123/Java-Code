abstract class Arithmatic
{
    public int Addition(int no1 , int no2)
    {
        return no1+no2;
    }
    public abstract int Substraction(int no1 , int no2);
}

class Marvellous extends Arithmatic
{
    public int Substraction(int no1 , int no2)
    {
        return no1-no2;
    }
}

class AbstractDemo
{
    public static void main(String arg[])
    {
        Arithmatic aobj = new Marvellous();
        Marvellous obj = new Marvellous();
        int ret = 0;
        ret = mobj.Addition(11,10);
        System.out.println("Addition is :"+ret);
        ret = mobj.Sunstraction(11,10);
        System.out.println("Substraction is :"+ret);
        
    }
}