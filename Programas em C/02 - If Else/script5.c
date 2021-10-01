/*
 * Joao da Silva, pescador, comprou um microsomputados para controlar o
 * rendimento diário de seu trablaho. Toda vez que ele traz um peso de peixes
 * maior que o estabelecido pelo regulamento de pesca do estado de Sâo Paulo
 * (50 quilos) deve pagar uma multa de R$4,00 por quilo excedente.
 * João precisa que você faça um algoritmo que leia a variável 'p' (peso de peixes)
 * e verifique se há excesso. Se houver, gravar na variável 'e' (excesso)
 * e na variável 'm' o valor da multa que João deverá pagar. Caso contrario mostrar
 * tais variáveis com o conteudo 'zerado'
 */

#include <stdio.h>

int main(){
	//variáveis
	float p, m;
	char e[8] = "excesso"; // '\0'

	//Entradas
	printf("Informe o peso dos peixes: ");
	scanf("%f", &p);

	//Processamento
	if(p > 50){
		m = (p - 50) * 4.00;
		//saída
		printf("Você deverá pagar R$ %.2f em multas.", m);
	}else{
		m = 0;
		e[0] = 0;
		//saídas
		printf("Multas: %.2f\n", m);
		printf("Excesso: %d", e[0]);
	}
}
