/*
 * faca um algoritmo que determine o maior entre N numeros. a condicao de
 * parada é a entrada de um valor 0, ou seja, o algoritmo deve ficar calculando o
 * maior até que a entrada seja igual a 0
 */

#include <stdio.h>

int main(){
	//variáveis
	int n, maior = 0;

	//Entradas
	printf("Informe um número: ");
	scanf("%d", &n);

	//Processamento
	while(n != 0){
		if(n > maior){
			maior = n;
		}
		//Entradas
		printf("Informe um número: ");
		scanf("%d", &n);
	}
	printf("O maior número é %d", maior);
}
