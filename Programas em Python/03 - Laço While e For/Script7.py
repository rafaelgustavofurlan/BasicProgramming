# Sua organizacao acaba de contratar um estagiario para 
# trabalhar no suporte de informatica, com a intenção 
# de fazer um levantameno nas sucatas encontradas nesta 
# area. A primeira tarefa dele é testar todos os cerca 
# de 200 mouses que se encontram la, testando e anotando 
# o estado de cada um deles, para verificar o que pode 
# aproveitar deles. Foi requisitado que voce desenvolva 
# um programa para registrar este levantamento. o 
# programa devera receber um numero indeterminado de 
# entradas, cada uma contendo: um numero de identificacao 
# do mouse e o tipo do defeito:
#- necessita de esfera
#- necessita de limpeza
#- necessita troca de cabo ou conector
#- quebrado ou inutilizado

#Uma identificacao igual a zero encerra o programa. ao final o programa 
#devera emitir o seguinte relatorio:

#quantidade de mouses: 100

#situacao                                quantidade    Percentual
#1- necessita da esfera                  40            40%
#2- necessita de limpeza                 30            30%
#3- necessita troca de cabo/conector     15            15%
#4- quebrado ou inutilizado              15            15%

#variáveis
contador_total = 0
contador_sit_1 = 0
contador_sit_2 = 0
contador_sit_3 = 0
contador_sit_4 = 0
#entradas
indentificador = int(input("Informe a identificação: "))
#entrada/processamento
while indentificador != 0:
    print("1 - Necessidade de esfera.")
    print("2 - Necessidade de limpeza.")
    print("3 - Necessidade troca do cabo ou conetor.")
    print("4 - Quebrado ou inutilizado.")
    #entrada
    defeito = int(input("Informe o tipo de defeito: "))
    #processamento
    if defeito == 1:
        contador_sit_1 = contador_sit_1 + 1
    elif defeito == 2:
        contador_sit_2 = contador_sit_2 + 1
    elif defeito == 3:
        contador_sit_3 = contador_sit_3 + 1
    elif defeito == 4:
        contador_sit_4 = contador_sit_4 + 1
    contador_total = contador_total + 1
    #entradas
    indentificador = int(input("Informe a identificação: "))
p1 = contador_sit_1  / contador_total * 100.0
p2 = contador_sit_2  / contador_total * 100.0
p3 = contador_sit_3  / contador_total * 100.0
p4 = contador_sit_4  / contador_total * 100.0
print("Quantidade de mouses: {0}".format(contador_total))
print("Situação                                   Quantidade    Precentual")
print("1 - Necessidade de esfera                     {0}          {1:.2f}%".format(contador_sit_1, p1))
print("2 - Necessidade de limpeza                    {0}          {1:.2f}%".format(contador_sit_2, p2))
print("3 - Necessidade troca do cabo ou conector     {0}          {1:.2f}%".format(contador_sit_3, p3))
print("4 - Quebrado ou inutilizado                   {0}          {1:.2f}%".format(contador_sit_4, p4))
    