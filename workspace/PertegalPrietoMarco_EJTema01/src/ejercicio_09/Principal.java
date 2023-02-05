package ejercicio_09;

public class Principal 
{

	public static void main(String[] args) 
	{
		
		int campnou=99354, estadiolimp=65000;
		double	navascampnou=0, navasestadiolimp=0, navasteatro=0,teatro=600, habitnavas=1500;
		
		navascampnou=campnou/habitnavas;
		
		System.out.println("En el Campnou entrarían "+navascampnou+" navas.");
		
		navasestadiolimp=estadiolimp/habitnavas;
		
		System.out.printf("En el estadio olimpico entrarían %.2f navas.\n" ,navasestadiolimp);
		
		navasteatro=teatro/habitnavas;
		
		System.out.printf( "En el teatro entrarían %.2f navas.",navasteatro);

	}

}
