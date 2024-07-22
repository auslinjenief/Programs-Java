//Functional interface --- Lambda expression (->)
@FunctionalInterface
interface myinter    
{
	void display();
}

public class Interface_Functional_Lambda {
	public static void main(String args[]) {
		myinter m = () -> 
		{
			System.out.println("In Display.....");
			System.out.println("In ///////.....");
		};
		m.display();
	}

}
