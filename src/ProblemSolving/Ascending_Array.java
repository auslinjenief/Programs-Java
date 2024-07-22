package ProblemSolving;

import java.util.Arrays;

public class Ascending_Array {
	public static void main(String[] args) {
		int a[] = new int[] {5,3,9,2,8,4,7,8,5};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		} 
		System.out.println(Arrays.toString(a));
		}
	}
	
