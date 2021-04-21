package ejercicios;

public class hilo1 extends Thread{
	int s= 0;
	@Override
	public void run() {
		for(int i = 0; i <= 10 ;i++) {
			if(i%2 == 0) {
				System.out.println("Hilo 1 = " + i);
				s += i;
			}
			
		}
		System.out.println("Suma = " + s);
	}
}
