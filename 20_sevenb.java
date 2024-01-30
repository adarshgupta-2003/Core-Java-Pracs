import java.io.*;
class A extends Thread
{
	public void run()
	{
		System.out.println("Thread A");
		System.out.println("i in Thread A");
		for(int i=0;i<=5;i++)
		{
			System.out.println("i = "+i);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Exception ocurs "+e);	
			}
		}
		System.out.println("Thread A completed");
	}
}

class B extends Thread
{
	public void run()
	{
		System.out.println("Thread B");
		System.out.println("i in Thread B");
		for(int i=0;i<=5;i++)
		{
			System.out.println("i = "+i);
		}
		System.out.println("Thread B completed");
	}
}

class sevenb
{
	public static void main(String a[])
	{
		A Threada = new A();
		B Threadb = new B();
		Threada.start();
		Thread.yield();
		try
		{
			Threada.sleep(5000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception occurs : "+e);
		}
		Threadb.start();
		System.out.println("Main Thread End");
	}
}