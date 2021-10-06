# Tendo como dados de entrada a altura de uma pessoa, 
# construa um algoritmo que calcule seu peso ideal, 
# usando a seguinte formula: (72.7 * altura) - 58

#entrada
altura = float(input("Qual sua altura? "))
#processamento
peso_ideal = (72.7 * altura) - 58
#saída
print("Seu peso ideal seria {0:.2f}".format(peso_ideal))