// Java program to reverse a string.
import java.util.*;
class twoc
{
public static void main (String aa[])
{
String original,reverse="";
Scanner in= new Scanner(System.in);
System.out.print("Enter the string to reverse: ");
original=in.nextLine();
int length=original.length();
for(int i=length-1;i>=0;i--)
{
reverse=reverse+original.charAt(i);
}
System.out.println("Reverse of Entered string: "+reverse);
}
} 