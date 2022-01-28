package Assisted_Practice_Project_;

public class InnerClasses {
	private String msg="Working of Inner Classes";
	void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  Inner inner=new Inner();  
	  inner.msg();  
	 }  
	public static void main(String[] args) {
		InnerClasses  inner=new InnerClasses ();  
		inner.display();  
	}
}