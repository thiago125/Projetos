#-*- coding: utf-8 -*-

import socket


print("Qual o endreço IP do servidor?")
HOST = raw_input()

PORT = 5000
tcp = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
dest = (HOST, PORT)
tcp.connect(dest)

mensagem = ""

while mensagem != "sair":
     tcp.send(mensagem)
     print("Qual é a mensagem?")
     mensagem = raw_input()
     tcp.send(mensagem)
     print("Esperando mensagem...")
     resposta = tcp.recv(1024)
     print("Resposta: "+resposta)

tcp.close()
