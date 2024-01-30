import java.io.*;
public class eightc
{
public static void main(String ar[])throws Exception
{
int roll;
String name, city;
DataInputStream dis = new DataInputStream(System.in);
File file = new File("Student_data.txt");
file.createNewFile();
FileWriter writer = new FileWriter(file);
System.out.println("Enter students roll number: ");
roll = Integer.parseInt(dis.readLine());
System.out.println("Enter Students Name: ");
name = dis.readLine();
System.out.println("Enter students city: ");
city = dis.readLine();
writer.write("Roll Number is: "+roll);
writer.write("Name: "+name);
writer.write("City: "+city);
writer.flush();
writer.close();
System.out.println("Student data is saved in the file");
}
}