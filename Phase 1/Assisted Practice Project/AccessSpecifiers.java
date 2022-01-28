package Assisted_Practice_Project_;

	//1. Default access modifier 
	class defAccessSpecifier
	{ 
	  void display() 
	     { 
	         System.out.println("You are using defalut access specifier"); 
	     } 
	} 

	public class AccessSpecifiers {

		public static void main(String[] args) {
			//default
			System.out.println("Dafault Access Specifier");
			defAccessSpecifier obj = new defAccessSpecifier(); 		  
	        obj.display(); 

		}
	}
	//2. Private access specifiers
	/*class privateaccessspecifier 
	{ 
	   private void display() 
	    { 
	        System.out.println("You are using private access specifier"); 
	    } 
	} 

	public class accessSpecifiers2 {

		public static void main(String[] args) {
			//private
			System.out.println("Private Access Specifier");
			priaccessspecifier  obj = new priaccessspecifier(); 
	        //trying to access private method of another class 
	        //obj.display();

		}
	}


	//3. Protected access specifiers
	package pack1;

	public class protectedaccessspecifiers {

		protected void display() 
	    { 
	        System.out.println("This is protected access specifier"); 
	    } 
	}

	//create another package
	package pack2;

	import pack1.*;

	public class accessSpecifiers3 extends protectedaccessspecifiers {

		public static void main(String[] args) {
			accessSpecifiers3 obj = new accessSpecifiers3 ();   
		       obj.display();  
		}

	}






	//4. using public access specifiers
	package pack1;

	public class publicaccessspecifiers {

		public void display() 
	    { 
	        System.out.println("This is Public Access Specifiers"); 
	    } 
	}

	//create another package
	package pack2;
	import pack1.*;

	public class accessSpecifiers4 {

		public static void main(String[] args) {
			
			publicaccessspecifiers obj = new publicaccessspecifiers(); 
	        obj.display();  
			
		}
	}*/
