package testes;

public class OutrosTestes {

	public static void main(String[] args) {
		int resultado = mod(-6, -2);
		if(resultado < 0) System.out.println("ALGO ESTA ERRADO");
		int resultado1 = mod(6, 2);
		if(resultado1 < 0) System.out.println("ALGO ESTA ERRADO");
		int resultado2 = mod(-6, 2);
		if(resultado2 < 0) System.out.println("ALGO ESTA ERRADO");
		int resultado3 = mod(6, -2);
		if(resultado3 < 0) System.out.println("ALGO ESTA ERRADO");
		
	}
	
	public static int mod(int x,  int y) {
	    int result = x % y;
	    return result;
	}

}
