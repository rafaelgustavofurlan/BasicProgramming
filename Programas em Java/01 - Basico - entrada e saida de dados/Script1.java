/*
 * Faça um algoritmo para somar dois numeros
 * e multiplicar o resultado pelo primeiro numero
 */

package geek;

import java.util.Scanner;

public class Script1 {

	public static void main(String[] args) {
		//variáveis
		int num1, num2, soma, multiplicacao;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe o primeiro número: ");
		num1 = teclado.nextInt();
		System.out.println("Informe o segundo número: ");
		num2 = teclado.nextInt();
		
		//Processamento
		soma = num1 + num2;
		multiplicacao = soma * num1;
		
		//Saída
		System.out.println("O resultado da multiplicação é " + multiplicacao);
		
		teclado.close();

	}

}
