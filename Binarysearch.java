package Basics;

import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("nter the n value:");
		System.out.println("nter the k value:");
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int [n];
		System.out.println("nter the array values:");
		for(int i=0;i<n;i++)
		{
		arr[i] =  sc.nextInt();
		}
		
		for(int i =0;i<arr.length;i++)
		{
			System.out.println("Array values of" + i + ":" + arr[i]);
		}
		
		
		System.out.println(binarysearch(arr, n, k));

	}

	private static int binarysearch(int[] arr, int n, int k) {
		// TODO Auto-generated method stub
		
		for(int i =0;i<n;i++)
		{
			if(arr[i] == k)
			{
				return i;
			}
			
		}
		return -1;
		
		
	}

}
