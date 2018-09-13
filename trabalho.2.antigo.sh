#/bin/bash
novoNomeHost(){
	nome=$(dialog --stdout --inputbox "Digite o nome do host que deseja :" 0 0)
	dialog --msgbox "`hostname $nome` alterado com sucesso" 0 0 
}
nomeDoHost(){
	dialog infobox "Nome do host :" 0 0
	dialog --msgbox "`hostname`" 0 0 
}
NovoIP(){
	nome=$(dialog --stdout --inputbox "Digite seu processo :" 0 0)
	dialog --msgbox "`killall -STOP - $nome` PARANDO PROCESSO PELO  NOME" 0 0 
}
visualizarInterface(){
	dialog --msgbox "`ifconfig`" 0 0 
}
continuar_pelo_nome(){
	nome=$(dialog --stdout --inputbox "Digite seu processo :" 0 0)
	dialog --msgbox "`killall -CONT - $nome` CONTINUAR PROCESSO PELO NOME" 0 0 
}
continuar_processo_pid(){
	nome=$(dialog --stdout --inputbox "Digite seu processo :" 0 0)
	dialog --msgbox "`kill -cont - $nome` CONTINUAR PROCESSO PELO PID" 0 0 
}
matar_pid(){
	nome=$(dialog --stdout --inputbox "Digite seu processo :" 0 0)
	dialog --msgbox "`kill -kill - $nome` MATANDO PROCESSO PELO PID" 0 0 
}
matar_nome(){
	nome=$(dialog --stdout --inputbox "Digite seu processo :" 0 0)
	dialog --msgbox "`killall -KILL - $nome` MATANDO PROCESSO PELO NOME" 0 0 
}
terminar_processo(){
	nome=$(dialog --stdout --inputbox "Digite seu processo :" 0 0)
	dialog --msgbox "`kill -TERM - $nome` TERMINANDO PROCESSO PELO PID" 0 0 
}
terminar_nome(){
	nome=$(dialog --stdout --inputbox "Digite seu processo :" 0 0)
	dialog --msgbox "`killall -TERM - $nome` MATANDO PROCESSO PELO PID" 0 0 
}
criar_niciles(){
	nome=$(dialog --stdout --inputbox "Digite seu processo :" 0 0)
	numero_nice=$(dialog --stdout --inputbox "Digite o numero do nice :" 0 0)
	dialog --msgbox "`nice -n $numero_nice $nome &`" 0 0 	
}
alterar_niceleS(){
	nome=$(dialog --stdout --inputbox "Digite seu processo :" 0 0)
	numero_nice=$(dialog --stdout --inputbox "Digite o novo numero do nice :" 0 0)
	dialog --msgbox "`renice -n $numero_nice $nome &`" 0 0 	
	
}
arvore_de_processo(){
	pid=$(dialog --stdout --inputbox "Digite o PID do processo :" 0 0)
	dialog --msgbox "`pstree $pid`" 0 0
}
arvore_do_usuario(){
	nome=$(dialog --stdout --inputbox "Digite o nome usuario :" 0 0)
	dialog --msgbox "`pstree $nome`" 0 0

}
sair_do_shell(){
	exit

}
sair_do_processo_cursor(){
	dialog --msgbox "`xkill` clique em uma aba" 0 0 
	
}
dialog --colors --title "\Z1ATENÇÃO" --msgbox "\Z6DEVE-SE ESTAR EM MODO ROOT" 0 0
while :
do
opcao=$(dialog --stdout --menu "gerenciador de tarefas 	do aluno Saulo" 0 0 0 1 "Modificar nome do host" 2 "Nome do host" 3 "Para processo pelo nome" 4 "Visualizar interfaces de rede" 5 "Continuar processo pelo nome" 6 "Continiar processo pelo PID" 7 "Matar Processo pelo pid" 8 "Matar Processo pelo nome" 9 "Terminar processo pelo PID" 10 "Terminar processo pelo nome" 11 "criar processo com prioridade expecifica" 12 "Alterar prioridade de um processo" 13 "Mostar arvore de um processo" 14 "Mostar arvore do usuiario" sair "Sair do shell" 15 "matar pelo cursor do mause")
case $opcao in
0)abrir_processo;;
1)novoNomeHost;;
2)nomeDoHost;;
3)parar_processo_nome;;
4)visualizarInterface;;
5)continuar_pelo_nome;;
6)continuar_processo_pid;;
7)matar_pid;;
8)matar_nome;;
9)terminar_processo;;
10)terminar_nome;;
11)criar_niceles;;
12)alterar_niceles;;
13)arvore_de_processo;;
14)arvore_do_usuario;;
15)sair_do_processo_cursor;;
sair)sair_do_shell;;
esac
done

