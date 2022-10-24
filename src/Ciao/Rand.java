package Ciao;

import java.util.Random;

public class Rand {
	public static void main(String[] args) {
		Random random = new Random();
		int myVar = random.nextInt(50,101);            
		System.out.println(myVar);
		
		
	}
}
