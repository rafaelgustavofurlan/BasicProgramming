/*
 * Elabore um algoritmo que leia as variaveis 'c' e 'n', respectivamente codigo
 * e numero de horas trabalhadas de um operario. Calucle o salario sabendo -se que
 * ele ganha R$10,00 por hora. QUando o numero de horas exceder a 50 calcule o
 * excesso de pagamento armazenando-o na variavel 'e'. Caso contrario zerar tal variavel.
 * a hora excedente de trabalho vale R$20,00. No final do processamento, imprimir o
 * salario total e o salario excedente.
 */

#include <stdio.h>

int main(){
	//Variáveis
	int c;
	float n, e = 0, salario, valor_hora = 10.00;

	//entradas
	printf("Informe o código: ");
	scanf("%d", &c);
	printf("Informe a quantidade de horas trabalhadas: ");
	scanf("%f", &n);

	//processamento
	if(n > 50){
		e = (n - 50) * 20.00;
		salario = (50 * valor_hora) + e;
		//saídas
		printf("Salário Total R$ %.2f\n", salario);
		printf("Salário excedente R$ %.2f", e);
	}else{
		salario = n * valor_hora;
		//saídas
		printf("Salário Total R$ %.2f\n", salario);
		printf("Salário excedente: R$ %.2f", e);
	}
}
