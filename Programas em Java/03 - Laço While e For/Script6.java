/*
 * Desenvolva um gerador de tabuada, capaz de gerar 
 * a tabuada de qualquer numero inteiro entre 1 a 10. 
 * O usuario deve informar de qual numero ele deseja 
 * ver a tabuada.
 */

package geek;

import java.util.Scanner;

public class Script6 {

	public static void main(String[] args) {	
		//variavel
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Informe um número entre 1 e 10: ");
		numero = teclado.nextInt();
		
		//Processamento
		while(numero < 1 || numero > 10) {
			//Entrada
			System.out.println("Informe um número entre 1 e 10: ");
			numero = teclado.nextInt();
		}
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%d X %d = %d\n", numero, i, (numero * i));
		}
		teclado.close();
	}

}
