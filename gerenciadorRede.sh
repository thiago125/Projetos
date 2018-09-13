#!/bin/bash

f1(){
nome=$(dialog --stdout --inputbox "Entre com o nome da máquina" 0 0 )
hostname $nome
}

f2(){
dialog --msgbox  "O nome da maquina é $(hostname)" 0 0
}

dialog --colors --title "\Z1ATENÇÃO" --msgbox "\Z6DEVE-SE ESTAR EM MODO ROOT" 5 40
while true
do
   
  op=$(dialog --colors --stdout --menu "\Z7 Gerenciador de Rede" 0 0 0 1 "Configurar  o nome da máquina"  2 "Exibir o nome configurado" 3 "Thiago" 22 "Sair")
case $op in
  1) f1;;
  2) f2;;
  3) ;;
  4);;
  5);;
  6);;
  7);;
  8);;
  9);;
  10);;
  11);;
  12);;
  13);;
  14);;
  15);;
  16);;
  17);;
  18);;
  19);;
  20);;
  21);;
  22) exit ;;
  *) dialog --infobox "Opção Inválida" 0 0;;
 esac
done
 

