
/* Thread class method :
       join(), isAlive(), setPriority(),getPriority(),getName(), setName(), sleep()
 */
          
public class ThreadClass_method {
	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(() ->
		{
			for(int i=0; i<5;i++) {
				System.out.println("Hii");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {}
			}
		});
		t1.start();
	    //We dont have start method in Runnable or run method but it has in thread
		Thread.sleep(500);
		Thread t2 = new Thread(()->
		{
			for(int i=0; i<5;i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {}
			}
			});
		t2.start();
		t1.setName("First thread");
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		t2.setPriority(8);
		System.out.println(t2.getPriority());
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive());
		System.out.println("Good morning");
	}

}


