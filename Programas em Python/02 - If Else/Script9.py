# A secretaria de meio ambiente que controla o 
# indice de poluicao mantem 3 grupos de industrias 
# que sao altamente poluentes do meio ambiente. 
# O indice de poluicao aceitavel varia de 0.05 ate 
# 0.25. Se o indice sobe para 0.3 as industrias do 
# 10 grupo sao intimadas a suspenderem suas atividades, 
# se o indice crescer para 0.4 as industrias do 1o e 2o 
# grupo sao intimadas a suspenderem suas atividades, 
# se o indice atingir 0.5 todos os grupos devem ser 
# notificados a paralisarem suas atividades. Faca um 
# algoritmo que leia o indice de poluicao medido e emita 
# a notificacao adequada aos diferentes grupos de empresas.

#entradas
indice = float(input("Informe o índice de poluição: "))
#processamento
if indice >= 0.3 and indice < 0.4:
    print("Atenção: Indústrias do 1o grupo devem suspender as atividades.")
elif indice >= 0.4 and indice < 0.5:
    print("Atenção: Indústrias do 1o e 2o grupo devem suspender as atividades.")
elif indice >= 0.5:
    print("Atenção: Todos os grupos devem suspender as atividades.")