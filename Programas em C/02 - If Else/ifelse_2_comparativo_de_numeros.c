/*
 * elabore um algoritmo que leia um numero. Se positivo armazene-o em 'a',
 * se for negativo, em 'b'. No final mostrar o resultado
 */

#include <stdio.h>

int main(){
	//variáveis
	int numero, a, b;

	//Entradas
	printf("Informe um número: ");
	scanf("%d", &numero);

	//Processamento
	if(numero > 0){
		a = numero;
		printf("O %d é positivo.", numero);
	}else{
		b = numero;
		printf("O %d é negativo.", numero);
	}
}
