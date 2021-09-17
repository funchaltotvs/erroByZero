package testes;

import java.util.Random;

public class DeveTerSucesso {

	public static void main(String[] args) {
		Random random = new Random();
		for(int i = 0; i < 100; i++) {
			int denominador = random.nextInt(5);
			if(denominador == 0) System.out.print(denominador);
			mod(5, denominador);
		}
		System.out.println();
		System.out.println("DEU CERTO O TESTE");

	}
	
	public static int mod(int x,  int y) {
		if(y == 0) y = 1;
	    int result = x % y;
	    return result;
	}

}
