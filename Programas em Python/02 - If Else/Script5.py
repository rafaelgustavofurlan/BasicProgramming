# Joao da Silva, pescador, comprou um microsomputados 
# para controlar o  * rendimento diário de seu trabalho. 
# Toda vez que ele traz um peso de peixes maior que o 
# estabelecido pelo regulamento de pesca do estado de 
# Sâo Paulo (50 quilos) deve pagar uma multa de R$4,00 
# por quilo excedente. João precisa que você faça um 
# algoritmo que leia a variável 'p' (peso de peixes) e 
# verifique se há excesso. Se houver, gravar na variável 
# 'e' (excesso) e na variável 'm' o valor da multa que 
# João deverá pagar. Caso contrario mostrar tais 
# variáveis com o conteudo 'zerado'.

#entradas
p = float(input("Informe o peso dos peixes: "))
#processamento
if p > 50:
    m = (p - 50) * 4.00
    e = 'excesso'
    print("Você deverá pagar R$ {0:.2f}".format(m))
else:
    m = 0
    e = 0
    print("Multas: {0}".format(m))
    print("Excesso: {0}".format(e))