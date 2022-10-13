package ListasExercicios.Lista3;

import java.util.Arrays;
import java.util.Random;

public class Ex50 {
    public static void main(String[] args){

        Random random = new Random();

        int[] lista = new int[20];

        int i = 0, numAcima5 = 0, numDiv3 = 0;

        while(i < 20){
            //Sorteia um numero de 0 a 10
            lista[i] = random.nextInt(11);

            //Soma os Maiores que 5
            if (lista[i] > 5){
                numAcima5++;
            }

            //Soma os Divisiveis por 3
            if (lista[i] % 3 == 0){
                numDiv3++;
            }

            i++;
        }

        System.out.println("Os numeros Sorteados Foram: "+ Arrays.toString(lista));
        System.out.println("Quantos Numeros Acima de 5: "+ numAcima5);
        System.out.println("Quantos Numeros Divisíveis por 3: "+ numDiv3);

    }
}
