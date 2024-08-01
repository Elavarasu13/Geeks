package GeeksforGeeks;

public class Evendivides {

	public static void main(String[] args) {
		// TODO Auto-generated method stubnDivi
		int n = 2446;
		System.out.println(evenDivides(n));
		

	}

	private static int evenDivides(int n) {
		// TODO Auto-generated method stub
		int t = n, count = 0; 
        while (t != 0) { 
            // Fetching each digit of the number 
            int rem = t % 10; 
            t =t / 10; 
  
            // Checking if digit is greater than 0 
            // and can divides n. 
            if (rem > 0 && n % rem == 0) 
                count++; 
        } 
  
        return count; 
    } 
        	 
	    
	}


