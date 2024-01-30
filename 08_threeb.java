// Java function that calculates the sum of digits for a given char array consisting of the digits '0' to '9'. The function should return the digit sum as a long value
import java.util.*;
class threeb
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
System.out.print("Enter the any string : ");
String s=ob.nextLine();
count(s);
}
public static void count(String str)
{
int sum=0;
int d=0;
char ch[]=str.toCharArray();
for(int i=0;i<str.length();i++)
{
if(Character.isDigit(ch[i]))
{
sum=Character.getNumericValue(ch[i]);
}
}
System.out.println("Your Addition is : " +sum);
}
}