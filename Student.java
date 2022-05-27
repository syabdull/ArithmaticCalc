package summer;

public class Student {
	// class is blue print of an object 
	// object is an instance of a class
	  String Name;
	   int Age;
	   String Address;
	   //using setters  and getters method 
	    // creating a paramaterized constructor
	    public Student(String Name,int Age,String Address) {
	    	 this.Name=Name;
	    	  this.Age=Age;
	    	  this.Address=Address;
	    
	    }
	    public void setName(String Name) {
	    	 this.Name=Name;
	    }
	     public void setAge(int Age) {
	    	  this.Age=Age;
	    	 
	     }
	      public void setAddress(String Address) { // 
	    	   this.Address=Address;
	    	    
	      }
	       public  String getAddress() { // returns the address
	    	    return Address;
	    	    
	       }
	        public int getAge() {// returns the age
	        	 return  Age;
	    }
	         public String getName() {
	        	  return Name;
	         }
	          public  static void main(String[]args) {
	        	  Student js=new Student("Abdulla",20,"Alampur");
	        	   System.out.println(js.getAddress());
	        	  
	          }
}



