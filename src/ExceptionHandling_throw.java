
public class ExceptionHandling_throw {
	public static void main(String[] args) {
		try {
			int a = 5/0;
			throw new ArithmeticException();
		}
		catch(ArithmeticException e){
			System.out.println("Exception :"+e);
		}
	}

}
