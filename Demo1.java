class Demo
{
    public static void main(String arr[])
    {
    System.out.println("Inside main function");
    Maths mobj1=new Maths();
    Maths mobj2=new Maths(10,20);
    int iRet=0;

    iRet=mobj1.Addition();
    System.out.println("Addition is :"+iRet);
    iRet=mobj2.Addition();
    System.out.println("Addition is :"+iRet);

    }


}


class Maths
{
    public int iNo1;        //Characteristics
    public int iNo2;        //Characteristics

    public Maths()
    {
        System.out.println("Inside the defoult constructor");
        iNo1=0;
        iNo2=0;
    }
    public Maths(int a,int b)
    {
        System.out.println("Inside the parameterized constructor");
        iNo1=a;
        iNo2=b;

    }
    public int Addition()
    {
        int iAns=0;
        iAns = iNo1+iNo2;
        return iAns;
    }
    public int Subtraction()
    {
        int iAns=0;
        iAns = iNo1-iNo2;
        return iAns;
    }
}//End of Maths class

