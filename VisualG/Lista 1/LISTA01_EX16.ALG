Algoritmo "Lista01_ex16"

Var
// Se??o de Declara??es das vari?veis 
   cigarros, anos: inteiro
   tempoRestante :real

Inicio
// Se??o de Comandos, procedimento, fun??es, operadores, etc...

   escreva("Informe quantos Cigarros por dia voc? consome:")
   leia(cigarros)
   escreva("A quantos anos voc? fuma? ")
   leia(anos)
   
   tempoRestante <- (((anos*365)*cigarros)*10)/1440
   
   escreva("Voc? perdeu aproximadamente, ",tempoRestante:2:2," Dias de vida!!")


Fimalgoritmo