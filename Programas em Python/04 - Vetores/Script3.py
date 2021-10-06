# Faça um programa que carregue um vetor com dez numeros 
# inteiros. Mostre o vetor na ordem inversa a que foi 
# digitado.

#variaveis
vetor = []
#entradas
for n in range(0, 10):
    num = int(input("Informe o valor para o vetor: "))
    vetor.append(num)
#processamento
vetor.reverse() #inverte a lista
for n in vetor:
    print(n)
