class Person
{
int id;
String name;
public Person(int n,String str)
{
System.out.println("This is Constructor of class Person");
id= n;
name= str;
}
public void display()
{
System.out.println("Your No : "+id);
System.out.println("Your Name : "+name);
}
}

class Emp02 extends Person
{
float salary;
public Emp02(int n,String str,float s)
{
super(n,str);
System.out.println("This is Constructor of Class Emp");
salary=s;
}
public void display()
{
super.display();
System.out.println("Your Salary : " +salary);
}
}

class fiveb
{
public static void main(String args[])
{
Emp02 obj=new Emp02(111,"Justin",150000.00f);
obj.display();
}
}