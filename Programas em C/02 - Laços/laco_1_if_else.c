/*
 * ler uma variavel numerica n e imprimi-la somente se a mesma for maior
 * que 100, caso contrário, imprimi-la com o valor zero
 *
 * receber valor
 * se valor > 100 então
 * 	escrever valor
 * senão
 * 	valor = 0
 * 	escrever valor
 */

#include <stdio.h>

int main (){
	//Variaveis
	int n;

	//Entrada
	printf("Informe um número: ");
	scanf("%d",&n);

	//Processamento
	if(n > 100){
		printf("%d", n);
	}else {
		n = 0;
		printf("%d", n);
	}
}
