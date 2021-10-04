/*
 * Elabore um algoritmo que leia um numero. Se positivo armazene-o em 'a',
 * se for negativo, em 'b'. No Final mostre o resultado.
 */

package geek;

import java.util.Scanner;

public class Script2 {

	public static void main(String[] args) {
		//variáveis
		int numero, a, b;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Informe um número: ");
		numero = teclado.nextInt();
		
		//Processamento
		if(numero > 0) {
			a = numero;
			//Saída
			System.out.println(a);
		}else {
			b = numero;
			//Saída
			System.out.println(b);
		}
		teclado.close();
	}

}
