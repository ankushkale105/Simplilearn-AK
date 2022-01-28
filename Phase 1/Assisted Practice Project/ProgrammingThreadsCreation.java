package Assisted_Practice_Project_;

public class ProgrammingThreadsCreation extends Thread {

	 	public void run()
	 	{
	  		System.out.println("Thread Started Running...");
	}
	 	public static void main( String args[] )
	 	{
	 		ProgrammingThreadsCreation thread = new  ProgrammingThreadsCreation();
	  		thread.start();
	 	}
}
