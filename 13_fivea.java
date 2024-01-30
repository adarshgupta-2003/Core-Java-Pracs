class Student
{
  int rollNumber;
  String name;
  int marks;

  void getData(int r, String n, int m)
  {
    rollNumber = r;
    name = n;
    marks = m;
  }

  void showData()
  {
    System.out.println("Roll number: " + rollNumber);
    System.out.println("Name: " + name);
    System.out.println("Marks: " + marks);
  }
}

class Result extends Student
{
  char grade;

  void getGrade()
  {
    if (marks >= 80)
      grade = 'A';
    else if (marks >= 60)
      grade = 'B';
    else if (marks >= 40)
      grade = 'C';
    else
      grade = 'D';
  }

  void showResult()
  {
    System.out.println("Grade: " + grade);
  }
}

public class fivea
{
  public static void main(String[] args)
  {
    Result student1 = new Result();
    student1.getData(1, "Freddy", 69);
    student1.getGrade();
    student1.showData();
    student1.showResult();
  }
}