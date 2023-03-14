import java.util.*;

class Collection7
{
    public static void main(String arg[])
    {
        Hashtable <String, Integer>hobj = new Hashtable<String, Integer>();

        hobj.put("PPA", 18000);
        hobj.put("LB", 18000);
        hobj.put("Python", 18000);
        hobj.put("LSP", 18000);

        System.out.println(hobj.get("Python"));

        hobj.remove("LB");

        Enumeration eobj = hobj.keys();

        while(eobj.hasMoreElements())
        {
            System.out.println("value is :"+eobj.nextElement());

        }



    }
}


