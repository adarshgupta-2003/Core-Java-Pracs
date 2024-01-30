import pack.shop;
import java.util.Scanner;
class package1
{
	int customer;
	void get()
	{
		System.out.println("Enter customer id : ");
		Scanner e = new Scanner(System.in);
		customer = e.nextInt();
	}
}
class sixa
{
	public static void main(String a[])
	{
		package1 p = new package1();
		shop ss = new shop();
		ss.acceptorder();
		ss.calculatebill();
		p.get();
	}
}