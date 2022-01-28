package Assisted_Practice_Project_;

public class MethodsExecution {

	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
	}

	public static void main(String[] args) {

		MethodsExecution b=new MethodsExecution();
		int ans= b.multipynumbers(10,3);
		System.out.println("Multipilcation is : "+ans);
		}

}
	