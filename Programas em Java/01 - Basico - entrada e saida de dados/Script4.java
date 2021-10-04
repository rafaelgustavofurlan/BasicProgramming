/*
 * Faça um algoritmo que converta metros para centíme 
 */

package geek;

import java.util.Scanner;

public class Script4 {

	public static void main(String[] args) {
		//variáveis
		int metros, centimetros;
		Scanner xuxa = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe o valor em metros: ");
		metros = xuxa.nextInt();
		
		//Processamento
		centimetros = (metros * 100);
		
		//saída
		System.out.println(metros + " metros em centímetros é " + centimetros);
		
		xuxa.close();

	}

}
