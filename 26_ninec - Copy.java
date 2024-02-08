import java.io.*;

class ninec
{
public static void main(String args[])
{
int a,b,c;
DataInputStream dis = new DataInputStream(System.in);
System.out.println("Main Starts");
System.out.println("Enter two values: ");

try
{
a = Integer.parseInt(dis.readLine());	
b = Integer.parseInt(dis.readLine());	
c = a/b;
System.out.println("Division: "+c);
}

catch(ArithmeticException ae)
{
System.out.println("Arithmetic Exception occured");
}

catch(NumberFormatException nfe)
{
System.out.println("Number format exception occurs");
}

catch(IOException ioe)
{
System.out.println("IO Exception occurs");
}

finally
{
System.out.println("Finally executes always");
}
System.out.println("Main Ends");
}
}

