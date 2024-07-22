package ProblemSolving;

public class DuplicateElement_Array {
	public static void main(String[] args) {
		int a[] = {1,2,3,5,4,6,3,2,6};
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j] && (i!=j)) {
					System.out.println(a[j]);
				}
			}
		}
	}

}
