import java.io.*;
import java.util.*;
abstract class shape
{
	class Shape_area
{
	public static void main(String args[])
{
	double base,height,len,wid,area;
	triangle t1=new triangle();
	rectangle r1=new rectangle();
	
	System.out.printf("\n Enter Base Triangle::\t");
	Scanner in_obj=new
Scanner(System.in);
	base=in_obj.nextDouble();

	System.out.printf("\n Enter Height Triangle::\t");
	height=in_obj.nextDouble();
	t1.set_dimension(base,height);
	area=t1.compute_area();
	System.out.printf("\n Area of Triangle::\t"+area);
	
	System.out.printf("\n Enter Length of Rectangle::\t");
	len=in_obj.nextDouble();
	System.out.printf("\n Enter Width of Rectangle::\t");
	wid=in_obj.nextDouble();
	
	r1.set_dimension(len,wid);
	area=r1.compute_area();
	System.out.printf("\n Area of Rectangle::\t"+area);
}
} 
abstract class shape
{
	double length,height;
	abstract double compute_area();
}
class triangle extends shape
{
	void set_dimension(double b,double h)
{
	length=b;
	height=h;
}
	double compute_area()
{
	double area;
	area=0.5*length*height;
	return area;
}
}
class rectangle extends shape
{ 
	void set_dimension(double l,double h)
{
	length=l;
	height=h;
}
	double compute_area()
{
	double area;
	area=length*height;
	return area;
}
}abstract double compute_area();
}
class triangle extends shape
{
	void set_dimension(double b,double h)
{
	length=b;
	height=h;
}
	double compute_area()
{
	double area;
	area=0.5*length*height;
	return area;
}
}
class rectangle extends shape
{ 
	void set_dimension(double l,double h)
{
	length=l;
	height=h;
}
	double compute_area()
{
	double area;
	area=length*height;
	return area;
}
}



