package CorrecciónExamenTema3OpciónA;

import java.util.Random;

public class Pasteleria {
	//atributos
	private String sabor;
	private double precioLitro;
	private double volumen;
	private boolean extraNormal;
	private int [] cantTartas;
	
	//constructor
	public Pasteleria(String sabor, double precioLitro, double volumen, boolean extraNormal, int[] cantTartas) { //para crear este objeto en el main hay que darle todas estas cosas y en orden sino da error 
		this.sabor = sabor;
		this.precioLitro = precioLitro;
		this.volumen = volumen;
		this.extraNormal = extraNormal;
		this.cantTartas = cantTartas;
	}
	public Pasteleria() {

	}
	//getterssetters
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public double getPrecioLitro() {
		return precioLitro;
	}
	public void setPrecioLitro(double precioLitro) {
		this.precioLitro = precioLitro;
	}
	public double getVolumen() {
		return volumen;
	}
	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}
	public boolean isExtraNormal() {
		return extraNormal;
	}
	public void setExtraNormal(boolean extraNormal) {
		this.extraNormal = extraNormal;
	}
	public int[] getCantTartas() {
		return cantTartas;
	}
	public void setCantTartas(int[] cantTartas) {
		this.cantTartas = cantTartas;
	}
	//Métodos míos
	public void rellenarTartas(int hasta, int desde) {
		Random rnd=new Random(System.nanoTime());
		
		for (int i = 0; i < cantTartas.length; i++) {
			cantTartas[i]=rnd.nextInt(hasta-desde+1)+desde;
		}
	}
	public void imprimirTartas() { //buena forma de imprimir un array
		System.out.println("------");
		System.out.println("SEMANA");
		System.out.println("------");
		for (int i = 0; i < cantTartas.length; i++) {
			System.out.println("DÍA "+(1+i)+"= "+cantTartas[i]+"tartas.");
		}
	}
	public double calcularPrecioFab() {//hay que dejar de usar lo de crear una variable result para devolver operaciones simples como estas.
		return  precioLitro*volumen;
	}
	public void imprimirPrecioFab() {// cuando usamos el resultado de un metodo en otro metodo, se puede llamar al metodo si este no modifica un atributo, de esta forma 
		                             //me ahorro el tener que guardarlo en una variable en el main para volver a pasarlo
		System.out.printf("El precio del litro es: %.2f $\n",precioLitro);
		System.out.printf("El volumen ejn litros es: %.2f litros\n",volumen);
		System.out.printf("El coste de fabricación es: %.2f$\n",calcularPrecioFab());
	}
	public double calcularPrecioVent(double porcent) {//igual que en el de arriba cuando se usa el resultado de otro metodo se llama a ese metodo
		int cien=100;
		return calcularPrecioFab()+(calcularPrecioFab()*porcent/cien);
	}
	public void imprimirPrecioVent(double porcent) {
		System.out.printf("Precio de fabricación: %.2f");
		System.out.printf("Porcentaje aplicado de ganancia: %.2f porciento");
		System.out.printf("Precio de venta al público: %.2f$\n");
	}
	public double calcularExtra(double porcent, double costeExtra) {//Porque se pone porcent en parentesis? porque ese metodo necesita el parametro "porcentaje" para que funcione(esta arriba echo).
		if(extraNormal) {
			return calcularPrecioVent(porcent)+costeExtra;
		}else {
			return calcularPrecioVent(porcent);
		}
	}
	public int calcularTotalTartas() {
		int totalTartas=0;
		for (int i = 0; i < cantTartas.length; i++) {
			totalTartas += cantTartas[i];
		}
		return totalTartas;
	}
	public void imprimirTotalTartas() {
		imprimirTartas();
		
	}
	public void cambiarDiaTarta(int cambiarDia, int cambiarTartas) {
		cantTartas[cambiarDia-1]=cambiarTartas;
	}
	public double calcularMediaTartas() {//el double entre parentesis transforma el resultado en double, porque al dividir un int entre un int da problemas por los decimales
		return (double) calcularTotalTartas()/cantTartas.length;
	}
	public void imprimirMediaTartas() {
		
	}
}
