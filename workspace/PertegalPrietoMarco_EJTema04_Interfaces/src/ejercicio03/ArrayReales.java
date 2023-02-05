package ejercicio03;

import java.util.Arrays;
import java.util.Random;

public class ArrayReales implements Estadisticas{
	private double [] num;

	public ArrayReales(double[] num) {
		super();
		this.num = num;
	}

	public ArrayReales() {
		super();
	}


	public double[] getNum() {
		return num;
	}

	public void setNum(double[] num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "ArrayReales [num=" + Arrays.toString(num) + "]";
	}
	
	public void rellenarArray() {
		int desde= 0, hasta= 9;
		Random rand = new Random(System.nanoTime());
		for (int i = 0; i < num.length; i++) {
			num[i] = rand.nextDouble(hasta-desde+1)+desde;
		}
	}

	public double calcularMinimo() {
		double min = 10;
		for (int i = 0; i < num.length; i++) {
			if (min > num[i]) {
				min = num[i];
			}
		}
		return min;
	}

	public double calcularMaximo() {
		double max = 0;
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		return max;
	}

	public double calcularSumatorio() {
		double total=0;
		for (int i = 0; i < num.length; i++) {
			total += num[i];
		}
		return total;
	}
	
}
