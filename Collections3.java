import java.util.*;

class Collections3
{
    public static void main(String arg[])
    {
        LinkedList <Book>lobj=new LinkedList<Book>();

        lobj.add(new Book("let us C",400));
        lobj.add(new Book("Data structure",700));
        lobj.add(new Book("C programming",300));
        lobj.add(new Book("Java programming",450));

        Iterator iobj = lobj.iterator();
        Book bref=null;

        while(iobj.hasNext())
        {
            bref=(Book)iobj.next();
            bref.Display();
        }

        lobj.clear();



    }
}

class Book
{
    public String Name;
    public int Price;
    
    public Book(String s,int i)
    {
        this.Name=s;
        this.Price=i;


    }
    public void Display()
    {
        System.out.println("Book name :"+this.Name+" Price :"+this.Price);

    }
}

