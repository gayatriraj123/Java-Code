class Demo
{
    public int No1;
    public final int No2=11;
    public final int no3;

    public Demo()
    {
        No1=0;
        No2=21;
    }
}

class Final1
{
    public static void main(String arr[])
    {
        Demo d=new Demo();
        d.No1++;
        //d.No2++;
       // d.No3++;

    }
}