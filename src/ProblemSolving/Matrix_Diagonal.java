package ProblemSolving;

public class Matrix_Diagonal {
	
	//Principal (main/leading) diagonal // right to left --0,0 1,1 2,2
	//Secondary Diagonal| // left to right ---0,3 1,2 2,0
	
	public static void main(String[] args) {
	     int a[][] = {
	    		 {1,2,3},
	    		 {4,5,6},
	    		 {8,8,9}
	     };
	     int pd = 0;
	     int sd = 0;
	     
	     for(int i=0;i<a[0].length;i++)
	     {
	    	 for(int j=0;j<a.length;j++)
	    	 {
	    		 if(i==j)
	    		 {
	    			 pd = pd + a[i][j];
	    		 }
	    		 if((i+j)==a.length-1)
	    		 {
	    			 sd = sd + a[i][j];
	    		 }
	    	 }
	     }
	     System.out.println(pd);
		 System.out.println(sd);
	}

}
