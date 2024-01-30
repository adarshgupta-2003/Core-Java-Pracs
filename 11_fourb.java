import java.io.*;
class Cricketer
{
String name;
String team;
int age;
Cricketer()
{
name=" ";
team =" ";
age=0;
}
Cricketer(String n,String t,int a)
{
name= n;
team=t;
age = a;
}
public String toString()
{
return "this is "+name+" of "+team;
}
}
class fourb
{
public static void main(String[] arg)
{
Cricketer c1 = new Cricketer();
Cricketer c2 = new Cricketer(" Sachin "," India ",32);
System.out.println(c2);
c1.name=" Virat";
c1.team=" India";
c1.age=32;
System.out.println(c1);
}
}