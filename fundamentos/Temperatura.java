package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		
		final double FATOR = 5.0 / 9;
		final double AJUSTE = 32;
		
		double fahrenheint = 86; 
		double celsius = (fahrenheint - AJUSTE) * FATOR;
		System.out.println("O resultado é " + celsius + "°C.");
		
		fahrenheint = 0;
		celsius = (fahrenheint - AJUSTE) * FATOR;
		System.out.println("O resultado é " + celsius + "°C.");

	}

}
