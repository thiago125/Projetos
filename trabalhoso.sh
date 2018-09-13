#!/bin/bash

Funcao1() {
dialog --msgbox "$(pwd)" 0 0 
}

Funcao2() {
diretorio=$(dialog --stdout --inputbox 'Entre com o diretorio que deseja visualizar:' 0 0)
dialog --msgbox "$(ls $diretorio)" 0 0 
}

Funcao3() {
diretorio1=$(dialog --stdout --inputbox 'Entre com o nome do diretorio que deseja criar:' 0 0)
dialog --msgbox "$(mkdir $diretorio1)" 0 0 
}

Funcao4() {
diretorio2=$(dialog --stdout --inputbox 'Entre com o nome do diretorio que deseja apagar:' 0 0)
dialog --msgbox "$(rmdir $diretorio2)" 0 0 
}

Funcao5() {
caminhoArquivo=$(dialog --stdout --inputbox 'Entre com o caminho para o arquivo:' 0 0)
nomeArquivo=$(dialog --stdout --inputbox 'Entre com o nome do arquivo:' 0 0)
dialog --msgbox "$(ln -s $caminhoArquivo $nomeArquivo)" 0 0 
}

Funcao6() {
linha=$(dialog --stdout --inputbox 'Entre com o numero de linhas' 0 0)
arquivos=$(dialog --stdout --inputbox 'Entre com o numero de arquivos:' 0 0)
dialog --msgbox "$(tail -n $numero $arquivo)" 0 0 
}

Funcao7() {
linhas=$(dialog --stdout --inputbox 'Entre com o numero de linhas:' 0 0)
arquivos=$(dialog --stdout --inputbox 'Entre com o numero de arquivos:' 0 0)
dialog --msgbox "$(head -n $numero1 $arquivos)" 0 0 
}

Funcao8() {
nome=$(dialog --stdout --inputbox 'Entre com o caminho do arquivo que procura:' 0 0)
dialog --msgbox "$(find $nome)" 0 0 
}

while (true) ; do
opcao=$(dialog --help-button --help-label 'Ajuda' --stdout --menu 'Menu' 0 0 0 1 'Mostrar a localização do usuario no sistema de arquivos' 2 'Exibe conteúdo de  um dirétorio' 3 'Criar dirétorio' 4 'Apagar diretório' 5 'Criar atalho para arquivo' 6 'Exibe as ultimas linhas de um arquivo' 7 'Exibe as primeiras linhas de um arquivo' 8 'Buscar arquivo' 9 'Mostrar localização do comando' 10 'Exibe função do comando' 11 'Mudar usúario dono de um arquivo' 12 'Contar número de caracteres, palavras e linhas de um arquivo' 13 'Copiar arquivo para outro diretório' 14 'Mover arquivo para outro diretório' 15 'Montar partição ou dispositivo externo em um diretório do sistema' 16 'desmontar diretório montado anteriormente' 17 'Mudar a data de última alteração de um arquivo' 18 'Exibir a tabela de partições do sistema e seus pontos de montagem' 19 'Testar consistência lógica de uma partição' 20 'Sair')

if [ $? == 2 ]
then
dialog --msgbox 'Trabalho de Leidiani Leal Favaris para a materia de sistemas operacionais' 0 0
fi 

case $opcao in
1)Funcao1;;
2)Funcao2;;
3)Funcao3;;
4)Funcao4;;
5)Funcao5;;
6)Funcao6;;
7)Funcao7;;
8)Funcao8;;
9)Funcao9;;
10)Funcao10;;
11)Funcao11;;
12)Funcao12;;
13)Funcao13;;
14)Funcao14;;
15)Funcao15;;
16)Funcao16;;
17)Funcao17;;
18)Funcao18;;
19)Funcao19;;
20)break;;
esac
done
