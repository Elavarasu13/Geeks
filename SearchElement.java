package Basics;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n =4;
		int arr[] = {1,2,3,4};
		int  a = 3;
		
		System.out.println(SearchElement(arr, n ,a));
	}

	private static int  SearchElement(int[] arr, int n, int a) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<arr.length;i++)
		{
			if(a == arr[i])
			{
				return i;
			}
		}
		return -1;
	}

}
