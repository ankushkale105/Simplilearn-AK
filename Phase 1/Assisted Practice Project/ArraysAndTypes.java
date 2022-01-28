package Assisted_Practice_Project_;

public class ArraysAndTypes {
		public static void main(String[] args) { 
	        int a[]={1,2,3,4,5,6,7,8,9};

	        //multidimensional
	        int b[][]={{1,2,3},{4,5,6},{7,8,9}};
	        System.out.println("Single Dimentional Array :");
	        for(int i=0;i<a.length;i++){
	            System.out.print("  "+a[i]+" ");
	        }
	 
	        System.out.println("\n\nMulti-Dimentional Array :");
	        for(int i=0;i<b.length;i++){
	            for(int j=0;j<b[i].length;j++){
	                System.out.print("   "+b[i][j]+" ");
	            }

	            System.out.println();
	        }
		}
	}