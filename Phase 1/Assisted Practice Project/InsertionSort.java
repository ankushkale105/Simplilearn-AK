package Assisted_Practice_Project_;

public class InsertionSort {
	    public static  void main(String[] args){
	    	System.out.println("Sorted array is : ");
	        int[] arr = {17,28,13,61,88,59};
	        insertionSort(arr);
	        for(int i=0;i<arr.length;i++){

	            System.out.println(arr[i]);

	        }
	     }
	    public static void insertionSort(int[] arr){

	    int len = arr.length;
	    for(int j=1;j<len;j++){
	    int key = arr[j];
	    int i=j-1;
	    while ((i>-1) && (arr[i]>key)){

	        arr[i+1]=arr[i];
	        i--;
	    }
	    arr[i+1]=key;
	         }

	    }
	}
