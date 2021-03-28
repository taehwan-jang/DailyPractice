package ex15usefulcalss;

import java.util.Random;

public class E06Random {

	public static void main(String[] args) {
		System.out.println("==난수생서1 : seed로 32사용");
		Random random1 = new Random(32);
		for(int i=0 ; i<10 ; i++) {
			System.out.println(random1.nextInt(100));			
		}
		
	}
}
