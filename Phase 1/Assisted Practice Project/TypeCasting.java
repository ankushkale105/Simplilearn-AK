package Assisted_Practice_Project_;

public class TypeCasting {
		public static void main(String[] args) {
			
			//implicit conversion
			System.out.println("Implicit Type-Casting");
			char a='F';
			System.out.println("The Value of a: "+a);
			
			int b=a;
			System.out.println("The Value of b: "+b);
			
			float c=a;
			System.out.println("The Value of c: "+c);
			
			long d=a;
			System.out.println("The Value of d: "+d);
			
			double e=a;
			System.out.println("The Value of e: "+e);
			
					
			System.out.println("\n");
			
			System.out.println("Explicit Type-Casting");
			//explicit conversion
			
			double x=10.5;
			int y=(int)x;
			System.out.println("The Value of x: "+x);
			System.out.println("The Value of y: "+y);
			
		}
}
