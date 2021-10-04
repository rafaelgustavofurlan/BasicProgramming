/*
 * Faça um algoritmo que peça dois numeros e imprima a soma.
 */

package geek;

import java.util.Scanner;

public class Script3 {

	public static void main(String[] args) {
		//Variáveis
		int num1, num2, soma;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe o primeiro número: ");
		num1 = teclado.nextInt();
		
		System.out.println("Informe o segundo número: ");
		num2 = teclado.nextInt();
		
		//Processamento
		soma = (num1 + num2);
		
		//Saída
		System.out.println("A soma é " + soma);
		
		teclado.close();
	}

}
