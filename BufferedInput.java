import java.io.*;

class BufferedInput
{
    public static void main(String arg[]) throws IOException
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        String name = null;
        int age = 0;
        float marks = 0.0f;

        System.out.println("Enter your name :");
        name = bobj.readLine();

        System.out.println("Enter your age :");
        age = Integer.parseInt(bobj.readLine());

        System.out.println("Enter your marks :");
        marks = Float.parseFloat(bobj.readLine());

        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Marks : "+marks);

    }
}