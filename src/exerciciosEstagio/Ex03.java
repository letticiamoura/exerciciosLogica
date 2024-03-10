package exerciciosEstagio;

public class Ex03 {

	public static void main(String[] args) {
		
		String resposta = """
				===================================================
					Item a)Está exibindo apenas números impares
					Item b)É o dobro do número anterior
					Item c)Quadrado dos números naturais
					Item d)Quadrado dos números pares
					Item e)Serie de FIBONACCI
				===================================================\n
				""";
		
		System.out.println(resposta);
		
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

		//Vai exibir só números impares
		System.out.println("Item a)");
		for(int n : num) {
			
			if(n % 2 != 0 ) {
				System.out.print(n + " ");
			}
		}

		System.out.print("\n");
		
		//Vai ter o dobro do número anterior 2,4,8,16..
		System.out.println("\nItem b)");
		int[] seqB = {2, 4, 8, 16, 32};
		
		 for (int i = 0; i < seqB.length; i++) {
			 
	            System.out.print(seqB[i]);
	            
	            if (i < seqB.length - 1) {
	                System.out.print(", ");
	            }
	            
	        }
		int ultimoNum = seqB[seqB.length - 1];
		ultimoNum = ultimoNum * 2;
		System.out.println(", "+ ultimoNum);
		
		System.out.print("\n");
		//Quadrado dos números naturais
		System.out.println("Item c)");
		int n = 10;
		for(int j = 0; j < n; j++) {
			System.out.print(j * j + " ");
		}
		
		System.out.print("\n");
		//Potências de 2
		System.out.println("Item d)");
		int numero = 5; 

        for (int i = 0; i < numero; i++) {
            System.out.print(Math.pow(2, i + 2) + " ");
        }
		
	}

}
