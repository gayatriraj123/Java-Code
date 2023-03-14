class InterfaceDemo
{
    public static void main(String args[])

    {
        System.out.println("Value of PI is :"+Circle.PI);

        Circle cobj = new Marvellous();
        float ret=0.0f;
        ret = cobj.Area(10.5f);
        System.out.println("Arae is :"+ret);
        ret = cobj.Circumfarance(10.5f);
        System.out.println("Circumfarence is "+ret);

    }
}

interface Circle
{
    float PI = 3.14f;

    float Area(float Radius);
    float Circumfarance(float Radius);

}

class Marvellous implements Circle
{
    public float Area(float Radius)
    {
        return PI*Radius*Radius;
    }
    public float Circumfarance(float Radius)
    {
        return 2*PI*Radius;
    }
}

