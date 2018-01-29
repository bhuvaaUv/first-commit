import java.io.*;
class Add
{
int a,b,c;
void input()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a,b");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
}
void process()
{
c=a+b;
}
void output()
{
System.out.println(c);
}
}
class AMain
{
public static void main(String arg[])throws IOException
{
Add x=new Add();
x.input();
x.process();
x.output();
}
}
