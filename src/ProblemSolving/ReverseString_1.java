package ProblemSolving;

public class ReverseString_1 {
	public static void main(String[] args) {
		StringBuilder a = new StringBuilder("Hii my name is auslin");
		StringBuilder b = new StringBuilder();
		for (int i=a.length()-1;i>=0;i--) {
			b.append(a.charAt(i));
		}
		System.out.println(a);
		System.out.println(b);
	}

}
