Algoritmo "Lista01_ex08"

Var

   m, km, hm, dam, dm, cm, mm:real

Inicio

      Escreva("Digite a dist�ncia em Metros:")
      Leia(m)
      
      km <- m/1000
      hm <- m/100
      dam <- m/10
      dm <- m*10
      cm <- m*100
      mm <- m*1000
      
      Escreval("A dist�ncia de", m, " Corresponde a:")
      Escreval(km,"Km          ",dm,"dm")
      Escreval(hm,"Hm          ",cm,"cm")
      Escreval(dam,"Dam          ",mm,"mm")

Fimalgoritmo