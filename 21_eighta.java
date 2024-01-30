import java.io.*;
class eighta
{
	public static void main(String arg[])throws IOException
	{
		int a;
		String fname;
		DataInputStream dis = new DataInputStream(System.in);
		FileInputStream fin;
		System.out.println("Enter file name to read : ");
		fname = dis.readLine();
		try
		{
			fin = new FileInputStream(fname);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
			return;
		}
		do
		{
			a = fin.read();
			if(a!=-1) 
			{
				System.out.print((char)a);
			}
		}
		while(a!=-1);
		fin.close();
	}
}