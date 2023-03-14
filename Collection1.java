import java.util.*;

class Collection1;
{
    public static void main(String arg[])
    {
        LinkedList <Integer>lobj = new LinkedList<Integer>();

        lobj.add(11);
        lobj.add(21);
        lobj.add(51);
        lobj.add(101);
        lobj.add(111);

        System.out.println("Elements of linked list are "+lobj);

        lobj.addFirst(1);
        System.out.println("Elements are linked list are :"+lobj);

        lobj.addLast(121);
        System.out.println("Elements of Linked List are :"+lobj);

        Iteration iobj.iterator();
        System.out.println("Data using iterator is :");
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }

        if(lobj.contains(121))
        {
            System.out.println("121 is present in linkedList ");

        }
        else 
        {
            System.out.println("121 is not present in LinkedList ");
        }

        lobj.remove();
        System.out.println("Elements of ")














        lobj.clear();
        System.out.println("Elements of linked list are :"+lobj);
        

    }
}