import java.util.ArrayList;
import java.util.List;

public class Comparatorwithcustom {
public static void main(String args[]) {
	List<Student> stud=new ArrayList<>();
	stud.add(new Student(1,65));
	stud.add(new Student(2,75));
	stud.add(new Student(3,45));
	stud.add(new Student(4,95));
	stud.add(new Student(5,95));
	for(Student s:stud)
		
	{
		System.out.println(s);
	}
}
}
class Student 
{
	int rollno;
	int marks;
	public Student(int rollno,int marks)
	{
		this.rollno=rollno;
		this.marks=marks;
	}
	public String toString()
	{
		return "Student("+"rollno"+rollno+",marks="marks''	}
}