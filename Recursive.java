package GeeksforGeeks;

public class Recursive {
	static  int i = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		if(i <= n)
		{
			System.out.printf("%d" , i++);
			main(null);
		}

	}

}
