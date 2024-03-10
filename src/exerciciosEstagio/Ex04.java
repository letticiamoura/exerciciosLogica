package exerciciosEstagio;

/*
 * Qual interruptor liga qual lâmpada
 **/

public class Ex04 {

	public static void main(String[] args) {

		boolean lampada1 = false;
		boolean lampada2 = false;
		boolean lampada3 = false;
		
		lampada1 = !lampada1;
		
		lampada2 = !lampada2;
		
		System.out.println("Lâmpada 1 é controlada pelo interruptor 1? " + lampada1);
        System.out.println("Lâmpada 2 é controlada pelo interruptor 2? " + lampada2);
        System.out.println("Lâmpada 3 é controlada pelo interruptor 3? " + lampada3);
    }

}
