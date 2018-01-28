import java.io.*;
class Exam
{
int a,b;
void set(int a,int b)
{
this.a=a;
this.b=b;
}
void output()
{
System.out.println(a +"\t" +b);
}
}
class EMain
{
public static void main(String arg[])
{
Exam e=new Exam();
e.set(2,3);
e.output();
}
}