/*
 * desenvolva um gerador de tabuada, capaz de gerar a tabuada de
 * qualquer numero inteiro entre 1 a 10. O usuario deve informar de qual
 * numero ele deseja ver a tabuada
 */

#include <stdio.h>

int main(){
	//variáveis
	int numero;

	//Entrada
	printf("Informe um número entre 1 e 10: ");
	scanf("%d", &numero);

	//Processamento
	while(numero < 1 || numero > 10){
		printf("Informe um número entre 1 e 10: ");
		scanf("%d", &numero);
	}
	for(int i = 1; i <= 10; i++){
		//5 X 1 = 5
		printf("%d X %d = %d\n", numero, i, (numero * i));
	}
}
