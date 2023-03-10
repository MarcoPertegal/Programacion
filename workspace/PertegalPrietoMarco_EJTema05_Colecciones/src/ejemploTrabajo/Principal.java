package ejemploTrabajo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Envio e = new Envio(111, "Juan", "INICIADO");
		Envio e1 = new Envio(222, "Felipe", "CONFIRMADO");
		
		EstadoEnvio entregado = EstadoEnvio.ENTREGADO;
		EstadoEnvio confirmado = EstadoEnvio.CONFIRMADO;
		
		System.out.println(entregado.name());
		System.out.println(entregado.toString());
		System.out.println(entregado.ordinal()); 
		System.out.println(entregado.compareTo(confirmado));
		
		for (EstadoEnvio eE : eE.values()) {
			
		}
	}
}
