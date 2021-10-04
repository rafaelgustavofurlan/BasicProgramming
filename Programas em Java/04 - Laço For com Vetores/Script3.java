/*
 * Faça um programa que carregue um vetor com dez numeros inteiros. 
 * Mostre o vetor na ordem inversa a que foi digitado.
 */

package geek;

import java.util.Scanner;

public class Script3 {

	public static void main(String[] args) {
		//variaveis
		int[] vetor = new int[10];
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe o valor para o vetor: ");
			vetor[i] = teclado.nextInt();
		}
		//0 1 2 3 4 5  6  7   8 9 (n-1)
		for (int i = (vetor.length - 1); i >= 0; i--) {
			System.out.println(vetor[i]);
		}
		teclado.close();
	}

}
