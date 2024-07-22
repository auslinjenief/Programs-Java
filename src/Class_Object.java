
class students
{
	String name;
	int rollno;
	
	void display()
	{
		System.out.println("Student name : "+name);
		System.out.println("Student name : "+rollno);
	}
}

public class Class_Object{
	public static void main(String args[]) {
		students s1 = new students();
		students s2 = new students();
		s1.name="auslin";
		s1.rollno=3;
		s2.name="smith";
		s2.rollno=6;
		s1.display();
		s2.display();
		
	}
}

