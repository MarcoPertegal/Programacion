package ejemploEnum;

public class Principal {

	public static void main(String[] args) {
		
		Equipo cadiz = Equipo.CADIZ;
		Equipo betis = Equipo.BETIS;
		
		System.out.println(cadiz.name());
		System.out.println(cadiz.getNombreClub()+ cadiz.getClasificacion());
		System.out.println(betis.getNombreClub()+betis.getClasificacion());
		Equipo.CADIZ.getClasificacion();

	}

}
