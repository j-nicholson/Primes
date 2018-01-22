import java.util.Scanner;

public class Prime {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to test if it is prime: ");
		long input = scan.nextLong();
		System.out.println(isPrime(input));
		scan.close();
		
	}
	
	public static boolean isPrime(long n) {
		if(n == 1) {
			return false;
		}
		
		double testLimit = Math.sqrt(n);
		for(int i = 2; i <= testLimit; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
