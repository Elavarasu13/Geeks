package GeeksforGeeks;

public class Palin_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[] = {110,222,333,444,555};
	
	System.out.print(palin_array(arr));	
	}

	private static boolean palin_array(int[] arr) 
	{
		// TODO Auto-generated method stub
		
		int sum = 0 , rem = 0,temp =0 ,count =0;
		
		for(int i=0;i<arr.length;i++)
		{
			temp  = arr[i];
			while(arr[i] > 0)
			{
				rem  =  arr[i] % 10;
				sum  = (sum*10) + rem;
				arr[i] = arr[i] /10;
		    }
			if(temp == sum)
			{
				count++;
			}
			sum = 0;
			
			if(count == arr.length)
			{
				return true;
			}
		}
			
		return false;
	}

}
