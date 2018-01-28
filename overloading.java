import java.io.*;
class Sum
{
int sum(int a,int b)
{
return (a+b);
}
float sum(float a,float b)
{
return(a+b);
}
double sum(double a,double b)
{
return(a+b);
}
}
class Main
{
public static void main(String args[])
{
Sum s=new Sum();
System.out.println(s.sum(10,20));
System.out.println(s.sum(10.0f,20.0f));
System.out.println(s.sum(10.0,20.0));
}
}