import java.util.*;
class ExceptionAssign
{
public static void main(String args[])
{
int num1,num2,result;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st number num1:");
num1=sc.nextInt();
System.out.println("Enter 2nd number num2:");
num2=sc.nextInt();
result=num1/num2;
System.out.println("Division is:"+result);
if(sc.hasNextInt())
{
System.out.println("Division is:"+result);
}
else if(num2==0)
{
throw new ArithmeticException("Divide by zero is not possible");
}
else
{
throw new NumberFormatException("Number is not integer");
}
}
}




