/*
 * Faça um programa que receba um codigo numerico inteiro e um vetor 
 * de cinco posicoes de numeros reais. Se o codigo for zero, termine 
 * o progtama. Se o codigo for 1, mostre o vetor na ordem direta. 
 * Se o codigo for 2, mostre o vetor na ordem inversa.
 */

package geek;

import java.util.Scanner;

public class Script6 {

	public static void main(String[] args) {
		//variaveis
		float[] vetor = new float[5];
		int codigo;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Informe o código: ");
		codigo = teclado.nextInt();
		
		if(codigo != 0 && codigo <= 2) {
			for (int i = 0; i < 5; i++) {
				System.out.println("Informe um número real: ");
				vetor[i] = teclado.nextFloat();
			}
			if(codigo == 1) {
				for (int i = 0; i < 5; i++) {
					System.out.println(vetor[i]);
				}
			}
			if(codigo == 2) {
				for (int i = (vetor.length - 1); i >= 0; i--) {
					System.out.println(vetor[i]);
				}
			}
		}
		teclado.close();

	}

}
