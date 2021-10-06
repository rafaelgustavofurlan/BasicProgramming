# Desenvolva um gerador de tabuada, capaz de gerar a tabuada de 
# qualquer numero inteiro entre 1 a 10. O usuario deve informar 
# de qual numero ele deseja ver a tabuada.

#entrada
numero = int(input("Informe um número entre 1 e 10: "))
#processamento
while numero < 1 or numero > 10:
    numero = int(input("Informe um número entre 1 e 10: "))
print("Tabuada de {0}".format(numero))
for n in range(1, 11):
    print("{0} x {1} = {2}".format(numero, n, (numero * n)))
