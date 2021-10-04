/*
 * Joao da Silva, pescador, comprou um microsomputados para controlar o 
 * rendimento diário de seu trabalho. Toda vez que ele traz um peso de 
 * peixes maior que o estabelecido pelo regulamento de pesca do estado 
 * de Sâo Paulo (50 quilos) deve pagar uma multa de R$4,00 por quilo 
 * excedente. João precisa que você faça um algoritmo que leia a 
 * variável 'p' (peso de peixes) e verifique se há excesso. Se houver, 
 * gravar na variável 'e' (excesso) e na variável 'm' o valor da multa 
 * que João deverá pagar. Caso contrario mostrar tais variáveis com o 
 * conteudo 'zerado'.
 */

package geek;

import java.util.Scanner;

public class Script5 {

	public static void main(String[] args) {
		//variáveis
		float p, m;
		String e = "excesso";
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe o peso dos peixes: ");
		p = teclado.nextFloat();
		
		//Processamento
		if(p > 50) {
			m = (float)(p - 50) * (float)4.00;
			//saída
			System.out.printf("Você deverá pagar R$ %.2f em multas", m);
		}else {
			m = 0;
			e = "0";
			//saída
			System.out.println("Multas: " + m);
			System.out.println("Excesso: " + e);
		}
		teclado.close();

	}

}
