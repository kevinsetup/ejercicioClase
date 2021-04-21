package ejercicios;

public class hilocomida extends Thread{
	private String nombre;
	public hilocomida(String nombre) {
		this.nombre = nombre;
	}
	int posiciones = 0;
	public void run() {
		String text = "";
		for(int i = 1 ; i<= 3; i++) {		
			
			System.out.println(this.nombre + " Está comiendo  " + i + " sandiwch de pollo");
		
			
		}
		//System.out.println(text);
		System.out.println( this.nombre + "*---- Ha terminado de comer su sandiwch ----*");
	}
}
