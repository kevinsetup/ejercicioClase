package ejercicios;


public class Principal2 {
	private static String[] personas = {
			"kevin" , "bob", 
			"jezzer" , "saul" , 
			 "jorge" , "jhon" 
			, "alison" , "flor" 
			, "daniel" , "paul"
			};
	public static void main(String[] args) {
		for(String persona : personas ) {
			 Thread executed = new Thread(new hilocomida(persona));
			 executed.start();
			
		}
		
	}
	
}
