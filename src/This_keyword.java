
class thiskey
{
	int num1;
	int num2;
	
	  void getdata(int num1, int num2)
	   {
		   this.num1 = num1;
		   this.num2 = num2;
	   }
	  
	   void display()
	   {
		   System.out.println("The value of num1 : "+ num1);
		   System.out.println("The value of num2 : "+ num2);
	   }

}

public class This_keyword {
	public static void main(String args[]) {
		thiskey obj = new thiskey();
		obj.getdata(10,20);
		obj.display();
	}

}
