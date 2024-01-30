// Java program to print the area and perimeter of a circle.
class firstc
{
public static void main(String a[])
{
final float pi= 3.14f;
float r,area,perimeter;
r=Integer.parseInt(a[0]);
area= pi*r*r;
System.out.println("area of circle= "+area);
perimeter=2*pi*r;
System.out.println("perimeter of circle= "+perimeter);
}
}