package Assisted_Practice_Project_;
import java.util.HashMap;
import java.util.Map;

public class Mapping {
	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer,String>();      
	      map.put(1,"John");    
	      map.put(2,"Alexa");    
	      map.put(3,"Katie");   
	       
	      System.out.println("The elements of Map are: ");  
	      for(Map.Entry m:map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	}
}