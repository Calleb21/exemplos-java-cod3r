package fundamentos;

public class ConersaoTiposPrimitivosNumerico {
	
	public static void main(String[] args) {
		
		double a = 2; // implícita
		System.out.println(a);
		
		float b = (float) 1.12345; // explícita (CAST)
		System.out.println(b);
		
		int c = 340;
		System.out.println(c);
		
		double e = 1.99999;
		int f = (int) e;
		System.out.println(f);
		
	}

}
