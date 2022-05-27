package summer;

public class PracMultiDim {
	 public static void main(String[]args) {
		  int  a[][]= {{2,3,4},{5,6,7},{8,9,10}};
		  for(int row=0;row<a.length;row++) {
			  for(int col=0;col<a[row].length;col++) {
				   System.out.print(a[row][col]+"\t");
			  }
			  System.out.println();
			   
		  }
		 
	 }

}
