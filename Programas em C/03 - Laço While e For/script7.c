/*
 * sua organizacao acaba de contratar um estagiario para trabalhar no
 * suporte de informatica, com a intenção de fazer um levantameno
 * nas sucatas encontradas nesta area. a primeira tarefa dele é testar todos
 * os cerca de 200 mouses que se encontram la, testando e anotando o
 * estado de cada um deles, para verificar o que pode aproveitar deles.
 * doi requisitado que voce desenvolva um programa para registrar este
 * levantamento. o programa devera receber um numero indeterminado
 * de entradas, cada uma contendo: um numero de identificacao do
 * mouse e o tipo do defeito:
 * - necessita de esfera
 * - necessita de limpeza
 * - necessita troca de cabo ou conector
 * - quebrado ou inutilizado
 *
 * uma identificacao igual a zero encerra o programa. ao final o
 * programa devera emitir o seguinte relatorio:
 *
 * quantidade de mouses: 100
 *
 * situacao                                quantidade    Percentual
 * 1- necessita da esfera                  40            40%
 * 2- necessita de limpeza                 30            30%
 * 3- necessita troca de cabo/conector     15            15%
 * 4- quebrado ou inutilizado              15            15%
 */

#include <stdio.h>

int main(){
	//variáveis
	int contador_total = 0, contador_sit_1 = 0, contador_sit_2 = 0, contador_sit_3 = 0,
			contador_sit_4 = 0, indentificacao , defeito;

	//Entradas
	printf("Informe a identificação: ");
	scanf("%d", &indentificacao);

	while(indentificacao != 0){
		printf("1 - Necessita de esfera.\n");
		printf("2 - Necessita de limpeza.\n");
		printf("3 - Necessita de troca do cabo ou conector.\n");
		printf("4 - Quebrado ou inutilizado.\n");
		printf("Informe o tipo de defeito: \n");
		scanf("%d", &defeito);
		//Processamento
		if(defeito == 1){
			contador_sit_1 = contador_sit_1 + 1;
		}
		if(defeito == 2){
			contador_sit_2 = contador_sit_2 + 1;
		}
		if(defeito == 3){
			contador_sit_3 = contador_sit_3 + 1;
		}
		if(defeito == 4){
			contador_sit_4 = contador_sit_4 + 1;
		}
		contador_total = contador_total + 1;
		//Entradas
		printf("Informe a identificação: ");
		scanf("%d", &indentificacao);
	}
	float p1, p2, p3, p4; //(float) cast
	p1 = ((float)contador_sit_1 / (float)contador_total * 100.0);
	p2 = ((float)contador_sit_2 / (float)contador_total * 100.0);
	p3 = ((float)contador_sit_3 / (float)contador_total * 100.0);
	p4 = ((float)contador_sit_4 / (float)contador_total * 100.0);

	printf("Quantidade de Mouses %d\n\n", contador_total);
	printf("Situação \t\t\tQuantidade \tPercentual\n");
	printf("1-Necessita de esfera \t\t\t%d \t%.2f%%\n", contador_sit_1, p1);
	printf("2-Necessita de limpeza \t\t\t%d \t%.2f%%\n", contador_sit_2, p2);
	printf("3-Necessita troca do cabo ou conector \t%d \t%.2f%%\n", contador_sit_3, p3);
	printf("4-Quebrado ou Inutilizado \t\t%d \t%.2f%%\n", contador_sit_4, p4);
}
