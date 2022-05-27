package summer;
 import java.util.Scanner;

public class PrintPrimes {
	 public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         System.out.println("please enter the no");
          int num=sc.nextInt();
          
          for(int i=1;i<=num;i++){
               if(primeCheck(i)){
                    System.out.println(i);
               }
          }
          
     }
      // method to determine the given no is prime or not
       public static boolean primeCheck(int n){
            if(n<=1){
                 return false;
            }
            for(int i=2;i*i<=n;i++){
                 if(n%i==0){
                      return false;
                 }
            }
             return true;
            
       }
    
}