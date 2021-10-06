# Tendo como dados de entrada a altura e o sexo 
# de uma pessoa, construa um algortimo que calcule 
# seu peso ideal, utilizando as seguintes formulas:
# Para homens: (72.7 * altura) - 58
# Para mulheres: (62.1 * altura) - 44.7

#entradas
altura = float(input("Informe sua altura: "))
sexo = input("Informe o sexo m/f: ")
#processamento
if sexo.lower() == 'm':
    peso_ideal = (72.7 * altura) - 58
elif sexo.lower() == 'f':
    peso_ideal = (62.1 * altura) - 44.7
else:
    peso_ideal = 0
    print("Sexo não reconhecido.")
#saída
print("Seu peso ideal é {0:.2f}".format(peso_ideal))