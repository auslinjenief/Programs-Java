

                        //Final (variable, method, class)
                        // variable --> used to declare as Constant
                        // method --> cannot be overridden
                        //class --> cannot be inherited
class X
{
	void show()
	{
		System.out.println("Class X ");
	}
}

class Y extends X
{
	void show()
	{
		System.out.println("Class Y");
	}
}
public class final_keyword {
	public static void main(String[] args) {
		Y obj = new Y();
		obj.show();
	}

}
