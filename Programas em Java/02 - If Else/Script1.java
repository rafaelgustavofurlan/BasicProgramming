/*
 * Ler uma variavel numérica n e imprimi-la somente se a mesma for maior
 * que 100, caso contrario imprimi-la com o valor zero.
 */

package geek;

import java.util.Scanner;

public class Script1 {

	public static void main(String[] args) {
		//variáveis
		int n;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe um número: ");
		n = teclado.nextInt();
		
		//processamento
		if(n > 100) {
			System.out.println(n);
		}else{
			n = 0;
			System.out.println(n);
		}
		teclado.close();
	}

}
