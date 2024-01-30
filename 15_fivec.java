class  MyShape
{
	void displayArea()
	{
	 System.out.println("This is display area method of class MyShape");
	}
}

interface MyImage
{
	void drawImage();
	void inputImage();
}

interface MyColor
{
	void inputColor();
}

public class fivec extends MyShape implements MyImage,MyColor
{
	public void drawImage()
	{
		System.out.println("Now we are overriding the drawImage method of Interface MyImage");
	}
	public void inputImage()
	{
		System.out.println("Now we are overriding the inputImage method of Interface MyImage");
	}
	public void inputColor()
	{
		System.out.println("Now we are overrriding the inputColor method of Interface MyImage");
	}
	public void display()
	{
		System.out.println("disp function of class InterfaceTest05");
	}

	public static void main(String ss[])
	{
		fivec obj = new fivec();
		obj.drawImage();
		obj.inputImage();
		obj.inputColor();
		obj.displayArea();
		obj.display();
	}
}