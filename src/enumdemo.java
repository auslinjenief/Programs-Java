
// Enum - Group of named constants
enum shapes {
	CIRCLE,TRIANGLE, SQUARE;
}
public class enumdemo {
	public static void main(String args[]) {
		shapes obj = shapes.SQUARE;
//		shapes obj1 = shapes.TRIANGLE;
//		System.out.println(obj.SQUARE);
//		System.out.println(obj1.ordinal()); // Ordinal() It gives the position 
//		
//		shapes[] s = shapes.values();
//		for (shapes val : s) {
//			System.out.println(val);
//		}
		
//		if(obj == shapes.CIRCLE) {
//			System.out.println("No sides");
//		}
//		else if(obj == shapes.TRIANGLE) {
//			System.out.println("Three sides");
//		}
//		else if(obj == shapes.SQUARE) {
//			System.out.println("Four sides");
//		}
//		else {
//			System.out.println("Something went wrong.......:)");
//		}
		
		switch (obj) {
		case CIRCLE:
			System.out.println("No sides");
			break;
		case TRIANGLE:
			System.out.println("3 sides");
			break;
		case SQUARE:
			System.out.println("4 sides");
			break;
		default:
			System.out.println("Error statement");
		}
	}

}
