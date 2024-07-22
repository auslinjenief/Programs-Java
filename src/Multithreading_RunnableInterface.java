
class hiii implements Runnable
{
	public void run()
	{
		for(int i=0; i<10;i++) {
			System.out.println("Hii");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
	}
}
class helloo implements Runnable
{
	public void run()
	{
		for(int i=0; i<10;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
	}
}
public class Multithreading_RunnableInterface {
	public static void main(String[] args) throws Exception {
		Runnable obj1 = new hiii();
		Runnable obj2 = new helloo();
		
		Thread th = new Thread(obj1);
		th.start();
	//We dont have start method in Runnable or run method but it has in thread
		Thread.sleep(500);
		Thread t2 = new Thread(obj2);
		t2.start();
	}

}
