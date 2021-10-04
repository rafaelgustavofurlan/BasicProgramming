/*
 * Tendo como dados de entrada a altura e o sexo de uma pessoa, construa
 * um algortimo que calcule seu peso ideal, utilizando as seguintes formulas:
 * Para homens: (72.7 * altura) - 58
 * Para mulheres: (62.1 * altura) - 44.7
 */

package geek;

import java.util.Scanner;

public class Script4 {

	public static void main(String[] args) {
		//variáveis
		float altura, peso_ideal;
		char sexo; 
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Informe sua altura: ");
		altura = teclado.nextFloat();
		
		System.out.println("Informe o sexo m/f: ");
		sexo = teclado.next().charAt(0);
		
		//Processamento
		if(sexo == 'm') {
			peso_ideal = (float)(72.7 * altura) - 58;//cast
			System.out.printf("Seu peso ideal é %.2f",peso_ideal);
		}else if(sexo == 'f') {
			peso_ideal = (float)(62.1 * altura) - (float)44.7;
			System.out.printf("Seu peso ideal é %.2f",peso_ideal);
		}else if(sexo != 'm' && sexo != 'f') {
			System.out.println("Sexo não reconhecido.");
			peso_ideal = 0;
		}
		teclado.close();

	}

}
