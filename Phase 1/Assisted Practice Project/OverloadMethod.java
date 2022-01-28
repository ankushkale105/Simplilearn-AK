package Assisted_Practice_Project_;

public class OverloadMethod {
		public void area(int b,int h)
		    {
		         System.out.println("Area of the Triangle is : "+(0.5*b*h));
		    }
		    public void area(int r) 
		    {
		         System.out.println("Area of the Circle is : "+(3.14*r*r));
		    }

		    public static void main(String args[])
		   {
		       OverloadMethod ob=new OverloadMethod();
		       ob.area(20,25);
		       ob.area(10);  
		   }
		}