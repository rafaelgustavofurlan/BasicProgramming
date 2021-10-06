# Escreva um algoritmo que leia dois vetores de 10 posicoes e 
# faca a soma dos elementos de mesmo indice, colocando o 
# resultado em um terceiro vetor. Mostre o vetor resultante.

#variávies
vetor1 = []
vetor2 = []
soma = []
#entrada/processamento
for n in range(0, 10):
    num1 = int(input("Informe o valor para o primeiro vetor: "))
    vetor1.append(num1)
    num2 = int(input("Informe o valor para o segundo vetor: "))
    vetor2.append(num2)
    soma.append(num1 + num2)
for n in soma:
    print(n)
