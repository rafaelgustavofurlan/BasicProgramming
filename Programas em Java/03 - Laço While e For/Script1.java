/*
 * Faca um algoritmo que determine o maior entre N numeros. A condicao de
 * parada é a entrada de um valor 0, ou seja, o algoritmo deve ficar calculando
 * o maior até que a entrada seja igual a 0 (Zero).
 */
package geek;

import java.util.Scanner;

public class Script1 {

	public static void main(String[] args) {
		//variáveis
		int n, maior = 0;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Informe um número: ");
		n = teclado.nextInt();
		
		while(n != 0) {
			if(n > maior) {
				maior = n;
			}
			System.out.println("Informe um número: ");
			n = teclado.nextInt();
		}
		System.out.printf("O maior número é %d", maior);
		teclado.close();

	}

}
