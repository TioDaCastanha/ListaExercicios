Algoritmo "Recursividade"

Var

   funcao fatorial (num: inteiro): inteiro
          inicio
                se num <= 2 então
                retorne num
                senao
                retorne num * fatorial (num - 1)
                fimse
   fimfuncao

   numero: inteiro

Inicio

      escreval("Digite um numero para descobriro FATORIAL")
      leia(numero)
      escreval(fatorial(numero))


Fimalgoritmo