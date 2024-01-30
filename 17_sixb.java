/*Write a program to add two matrices and print the resulyant matrix*/
import java.io.*;
class sixb
{
public static void main(String args[]) throws IOException
{
	int i,j;
	int a[][]=new int[2][2];
	int b[][]=new int[2][2];
	int c[][]=new int[2][2];
	DataInputStream dis=new DataInputStream(System.in);
	System.out.println("Enter the values");
	for(i=0;i<2;i++)
	{
	 for(j=0;j<2;j++)
	 {
	  a[i][j]=Integer.parseInt(dis.readLine());
	 }
	}
	System.out.println("\nEnter the elements for second matrix");
	for(i=0;i<2;i++)
	{
	 for(j=0;j<2;j++)
	 {
	  b[i][j]=Integer.parseInt(dis.readLine());
	 }
	}
	System.out.println("Addition of two matrix is");
	for(i=0;i<2;i++)
	{
	 for(j=0;j<2;j++)
	 {
	  c[i][j]=a[i][j]+b[i][j];
	 }
	}
	for(i=0;i<2;i++)
	{
	 for(j=0;j<2;j++)
	 {
	  System.out.println(c[i][j]+ "\t");
	 }
	 System.out.println();
	}
}
}