package summer;

public class Killer {
	 String Name;
	  int  age;
	   int no;
	   public   void printInfo() { // method to print the info of object 
		    System.out.println(Name);
		     System.out.println(age);
		      System.out.println(no);
	   }
	    void walk() {
	    	 System.out.println("Student can walk");
	    }

	     void eat() {
	    	  System.out.println("Student can eat");
	     }
	      public static void main(String[]args) {
	    	   Killer k=new Killer();
	    	    k.eat();
	    	    k.walk();
	    	     k.printInfo();
	    	     
	      }
}
