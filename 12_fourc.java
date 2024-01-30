abstract class Shape
{
public abstract float calculateArea();
public void displayArea()
{
System.out.println("Display Area function of Shape Class");
}
}

class fourc extends Shape
{
float radius;
public float calculateArea()
{
return ((radius*radius)*(22/7));
}
public static void main(String ss[])
{
fourc c = new fourc();
c.radius = 10f;
float area;
c.displayArea();
area = c.calculateArea();
System.out.println("Area of Circle is "+ area);
}
}