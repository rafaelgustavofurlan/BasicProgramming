# Faça um algoritmo que carregue 
# um vetor de 5 elementos inteiros 
# e em seguida armazene em um vetor 
# apenas os numeros pares maiores 
# que 0. No final deve mostrar os 
# elementos do vetor na tela.

#variáveis
vetor = [] #lista vazia
pares = [] #lista vazia
for n in range(1, 6):
    vetor.append(n)
    if n % 2 == 0:
        pares.append(n)
for p in pares:
    print(p)
