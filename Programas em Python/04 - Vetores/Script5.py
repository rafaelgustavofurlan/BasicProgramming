# Faça um programa que carregue um vetor com dez numeros inteiros. 
# Calcule e mostre os numeros superiores a 50 e suas respectivas 
# posicoes. Mostrar mensagem se não existir nenhum numero nesta 
# condição.

vetor = []
tem_maior_50 = False
#entradas
for n in range(0, 10):
    num = int(input("Informe {0} valor para o vetor: ".format(n+1)))
    vetor.append(num)
for n in vetor:
    if n > 50:
        print("O número {0} está na posição {1} do vetor.".format(n, vetor.index(n)))
        tem_maior_50 = True
if tem_maior_50 == False:
    print("Não existe nenhum número maior que 50")
