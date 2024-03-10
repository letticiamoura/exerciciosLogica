package exerciciosEstagio;

/*
 * Fazer um loop de repetição em while, onde vai incrementar +1 na soma do resultado
 */

public class Ex01 {

	public static void main(String[] args) {
		
		int indice = 13;
		int soma = 0;
		int k = 0;
		
		while( k < indice) {
			k++;
			soma = soma + k;
		}
		
		System.out.println(soma);

	}

}
