package summer;

public class MultiDimArray {
	 public static void main(String[]args) {
		  int a[] []= {{1,2,3},{2,3,4},{4,5,6}};
		  for(int row=0;row<3;row++) {
			   for(int col=0;col<3;col++) {
				    System.out.print(a[row][col]+"\t");
			   }
			   System.out.println(); 
		  }
		 
	 } 

}
