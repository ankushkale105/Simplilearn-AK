package Assisted_Practice_Project_;

public class TryAndCatchStatements {
	    public static void main(String args[]) 
	    {
	        int[] array = new int[2];
	        try 
	        {
	            array[5] = 2;
	        }
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	            System.out.println("Array Index is out of bounds exception!"); 
	        }
	        finally 
	        {
	            System.out.println("The array is of size : " + array.length);
	        }
	    }
}
