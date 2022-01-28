package Assisted_Practice_Project_;

import java.util.Scanner;

public class SearchStringByUserFromArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of strings:");
		int N=sc.nextInt();
		System.out.println("Enter Strings");
		String arr[]=new String[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=sc.next();
		}
		System.out.println("Enter your required string:");
		String s=sc.next();
		boolean f=false;
		
		for(int i=0;i<N;i++) {
			if(arr[i].equals(s)) {
				System.out.println("String found at "+i);
				f=true;
				break;
			}
		}
		if(f==false) {
			System.out.println("String not found");
		}
	}
}


