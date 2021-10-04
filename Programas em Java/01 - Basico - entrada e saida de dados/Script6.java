/*
 * Tendo como dados de entrada a altura de uma pessoa,
 * construa um algoritmo que calcule seu peso ideal, usando
 * a seguinte formula: (72.7 * altura) - 58 
 */

package geek;

import java.util.Scanner;

public class Script6 {

	public static void main(String[] args) {
		//variáveis
		float altura, peso_ideal;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Qual a sua altura? ");
		altura = teclado.nextFloat();
		
		//Processamento
		peso_ideal = (float)(altura * 72.7) - 58; //cast
		
		//Saída
		System.out.printf("Seu peso ideal seria %.2f", peso_ideal);
		
		teclado.close();
	}

}
