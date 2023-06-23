package fundamentos;

public class PrimitivosVsObjeto {
	
	public static void main(String[] args) {
		
		String s = new String ("texto");
		s.toUpperCase();
		
		// Wrappes são a versão objeto dos tipos 
		// primitivos!
		int a = 123;
		System.out.println(a);
	}

}
