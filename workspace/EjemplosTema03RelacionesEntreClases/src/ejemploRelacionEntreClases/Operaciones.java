package ejemploRelacionEntreClases;

public class Operaciones 
{
	//constructor
	public Operaciones() {

	}
	//Metodos
	public Fracciones multiplicarF(Fracciones f1, Fracciones f2) {
		
		//FORMA LARGA MÁS ENTENDIBLE
		//Fracciones f; //¿Por qué se instacia aquí el objeto?
		//int num, den;
		
		//num = f1.getNumerador()*f2.getNumerador();
		//den = f1.getDenominador()*f2.getDenominador();
		
		//f=new Fracciones (num, den);
		//return f;
		
		//FORMA CORTA
		//Fracciones f=new Fracciones (f1.getNumerador()*f2.getNumerador(), f1.getDenominador()*f2.getDenominador());//se usan los getter and seter porque los parametros se encuentran en las otras clases y están en private
		//return f;
		
		//FORMA CORTA PERO PELIGROSA(para que nos suene de esta forma ahorramos memoria porque instanciamos el obejto fracciones en el return)
		return new Fracciones (f1.getNumerador()*f2.getNumerador(), f1.getDenominador()*f2.getDenominador());
	}
	
	public Fracciones cambiarSigno (int num, int den) {
		
		return new Fracciones (-num, den);	
	}
	public void imprimirFraccion(Fracciones f) {//hay que pasarle la fracciones como parametro 
		System.out.println(f.getNumerador()+"/"+f.getDenominador()); 
	}

	
	
}
