Algoritmo "Lista01_ex14"

Var
   dias :inteiro
   km, total: real


Inicio

      escreva("Informe por quantos dias o Carro ficou alugado:")
      leia(dias)
      escreva("Informe quantos Km o Carro percorreu:")
      leia(km)
      
      total <- km*0.20 + dias*90
      
      escreva("Valor total a ser Pago: R$",total)


Fimalgoritmo