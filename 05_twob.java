// Java program to convert a decimal number to binary number and vice versa.
import java.io.*;
public class twob
{
public static void main(String a[])throws IOException
{
int decimal_num,i,decimal;
long binary_num;
DataInputStream dis=new DataInputStream(System.in);
System.out.println("Enter a decimal number: ");
decimal_num=Integer.parseInt(dis.readLine());
int binary[]= twob.convertDecimalToBinary(decimal_num);
System.out.println("its equivalent binary number is: ");
for(i=binary.length-1;i>=0;i--)
{
System.out.print(binary[i]);
}
System.out.println ("enter A binary number: ");
binary_num=Long.parseLong(dis.readLine());
decimal = twob.convertBinaryToDecimal(binary_num);
System.out.println("its equivalent decimal number is: "+decimal);
}
public static int[] convertDecimalToBinary (int num)
{
int bin[]=new int[30];
int i=0;
while(num>0)
{
bin[i++]=num%2;
num=num/2;
}
return bin;
}
public static int convertBinaryToDecimal (long num)
{
int decimalNumber=0;
int i=0;
long remainder;
while(num!=0)
{
remainder=num%10;
num=num/10;
decimalNumber=decimalNumber +(int)(remainder*Math.pow(2,i));
++i;
}
return decimalNumber;
}
}