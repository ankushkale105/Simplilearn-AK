package Assisted_Practice_Project_;

public class ClassAndObjects { 
	    String name;  
	    int age; 
	    String color; 
	    public ClassAndObjects(String name, int age, String color) 
	    { 
	        this.name = name;  
	        this.age = age; 
	        this.color = color; 
	    } 
	    public String getName() 
	    { 
	        return name; 
	    }  
	    public int getAge() 
	    { 
	        return age; 
	    } 
	    public String getColor() 
	    { 
	        return color; 
	    } 
	    @Override
	    public String toString() 
	    { 
	        return("Hi my name is "+ this.getName()+ ".\n\nMy age and color are " + this.getAge()+ " and"+ this.getColor() + "."); 
	    } 
	    public static void main(String[] args) 
	    { 
	        ClassAndObjects scott = new ClassAndObjects("Ajinkya", 23, " fair"); 
	        System.out.println(scott.toString()); 
	    } 
	}
