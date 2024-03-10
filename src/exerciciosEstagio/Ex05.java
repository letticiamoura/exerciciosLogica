package exerciciosEstagio;

/*
 * Inverter uma string
 **/
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		System.out.println("Escreva uma frase para ser invertida");
		String frase = read.nextLine();
		
		String str = "";
		
		for(int i = frase.length() - 1; i >= 0; i--) {
			
			 str += frase.charAt(i);
		}
		
		System.out.println(str);
	}

}
