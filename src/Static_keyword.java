

class student
{
	String name;
	int age;
	static String teacher;
	
	void display()
	{
		System.out.println("Student name is : "+name);
		System.out.println("Student age is : "+age);
		System.out.println("Teacher name is : "+teacher);
	}
	
	static
	{
		student.teacher = "Karunanithi";
	}
}
public class Static_keyword {
	public static void main(String[] args) {
		student s1 = new student();
		student s2 = new student();
		s1.name = "Auslin";
		s1.age = 23;
//		s1.teacher = "Vinoth";
//		student.teacher = "Jayalalitha";
		s2.name = "Smith";
		s2.age = 20;
//		s2.teacher = "Harish";
		s1.display();
		s2.display();
	}

}
