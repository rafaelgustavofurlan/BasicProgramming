/*
 * A secretaria de meio ambiente que controla o indice de poluicao 
 * mantem 3 grupos de industrias que sao altamente poluentes do meio 
 * ambiente. O indice de poluicao aceitavel varia de 0.05 ate 0.25. 
 * se o indice sobe para 0.3 as industrias do 10 grupo sao intimadas 
 * a suspenderem suas atividades, se o indice crescer para 0.4 as 
 * industrias do 1o e 2o grupo sao intimadas a suspenderem suas 
 * atividades, se o indice atingir 0.5 todos os grupos devem ser 
 * notificados a paralisarem suas atividades. Faca um algoritmo que
 *  leia o indice de poluicao medido e emita a notificacao adequada 
 *  aos diferentes grupos de empresas.
 */

package geek;

import java.util.Scanner;

public class Script9 {

	public static void main(String[] args) {
		//variáveis
		float indice;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Informe o índice de poluição: ");
		indice = teclado.nextFloat();
		
		//Processamento
		if(indice >= 0.3 && indice < 0.4) {
			System.out.println("Atenção: Indústrias do 1o grupo devem suspender as atividades.");
		}else if(indice >= 0.4 && indice < 0.5) {
			System.out.println("Atenção: Indústrias do 1o e 2o grupo devem suspender as atividades.");
		}else if(indice >= 0.5) {
			System.out.println("Atenção: Todos os grupos devem suspender as atividades.");
		}
		teclado.close();
	}

}
