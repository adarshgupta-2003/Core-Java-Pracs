/*PRACTICAL 6.C -Write a java program for multiplying two matrices and print the product for the 
same.*/
import java.io.*;
class sixc
{ 
public static void main(String args[]) throws IOException
{
int i,j,s,k;
 int a[][]=new int [2][2];
int b[][]=new int[2][2];
int c[][]=new int [2][2];
DataInputStream dis=new DataInputStream(System.in);
System.out.println("ENter the values");
for(i=0;i<2;i++)
{
 for(j=0;j<2;j++)
{
 a[i][j]=Integer.parseInt(dis.readLine());
}
}
System.out.println("\n Enter the elements  for second matrix");
for(i=0;i<2;i++)
{
 for(j=0;j<2;j++)
{
 b[i][j]=Integer.parseInt(dis.readLine());
}
}
System.out.println("Multiplication of two matrix is");
for(i=0;i<2;i++)
{
 for(j=0;j<2;j++)
{
s=0;
for(k=0;k<2;k++)
{
 s=s+(a[i][k]*b[k][j]);
}
c[i][j]=s;
}
}
for(i=0;i<2;i++)
{
 for(j=0;j<2;j++)
{
System.out.println(c[i][j]+"\t");
}
System.out.println();
}
}
}