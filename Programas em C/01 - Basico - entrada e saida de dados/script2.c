/*
 * Faça um algoritmo para calcular o estoque médio de uma peça sendo que
 *
 * estoque_medio = (quandiade_minima + quantidade_maxima)/2
 */

#include <stdio.h>

int main(){
	//Declarando variáveis
	int quantidade_minima, quantidade_maxima;
	float estoque_medio;

	//Entradas
	printf("Informe a quantidade mínima: ");
	scanf("%d", &quantidade_minima);

	printf("Informe a quantidade máxima: ");
	scanf("%d", &quantidade_maxima);

	//Processamentos
	estoque_medio = (quantidade_minima + quantidade_maxima) / 2;

	//Saída
	printf("O estoque médio é %.2f", estoque_medio);

}
