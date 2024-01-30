import java.io.*;
class eightb
{
	public static void main(String arg[])throws IOException
	{
		int a;
		FileOutputStream fout;
		FileInputStream fin;
		try
		{
			fin = new FileInputStream("test.txt");
			fout = new FileOutputStream("final.txt");
			do
			{
				a = fin.read();
				if(a!=-1) 
				{
					fout.write(a);
				}
			}
			while(a!=-1);
			fin.close();
			fout.close();
			System.out.println("File copied...");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("unable to open the file to read from...");
		}
	}
}