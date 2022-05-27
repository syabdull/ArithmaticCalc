package summer;
 import java.util.Scanner;

public class UserInputFor {
	 public static void main(String[]args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("please enter the no of rows");
		 int rows=sc.nextInt();
		 System.out.println("please enter the no of columns");
		 int col=sc.nextInt();
		  int a[][]=new int[rows][col];
		  for(int i=0;i<a.length;i++) {
			   for(int j=0;j<a[i].length;j++) {
				   System.out.println("please enter the values");
				    a[i][j]=sc.nextInt();
			   }
		  }
		  printArray(a);
		 
	 }
	 public static void printArray(int A[] [] ) {
		 for(int i=0;i<A.length;i++) {
			   for(int j=0;j<A[i].length;j++) {
				   System.out.print(A[i][j]+"\t");
			   }
			   System.out.println();
		  }
		 
		 
	 }

}
