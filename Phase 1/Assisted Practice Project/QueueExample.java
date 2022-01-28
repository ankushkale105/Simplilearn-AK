package Assisted_Practice_Project_;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) 
	{
	        		Queue<String> locationsQueue = new LinkedList<>();
	        		locationsQueue.add("Mumbai");
	        		locationsQueue.add("Nagpur");
	        		locationsQueue.add("Amravati");
	        		locationsQueue.add("Pune");
	        		locationsQueue.add("Aurangabad");
	System.out.println("Queue is : " + locationsQueue);
	        		System.out.println("Head of Queue : " + locationsQueue.peek());
	        		locationsQueue.remove();
	        		System.out.println("After removing Head of Queue : " + locationsQueue);
	        		System.out.println("Size of the Queue is : " + locationsQueue.size());
	    	}
	}
