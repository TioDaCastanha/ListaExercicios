package ListasExercicios.Lista3Parte2;

import java.util.Random;

public class Ex78 {
    public static void main(String[] args){

        int[] vetor = new int[15];
        int[] mult10 = new int[15];
        Random rnd = new Random();

        for(int i = 0; i < 15; i++) {
            vetor[i] = rnd.nextInt(101);
            if (vetor[i] % 10 == 0){
                mult10[i] = i;
            }
        }

        for(int i = 0; i < 15; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < mult10.length; i++) {
            if (mult10[i] != 0) {
                System.out.print(mult10[i] + " ");
            }
        }

    }
}
