/*
 * Escreva um algoritmo que leia e mostre um vetor de 20 elementos 
 * inteiros, em seguida, mostre a soma de todos os elementos.
 */

package geek;

import java.util.Scanner;

public class Script4 {

	public static void main(String[] args) {
		//variaveis
		int[] vetor = new int[20];
		int soma = 0;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		for (int i = 0; i < 20; i++) {
			System.out.printf("Informe o valor para o vetor %d/20\n", (i+1));
			vetor[i] = teclado.nextInt();
			soma = soma + vetor[i];
		}
		System.out.printf("A soma é %d", soma);
		teclado.close();

	}

}
