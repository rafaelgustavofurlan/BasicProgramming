/*
 * Ler um numero e verificar se ele é par ou impar. QUando for par armazenar
 * este valor em 'p' e quando for impar armazena-lo em 'i'.
 * exibir 'p' ou 'i' no final do processamento
 */

#include <stdio.h>

int main(){
	//Variáveis
	int numero, p = 0, i = 0;

	//Entradas
	printf("Informe um número: ");
	scanf("%d", &numero);

	//Processamento
	if(numero % 2 == 0){
		p = numero;
	}else{
		i = numero;
	}
	printf("P igual %d\n", p);
	printf("I igual %d", i);
}
