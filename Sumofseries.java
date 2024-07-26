package GeeksforGeeks;

public class Sumofseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 5;
		System.out.println(seriessum(n));
		

	}

	private static long seriessum(long n) {
		// TODO Auto-generated method stub
		int sum  = 0;
		for(int i = 0;i<=n;i++)
		{
			sum = sum + i;
		}
		
		return sum;
	}

}
