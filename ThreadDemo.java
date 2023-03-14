class ThreadDemo2
{
    public static void main(String arg[])
    {
        System.out.println("Inside the method ");
        Demo obj1=new Demo();
        Demo obj2=new Demo();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.setName("First");       
        t2.setName("Second");

        t1.start();
        t2.start();
        
    }
    
}

class Demo implements Runnable
{
    public void run()
    {
        int i=0;
        for(i=1; i<=1000;i++)
        {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
