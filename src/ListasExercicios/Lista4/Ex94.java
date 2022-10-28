package ListasExercicios.Lista4;

import java.util.Random;

public class Ex94 {
    public static void main(String[] args){

        Random rdm = new Random();

        fibonacci(rdm.nextInt(20));
    }

    public static void fibonacci(int num){
        int[] vetor = new int[num];

        for(int i = 0; i < vetor.length; i++){
            if(i == 0 || i == 1){
                vetor[i] = 1;
            }else {
                vetor[i] = vetor[i - 1] + vetor[i - 2];
            }
        }

        for(int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

    }
}
