package ejercicios;

public class hilo2 extends Thread{
	int s= 0;
	@Override
	public void run() {
		for(int i = 0; i <= 10 ;i++) {
			if(i%2 == 1) {
				System.out.println("Hilo 2 = " + i);
				s += i;
			}
			
		}
		System.out.println("Suma = " + s);
	}
	
}
