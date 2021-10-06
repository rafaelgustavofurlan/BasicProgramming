# Elabore um algoritmo que leia um numero. Se positivo 
# armazene-o em 'a', se for negativo, em 'b'. No Final 
# mostre o resultado.


#entradas
numero = int(input("Informe um número: "))
#processamento
if numero > 0:
    a = numero
    print("Valor positivo")
else:
    b = numero
    print("Valor negativo")
print(numero)