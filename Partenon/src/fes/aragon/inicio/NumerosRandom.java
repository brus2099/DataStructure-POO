package fes.aragon.inicio;

import java.util.Random;

public class NumerosRandom {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		for (int i = 0; i<100; i++) {
			float t = rd.nextInt(1000);
			t = t/1000;
			float s = rd.nextInt(1000);
			s = s/1000;
			System.out.println(t+" "+s);
		}
	}
}