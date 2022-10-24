package ListasExercicios.Lista3Parte2;

import java.util.Random;

public class Ex76 {
    public static void main(String[] args){

        int[] vetor = new int[10];
        Random rnd = new Random();

        for(int i = 0; i < 10; i++) {
            vetor[i] = rnd.nextInt(101);
        }

        for(int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }

    }
}
