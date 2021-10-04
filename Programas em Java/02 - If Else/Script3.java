/*
 * Ler um numero e verificar se ele é par ou impar. Quando for par armazenar 
 * esse valor em 'p' e quando for impar armazena-lo em 'i'.
 * Exibir 'p' e 'i' no final do processamento.
 */

package geek;

import java.util.Scanner;

public class Script3 {

	public static void main(String[] args) {
		//variáveis
		int numero, p = 0, i = 0;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe um número: ");
		numero = teclado.nextInt();
		
		//Processamento
		if(numero % 2 == 0) {
			p = numero;
		}else{
			i = numero;
		}
		System.out.println("P: " + p);
		System.out.println("I: " + i);
		teclado.close();
	}

}
