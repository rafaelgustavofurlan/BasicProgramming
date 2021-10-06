# Faca um algoritmo que determine o maior entre N numeros. 
# A condicao de parada é a entrada de um valor 0, ou seja, 
# o algoritmo deve ficar calculando o maior até que a 
# entrada seja igual a 0 (Zero).

#variáveis
maior = 0
#entrada
n = int(input("Informe um número: "))
while n != 0:
    if n > maior:
        maior = n
    n = int(input("Informe um número: "))
print("O maior número é {0}".format(maior))
