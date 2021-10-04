/*
 * Elabore um algoritmo que leia as variaveis 'c' e 'n', respectivamente 
 * codigo e numero de horas trabalhadas de um operario. Calucle o salario 
 * sabendo-se que ele ganha R$10,00 por hora. QUando o numero de horas 
 * exceder a 50 calcule o excesso de pagamento armazenando-o na 
 * variavel 'e'. Caso contrario zerar tal variavel. A hora excedente de 
 * trabalho vale R$20,00. No final do processamento, imprimir o salario 
 * total e o salario excedente.
 */

package geek;

import java.util.Scanner;

public class Script6 {

	public static void main(String[] args) {
		//variáveis
		int c;
		float n, e = 0, salario, valor_hora = (float) 10.00;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe o código: ");
		c = teclado.nextInt();
		System.out.println("Informe a quantidade de horas trabalhadas: ");
		n = teclado.nextFloat();
		
		//Processamento
		if(n > 50) {
			e = (float)(n - 50) * (float)20.00;
			salario = (50 * valor_hora) + e;
			System.out.printf("Salário Total R$ %.2f\n", salario);
			System.out.printf("Salário excedente R$ %.2f\n", e);
		}else {
			salario = n * valor_hora;
			System.out.printf("Salário Total R$ %.2f\n", salario);
			System.out.printf("Salário excedente R$ %.2f\n", e);
		}
		teclado.close();
 
	}

}
