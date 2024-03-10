package exerciciosEstagio;

/*
 * Exibir a série de FIBONACCI
 * 0,1,1,2,3,5,8,13,21
 **/

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		//Inicializando
		int x = 1;
		int y = 0;
		
		System.out.println("Deseja informar um valor? [S | N]? ");
		char resp = read.next().charAt(0);
		
		if(resp == 'S' || resp == 's' ) {
			
			System.out.println("Informe o valor");
			int num = read.nextInt();
			
			for(int j = 1; j < num; j++) {
				System.out.println("Termo:" + j + " (" + x + "+" + y + ")");
				x = x + y;
				y = x - y;
				System.out.println("Resultado: " + x + "\n");
			}
			
		} else if(resp == 'N' || resp == 'n') {
				
			for(int i = 1; i < 8; i++) {
				System.out.println("Termo:" + i + " (" + x + "+" + y + ")");
				x = x + y;
				y = x - y;
				System.out.println("Resultado: " + x + "\n");
			}
			
		} else {
			System.out.println("Resposta invalida");
		}
		
	}

}
