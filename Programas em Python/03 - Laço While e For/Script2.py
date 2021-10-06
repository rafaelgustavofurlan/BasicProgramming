# Faca um algoritmo que conte de 1 a 100 e a cada 
# multiplo de 10 emita uma mensagem: "Multiplo de 
# 10".

#processamento
for n in range(1, 101): #n - 1
    print(n)
    if n % 10 == 0:
        print("Múltiplo de 10")
