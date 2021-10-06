# Elabore um algoritmo que leia as variaveis 
# 'c' e 'n', respectivamente codigo e numero 
# de horas trabalhadas de um operario. Calucle 
# o salario sabendo-se que ele ganha R$10,00 
# por hora. QUando o numero de horas exceder a 
# 50 calcule o excesso de pagamento armazenando-o 
# na variavel 'e'. Caso contrario zerar tal 
# variavel. A hora excedente de trabalho vale 
# R$20,00. No final do processamento, imprimir 
# o salario total e o salario excedente.

#variáveis
valor_hora = 10.00
valor_hora_excedente = 20.00
e = 0
#entradas
c = int(input("Informe o código: "))
n = float(input("Informe a quantidade de horas trabalhadas: "))
#processamento
if n > 50:
    e = (n - 50) * valor_hora_excedente #20.00
    salario = (50 * valor_hora) + e #10.00
    print("Salário Total R$ {0:.2f}".format(salario))
    print("Salário excedente R$  {0:.2f}".format(e))
else:
    salario = (n * valor_hora) # 10.00
    print("Salário Total R$  {0:.2f}".format(salario))
    print("Salário excedente R$ {0:.2f}".format(e))