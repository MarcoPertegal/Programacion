package ejemploMap;

import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		
		Map <String, String> mapa = new HashMap <String, String> ();
		
		mapa.put("one", "1st");
		mapa.put("second", "2nd");
		mapa.put("third", "3rd");
		//para sobreescribir se usa la clave que ya existe
		mapa.put("third", "III");
		
		System.out.println(mapa);
		//No hay orden de inserción como el set
		
		
		

	}

}
