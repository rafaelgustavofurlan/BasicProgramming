/*
 * Faça um algoritmo que carregue um vetor de 5 elementos 
 * inteiros e em seguida armazene em um vetor apenas os 
 * numeros pares maiores que 0. No final deve mostrar os 
 * elementos do vetor na tela.
 */

package geek;

import java.util.ArrayList;

public class Script1 {

	public static void main(String[] args) {
		//variaveis
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		ArrayList<Integer> pares = new ArrayList<Integer>();
		
		for (int i = 0; i < 5; i++) {
			vetor.add(i);
			if(i % 2 == 0) {
				if(i > 0) {
					pares.add(i);
				}
			}
		}
		
		for(Integer n : pares) {
			System.out.println(n);
		}
	}

}
