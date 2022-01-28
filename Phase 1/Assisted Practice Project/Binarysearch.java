package Assisted_Practice_Project_;

public class Binarysearch {
	
	    public static  void main(String[] args){
	        int[] arr = {3,6,9,12,15,18,21};
	        int key = 18;
	        int arrlength = arr.length;
	        bSearch(arr,0,key,arrlength);
	    }
	public static void bSearch(int[] arr, int start, int key, int length){
	        int midValue = (start+length)/2;
	        while(start<=length){//O(log n)
	            if(arr[midValue]<key){
	                start = midValue + 1;
	            } 
	            else if(arr[midValue]==key){
	                System.out.println("Element is found at index : "+midValue);
	                break;
	            }
	            else {
	                length=midValue-1;
	            }
	            midValue = (start+length)/2;
	        }
	            if(start>length){
	                System.out.println("Element is not found");
	            }
	}
}