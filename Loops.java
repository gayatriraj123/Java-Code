class Loops
{
    public static void main(String rr[]={10,20,30,40};
        int iCnt=0;

        System.out.println("traversal of array using for loop");

        for(icnt=0;iCnt<Arr.length;iCnt++)      //same in c,c++,java
        {

            System.out.println(Arr[iCnt]);

        }

         System.out.println("traversal of array using While loop");
         iCnt=0;
         while(iCnt<Arr.length)
         {
             System.out.println(Arr[iCnt]);
             iCnt++;
         }

         System.out.println("traversal of array using do While loop");
        iCnt=0;
        do
         {
             System.out.println(Arr[iCnt]);
             iCnt++;
         }while(iCnt<Arr.length);

          System.out.println("traversal of array using for each loop");
        for (int iNo:Arr)
        {
            System.out.println(iNo);
        }
    }
}