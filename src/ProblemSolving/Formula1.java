package ProblemSolving;



/*
 We use the integers a, b, and n to create the following series:
 	You are given  queries in the form of a,b , and n. 
 For each query, print the series corresponding to the given , , 
 and  values as a single line of n space-separated integers.
 
 
 
 
 
 
 
 */
import java.util.*;
import java.io.*;

class Formula1{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the limit : ");
    int queries = sc.nextInt(); // Number of queries

    for (int q = 0; q < queries; q++) {
    	System.out.println("Enter the value of a , b , n : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        // Print the series for the current query
        printSeries(a, b, n);
    }

    sc.close();
}

public static void printSeries(int a, int b, int n) {
    int result = a;
    for (int i = 0; i < n; i++) {
        result += Math.pow(2, i) * b;
        System.out.print(result + " ");
    }
    System.out.println();
}
     
    }

