/*
 * tendo como dados de entrada a altura e o sexo de uma pessoa, construa
 * um algoritmo que calcule seu peso ideal, utilizando as seguintes formulas:
 * para homens: (72.7 * altura) - 58
 * para mulheres: (62.1 * altura) - 44.7
 */

#include <stdio.h>
#include <ctype.h>

int main(){
	//Variáveis
	float altura, peso_ideal;
	char sexo;

	//entradas
	printf("Informe sua altura: ");
	scanf("%f", &altura);
	gets(stdin); //corrigir bug
	printf("Informe o sexo m/f: ");
	scanf("%c", &sexo);

	//Processamento
	if(tolower(sexo) == 'm'){
		peso_ideal = (72.7 * altura) - 58;
		printf("Seu peso ideal é %.2f", peso_ideal);
	}
	if(tolower(sexo) == 'f'){
		peso_ideal = (62.1 * altura) - 44.7;
		printf("Seu peso ideal é %.2f", peso_ideal);
	}
	if(tolower(sexo) != 'm' && tolower(sexo) != 'f'){
		printf("Sexo não reconhecido. \n");
	}
}
