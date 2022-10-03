Algoritmo "Lista01_ex10"

Var
   largura, altura, area, tinta: real


Inicio

      escreva("Informe o largura da parede a ser pintada: ")
      leia(largura)
      escreva("Informe a altura da parede a ser pintada: ")
      leia(altura)
      
      area <- largura*altura
      
      tinta <- area/2
      
      escreva("Para", area:2:2," m² de parede você gastará", tinta:2:2," L de tinta.")


Fimalgoritmo