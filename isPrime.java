package summer;
//java program to check weather the given no isPrime or not
 import java.util.Scanner;

public class isPrime {
	 public static void main(String[]args) {
		 Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
		  System.out.println(primeCheck(num));
		  
		 
		 
	 }
	  public static boolean primeCheck(int n) {
		   if(n<=1) {
			    return false;
		   }
		  for(int i=2;i*i<=n;i++) {
			   if(n%i==0) {
				    return false;
			   }

	  }
		   return true;

}
}