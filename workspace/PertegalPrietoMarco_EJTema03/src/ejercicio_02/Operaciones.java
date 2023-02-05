package ejercicio_02;

public class Operaciones 
{
	//como es un cmetodo ty no un constructor se pude llamar distinto a la clase
	//usar num dentro del metodod
	//se incumplen dos normas un poco, el retutn debe ser la ultima linea y no lo es
	//que solo se devulve ujn return y hay dos
	
	
	//para comprovar el positivo y negativo
	public Boolean comprobarPositivoBoleano (int num) {
		if (num>=0) {
			return true;
		}else {
			return false;
		}
	}
	//el void sirbe para cuando no devuelve nada ni un boleano0 ni doble.... solo imprime sirbe para cuando se imprime algo
	public void imprimir(boolean b) {
		if(b) {
			System.out.println("Positivo");
		}else {
			System.out.println("Negativo");
		}
	}
	//para comprobar par o impar
	public Boolean comprobarParBoleano (int num2) {
		int div=2, result=0;
		
		result=num2%div;
		
		if (result==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void imprimir2(boolean b) {
		if(b) {
			System.out.println("par");
		}else {
			System.out.println("impar");
		}
	}
}

