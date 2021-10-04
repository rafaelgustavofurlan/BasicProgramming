/*
 * Escreva um algoritmo que leia dois vetores de 10 posicoes e faca a 
 * soma dos elementos de mesmo indice, colocando o resultado em um 
 * terceiro vetor. Mostre o vetor resultante.
 */

package geek;

import java.util.Scanner;

public class Script2 {

	public static void main(String[] args) {
		//variaveis
		int[] vetor1 = new int[10];
		int[] vetor2 = new int[10];
		int[] soma = new int[10];
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe o valor para o primeiro vetor: ");
			vetor1[i] = teclado.nextInt();
			System.out.println("Informe o valor para o segundo vetor: ");
			vetor2[i] = teclado.nextInt();
			soma[i] = vetor1[i] + vetor2[i];
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(soma[i]);
		}
		teclado.close();
	}

}
