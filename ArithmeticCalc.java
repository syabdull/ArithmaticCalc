package summer;
import java.util.Scanner;
public class ArithmeticCalc {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the first number");
		 float num1=sc.nextFloat();
		 System.out.println("please enter the second number");
		  float num2=sc.nextFloat();
		   System.out.println("please enter 1 for addation");
		   System.out.println("please enter 2 for subraction");
		   System.out.println("please enter 3 for  multiplication");
		   System.out.println("please enter  4 for division");
		   int choice=sc.nextInt();
		    switch(choice) {
		    case 1:System.out.println("Addation="+(num1+num2));
		    break;
		    case 2:System.out.println("subraction="+(num1-num2));
		    break;
		    case 3:System.out.println("multiplication="+(num1*num2));
		    break;
		    case 4:System.out.println("division="+(num1/num2));
		    break;
		    default:System.out.println("invalid choice");
		    }  
		
	}

}
