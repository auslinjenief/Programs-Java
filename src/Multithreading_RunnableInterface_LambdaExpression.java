
public class Multithreading_RunnableInterface_LambdaExpression {
	public static void main(String[] args) throws Exception {
//		Runnable obj1 = () ->
//			{
//				for(int i=0; i<10;i++) {
//					System.out.println("Hii");
//					try {
//						Thread.sleep(1000);
//					} catch (Exception e) {}
//				}
//			};
//		Runnable obj2 = ()->
//			{
//				for(int i=0; i<10;i++) {
//					System.out.println("Hello");
//					try {
//						Thread.sleep(1000);
//					} catch (Exception e) {}
//				}
//				};
		Thread t1 = new Thread(() ->
		{
			for(int i=0; i<10;i++) {
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
			for(int i=0; i<10;i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {}
			}
			});
		t2.start();
	}

}



