import java.io.*;
class SortData
{
int a[] = new int[10];
public void acceptData() throws IOException
{
int i ;
DataInputStream dir = new DataInputStream(System.in);
System.out.println("Enter Array elements");
for(i=0;i<=9;i++)
	{
		a[i] = Integer.parseInt(dir.readLine());
	}
}
public void asec()
{
int i,j,t;
for(i=0;i<=9;i++)
	{
		for(j=0;j<=8-i;j++)
			{
				if(a[j]>a[j+1])
				{
				t=a[j];
				a[j] = a[j+1];
				a[j+1] = t;
				}
			}
	}
}
public void desc()
{
int i,j,t;
for(i=0;i<=9;i++)
	{
		for(j=0;j<=8-i;j++)
			{
			if(a[j+1]>a[j])
				{
					t=a[j+1];
					a[j+1]=a[j];
					a[j]=t;
				}
			}	
	}
}
public void showData()
{
int i;
System.out.println("Sorted elements are :");
for(i=0;i<=9;i++)
	{
		System.out.println(a[i]);
	}
}
}
class foura
{
public static void main(String[] arg) throws IOException
{
SortData s =new SortData();
s.acceptData();
s.asec();
System.out.println("After Sorting in ascending order");
s.showData();
s.desc();
System.out.println("After sorting in decending order");
s.showData();
}
}