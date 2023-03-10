package ejemploExcepciones;

public class Principal {

	public static void main(String[] args) {
		int num = 10;
		int den = 4;
		double result;
		
		if (den >= 0) {
			result = num/den;
		}else {
			System.out.println("No puedes dividir por cero o inferior.");
		}
		

	}

}
