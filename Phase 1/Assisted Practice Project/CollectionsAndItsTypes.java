package Assisted_Practice_Project_;
import java.util.*;
public class CollectionsAndItsTypes {

		public static void main(String[] args) {
			/*creating arraylist*/
			System.out.println("ArrayList");
			ArrayList<String> city=new ArrayList<String>();   
		      city.add("Yavatmal");//
		      city.add("Amravati");    	   
		      System.out.println(city);  
			
			/*creating vector*/
		      System.out.println("\n");
		      System.out.println("Vector");
		      Vector<Integer> vec = new Vector();
		      vec.addElement(25); 
		      vec.addElement(20); 
		      System.out.println(vec);
			
			/*creating linkedlist*/
		      System.out.println("\n");
		      System.out.println("LinkedList");
		      LinkedList<String> names=new LinkedList<String>();  
		      names.add("Akshay");  
		      names.add("Kumar");  	      
		      Iterator<String> itr=names.iterator();  
		      while(itr.hasNext()){  
		       System.out.println(itr.next());  
		       
		       /*creating hashset*/
		       System.out.println("\n");
		       System.out.println("HashSet");
		       HashSet<Integer> set=new HashSet<Integer>();  
		       set.add(21);  
		       set.add(22);  
		       set.add(23);
		       set.add(24);
		       System.out.println(set);
		       
		       /*creating linkedhashset*/
		       System.out.println("\n");
		       System.out.println("LinkedHashSet");
		       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
		       set2.add(201);  
		       set2.add(202);  
		       set2.add(203);
		       set2.add(204);	       
		       System.out.println(set2);
		      	}   
		}
}
