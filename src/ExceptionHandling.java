
public class ExceptionHandling {
	public static void main(String[] args) {
		try {
			int a = 5/0;
			try {
				int arr[] = {2}; 
				arr[10] = 25;
				System.out.println("inner try");
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Inner catch : +e");
			}
		}
		catch(ArithmeticException e) {
			System.out.println("Exception : "+e);
		}
		finally {
			System.out.println("Bye User");
		}
		
	}

}
