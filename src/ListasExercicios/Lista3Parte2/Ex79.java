package ListasExercicios.Lista3Parte2;

import java.util.Random;

public class Ex79 {
    public static void main(String[] args){

        int[] vetor = new int[10];
        int[] pares = new int[10];
        Random rnd = new Random();

        for(int i = 0; i < 10; i++) {
            vetor[i] = rnd.nextInt(101);
            if (vetor[i] % 2 == 0){
                pares[i] = i;
            }
        }

        for(int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < pares.length; i++) {
            if (pares[i] != 0) {
                System.out.print(pares[i] + " ");
            }
        }

    }
}
