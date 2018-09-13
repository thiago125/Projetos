#!/bin/bash

while true
do
opcao=$(dialog --help-button --help-label "Sobre" --stdout --title 'Gerenciador de Arquivos' --menu 'Escolha uma das opções do menu' \
       0 0 0 1 'Localização atual do usuário' \
             2 'Exibir o conteudo de um diretorio' \
             3 'Criar um diretório' \
             4 'Apagar um diretório vazio/não-vazio' \
             5 'Criar um atalho para um aquivo' \
             6 'Exibir as ultimas linhas de um arquivo' \
             7 'Exibir as primeiras linhas de um arquivo' \
             8 'Buscar um arquivo' \
             9 'Localização de um comando específico' \
             10 'Exibir a função de um comando' \
             11 'Mudar a posse do usuário dono de um arquivo' \
             12 'Numero de caracteres, palavras e linhas do arquivo' \
             13 'Copiar um arquivo para outro diretório' \
             14 'Mover um arquivo para outro diretório' \
             15 'Montar partição/dispositivo externo em um diretório' \
             16 'Desmontar diretório montado anteriormente' \
             17 'Mudar data de ultima alteração de um arquivo' \
             18 'Exibir tela de partições do sistema' \
             19 'Testar a consistência lógica de uma partição' \
             20 'Sair do Gerenciador de Arquivos' )



      case $opcao in
        1) dialog --prgbox 'Saída do comando' 'pwd' 8 60;;
         
        2) dialog --prgbox 'Saída do comando' 'ls -l' 8 60;;
         
        3) diretorio=$(dialog --stdout --inputbox "Digite o nome do diretorio" 8 60)
           dialog  --colors --title "\Z7 Diretório criado com sucesso" --msgbox "$(mkdir $diretorio)" 5 40;;    
         
        4) diretorio2=$(dialog --stdout --inputbox "Digite o nome do diretorio a apagar" 8 60)
            dialog --colors  --title "\Z7 Diretório apagado com sucesso" --msgbox "$(rm -rf $diretorio2)" 5 40;;
              
        5) arquivo=$(dialog --stdout --inputbox "Digite o nome do arquivo" 8 60)
            dialog --colors  --title "\Z7 Atalho criado com sucesso" --msgbox "$(ln -s $arquivo)" 8 60;;
              
        6) arquivo2=$(dialog --stdout --inputbox "Digite o nome do arquivo" 8 60)
            dialog --colors  --title "\Z7 Saída do comando" --msgbox "$(tail $arquivo2)" 0 0;;
              
        7) arquivo3=$(dialog --stdout --inputbox "Digite o nome do arquivo" 8 60)
            dialog --colors  --title "\Z7 Saída do comando" --msgbox "$(head $arquivo3)" 0 0;;
         
        8) arquivo4=$(dialog --stdout --inputbox "Digite o nome do arquivo" 8 60)
            dialog --colors  --title "\Z7 Saída do comando" --msgbox "$(locate -b $arquivo4)" 0 0;;
              
        9) comando=$(dialog --stdout --inputbox "Digite o nome de um comando" 8 60)
            dialog --colors --title "\Z7 Saída do comando" --msgbox "$(which $comando)" 8 60;;         
            
        10) comando2=$(dialog --stdout --inputbox "Digite o nome de um comando" 8 60)
                  dialog  --title "Função do comando" --msgbox "$(whatis $comando2)" 8 60;;
        
        11) arquivo5=$(dialog --stdout --inputbox "Digite o nome do arquivo" 8 60) 
              dialog --colors --title "\Z7 Alteração feita com sucesso, abra o arquivo" --msgbox "$(chmod u+x $arquivo5)" 8 60 ;;
            
        12) arquivo6=$(dialog --stdout --inputbox "Digite o nome do arquivo" 8 60)
                dialog --colors --title "\Z7 Saída do comando" --msgbox "$(wc $arquivo6)" 8 60;;
             
        13) arquivo8=$(dialog --stdout --inputbox "Digite o nome do arquivo" 8 60)  
            arquivo9=$(dialog --stdout --inputbox "Digite o nome do diretorio" 8 60)
             dialog --msgbox "$(cp $arquivo8 $arquivo9)" | --gauge "Copiando . . . " 0 0;;
             
        14) arquivo10=$(dialog --stdout --inputbox "Digite o nome do arquivo" 8 60)
                dialog --colors --title "\Z7 Saída do comando" --msgbox "$(mv $arquivo10 $arquivo11)" 8 60;;

        15) senha=$(dialog -- colors --stdout --passwordbox "\Z7 Entre como administrador, digite a senha" 0 0)
             dialog --colors --title "\Z7 Confirmação" --msgbox "$(sudo -i $senha)" 8 60;;             
             
        16) ;;
             
        17) ;;
             
        18) dialog --prgbox 'Partições e pontos de montagem' 'lsblk -l' 8 60;;
             
        19) ;;
             
        20) exit ;;
             
        *) dialog --infobox 'Opção Inválida' 5 40;;

    esac

 done
