
/*
 *  Implementing multithreading in java using
               1.Thread class
               2.Runnable Interface
                      (Functional interface) --> Lambda Expression
 */

class hii extends Thread
{
	public void run()
	{
		for(int i=0; i<100;i++) {
			System.out.println("Hii");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
	}
}
class hello extends Thread
{
	public void run()
	{
		for(int i=0; i<100;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
	}
}
public class Multithreading_Thread {
	public static void main(String[] args) throws Exception {
		hii obj1 = new hii();
		hello obj2 = new hello();
		obj1.start();
		Thread.sleep(500);
		obj2.start();
	}

}
