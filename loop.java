package Marvellous.PPA;

public class Loop
{
    public void Display()
    {
        int Arr[]=new int[4];

        Arr[0]=10;
        Arr[0]=20;
        Arr[0]=30;
        Arr[0]=40;

        System.out.println("elements of array are :");
        for(int iCnt=0;iCnt<Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]);

        }
    }
}