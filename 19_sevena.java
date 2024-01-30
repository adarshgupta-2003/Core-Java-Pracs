import java.util.Vector;
public class sevena
{
	public static void main(String a[])
	{
		Vector v = new Vector();
		v.add("red");
		v.add("Green");
		v.add("Blue");
		System.out.println(v);
		v.add(2,"Yellow");
		System.out.println(v);
		System.out.println("Element at 3rd position : "+v.get(3));
		System.out.println("First Element : "+v.firstElement());
		System.out.println("last Element : "+v.lastElement());
		System.out.println("is this vector is empty : "+v.isEmpty());
	}
}