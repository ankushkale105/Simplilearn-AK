package Assisted_Practice_Project_;

public class DifferentReturnTypes {

	   public static int sum(int a,int b){
	        int c=a+b;
	        return c;
	    }

	   public static void print(String a){
	        System.out.println(a);
	    }

	   public static int sub(int a,int b) {
		   return a-b;
	    }
	   
	   public static double div(double a,double b){
	        return a/b;
	    }
	  
	   public static int square(int a) {
		   return a*a;
	   }
	   public static void main(String[] args) {
		  int result;
		  result=square(25);
	        System.out.println("Types of Return Types\n");
	        System.out.println("Addition of the numbers: "+sum(1,2));
	        System.out.println("Substraction of the numbers: "+sub(4,2));
	        System.out.println("Division of the numbers: "+div(5,2));
	        System.out.println("Square of the number is: "+result);

	    }
	}
