# Faça um programa que receba um codigo numerico inteiro 
# e um vetor de cinco posicoes de numeros reais. Se o 
# codigo for zero, termine o progtama. Se o codigo for 1, 
# mostre o vetor na ordem direta. Se o codigo for 2, 
# mostre o vetor na ordem inversa.

#variaveis
vetor = []
#entrada
codigo = int(input("Informe o código: "))
#processamento
if codigo != 0:
    for n in range(0, 5):
        num = float(input("Informe um valor real: "))
        vetor.append(num)
    if codigo == 1:
        for n in vetor:
            print(n)
    if codigo == 2:
        vetor.reverse()
        for n in vetor:
            print(n)
