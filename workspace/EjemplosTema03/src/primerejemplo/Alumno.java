package primerejemplo;

public class Alumno {
	
	//atributos, no se le da un valor inicial(=34)
	//AQUI NO HAY NINGUN ALUMNO, ES EL MOLDE PARA CREARLOS
	String nombre;
	int edad;
	double notaMedia;
	boolean repetidor;
	
	//contructores
	//se pueden crear objetos tipo alumno con 4 variables y con ninguna tmb, el orden dentro de los parentesis debe ser el mismo orden 
	//en el que se han declarado las variables, mismo ombre mismo orden y  mismo tipo
	//lo de dentro de los parentesis se llama parametros
	//a los this de dentro del constructor se llama cuerpo
	//cuidado con renombrar las clases porque en un proyecto con muchas clases se lo puede cargar
	public Alumno (String nombre, int edad, double notaMedia, boolean repetidor) {
	
		this.nombre=nombre;
		this.edad=edad;
		this.notaMedia=notaMedia;
		this.repetidor=repetidor;	
	}
	public Alumno (String nombre, int edad){
		this.nombre=nombre;
		this.edad=edad;
	}
}
