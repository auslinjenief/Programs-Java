            /*
            * Abstraction (abstral
            -> Abstract method (method having only declaration)
            * -> Definition will be written in Derived Class
            * -> Abstract Class (contains atleast one abstract method)
            * -> Concrete Class (class which doen't contain any abstract method)
            * -> We cannot Create for abstract class
            */

abstract class employee
{
	 abstract void display();
}
class servent extends employee
{
	void display()
	{
		System.out.println("Absctraction in derived class ");
	}
}

public class Abstractiondemo {
	public static void main(String[] args) {
		servent s = new servent();
		s.display();
	}

}
