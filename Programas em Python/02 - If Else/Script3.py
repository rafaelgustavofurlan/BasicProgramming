# Ler um numero e verificar se ele é par ou 
# impar. Quando for par armazenar esse valor 
# em 'p' e quando for impar armazena-lo em 'i'. 
# Exibir 'p' e 'i' no final do processamento.

#variáveis
p = 0
i = 0
#entradas
numero = int(input("Informe um número: "))
#processamento
if numero % 2 == 0:
    p = numero
else:
    i = numero
print(p)
print(i)