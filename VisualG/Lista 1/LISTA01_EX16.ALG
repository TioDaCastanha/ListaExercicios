Algoritmo "Lista01_ex16"

Var
// Seção de Declarações das variáveis 
   cigarros, anos: inteiro
   tempoRestante :real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...

   escreva("Informe quantos Cigarros por dia você consome:")
   leia(cigarros)
   escreva("A quantos anos você fuma? ")
   leia(anos)
   
   tempoRestante <- (((anos*365)*cigarros)*10)/1440
   
   escreva("Você perdeu aproximadamente, ",tempoRestante:2:2," Dias de vida!!")


Fimalgoritmo