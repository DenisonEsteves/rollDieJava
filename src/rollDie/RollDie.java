package rollDie;

import java.security.SecureRandom;

public class RollDie {

	public static void main(String[] args) {
		SecureRandom randomNumers = new SecureRandom();
		int[] frequency = new int[5];
		
		for(int roll = 1; roll <= 100; roll ++) {
			++frequency[randomNumers.nextInt(4) + 1];
		}
		
		System.out.printf("%s%10s%n", "Face", "Frequency");
		for(int face = 1; face < frequency.length; face++) {
			System.out.printf("%4d%10d%n", face, frequency[face]);
		}
	}
}
