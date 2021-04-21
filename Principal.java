package ejercicios;
import ejercicios.*;

public class Principal {

	public static void main(String[] args) {
		Thread h1 = new Thread(new hilo1());
		h1.start();
		
		Thread h2 = new Thread(new hilo2());
		h2.start();
		
		
	}
	
}
