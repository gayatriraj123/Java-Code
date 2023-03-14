
class StaticDemo
{
    static 
    {
        System.out.println("Inside static block of staticDemo class  which contain main ")

    }
    public StaticDemo()
    {
        System.out.println("Value of No1 :"+this.No1);
       
     }
    
    public static void main(String args[])
    {
        System.out.println("Inside main");
        System.out.println("value of static no3 :"+Demo.No3);
        System.out.println("value of static no4 :"+Demo.No4);
        Demo.Gun();
        
        Demo obj1=new Demo();
        Demo obj2=new Demo();

        obj1.Fun();

    }
}

class Demo
{
    public int No1;          //non Static characteristics
    public int No2;          //non Static characteristics
    public static int No3;      //Static characteristics
    public static int No4;       //Static characteristics

    static                         //static block
    {
        System.out.println("Inside static block of Dmeo class ");
        No3 = 51;
        No4 = 101;

    }
    public Demo()               //constructor
    {
        System.out.println("Inside constructor");
        No1=11
        No2=21;


    }
    public void Fun()
    {
        //non static method can access static as well as non staic data
        System.out.println("Inside non static method fun ");
        System.out.println("Value of No1 :"+this.No1);
        System.out.println("Value of No2 :"+this.No2);
        System.out.println("Value of No3 :"+this.No3);
        System.out.println("Value of No4 :"+this.No4);
    }

    public static void Gun()
    {
        System.out.println("Inside static method gun");
       // System.out.println("Value of No1 :"+No1);
       // System.out.println("Value of No2 :"+No2);
        System.out.println("Value of No3 :"+No3);
        System.out.println("Value of No4 :"+No4);

    }



}