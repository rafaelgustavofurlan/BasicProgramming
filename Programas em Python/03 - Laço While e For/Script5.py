# Faca um programa que leia um nome de usuario e a senha 
# e não aceite a senha igual ao nome do usuario, 
# mostrando uma mensagem de erro e voltando pedir 
# as informacoes.

#entradas
nome = input("Informe o nome: ")
senha = input("Informe a senha: ")
#processamento
while nome == senha:
    print("Nome de usuário e senha devem ser diferentes.")
    nome = input("Informe o nome: ")
    senha = input("Informe a senha: ")
