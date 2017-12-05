#-*- coding: utf-8 -*-

import socket 
HOST = ''			# Endereco IP do Servidor
PORT = 5000			# Porta que o Servidor esta
tcp = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
origem = (HOST, PORT)
tcp.bind(origem)
tcp.listen(1)

conexao, cliente = tcp.accept()
print 'Concetado por', cliente
msg = ""
while msg!= "sair" :
	print("Esperando mesangem...")
	msg = conexao.recv(1024)
	print("Mensagem de "+str(cliente)+": "+msg)
	resposta = raw_input("informe a resposta: ")
	conexao.send(resposta)

conexao.close()

