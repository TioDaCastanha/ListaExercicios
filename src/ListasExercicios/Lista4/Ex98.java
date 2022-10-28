package ListasExercicios.Lista4;

import java.util.Random;

public class Ex98 {
    public static void main(String[] args){
        Random rdm = new Random();
        System.out.println("A Soma é "+ supersomador(rdm.nextInt(5), rdm.nextInt(20)));
    }

    public static int supersomador(int inicio, int fim) {
        int soma = 0;

        for(int i = inicio; i < fim; i++) {
            soma += i;
        }

        return soma;

    }
}
