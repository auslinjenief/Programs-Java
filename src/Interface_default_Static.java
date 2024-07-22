//Default and Static method in Interface
/*-->interface only support abstract method but we can achieve
                              by default and static.
 -->If we want to print the method we need to 
                            create a class and create object for that class */ 
interface def
{
	default void display()// if it is static we can call by interface name as def.display();
	{
		System.out.println("In display");
	}
}
class imp implements def  
{
	
}
public class Interface_default_Static {
	public static void main(String[] args) {
		imp i = new imp();
		i.display();
	}
}
                     /*
                     * abstract class declare and define methods
                     * interface only method declaration
                     */