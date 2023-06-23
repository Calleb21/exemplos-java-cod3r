package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o númwero: "); 
		double num1 = entrada.nextDouble();
		
		System.out.println("Informe o número: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Informe a operaçãõ: ");
		String operação = entrada.next();
		
		double resultado = "+".equals(operação) ? num1 + num2 : 0;
		resultado = "-".equals(operação) ? num1 - num2 : resultado;
		resultado = "*".equals(operação) ? num1 * num2 : resultado;
		resultado = "/".equals(operação) ? num1 / num2 : resultado;
		resultado = "%".equals(operação) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f" , 
				num1, operação, num2, resultado);
		entrada.close();
		
		
	}

}
