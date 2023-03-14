class Base
{
    public void fun()
    {
        System.out.println("Bse class");
    }
    public final void gun()
    {
        System.out.println("base gun");
    }
   
}
class Derived extends Base
{
    public void fun()
    {
        System.out.println("Derived fun");

    }
    public void gun()
    {
         System.out.println("");

    }

}

class Final2
{
    public static void main(String arr[])
    {
      Base obj=new Derived();

    }
}