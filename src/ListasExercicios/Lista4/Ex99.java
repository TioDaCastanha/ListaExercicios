package ListasExercicios.Lista4;

import java.util.Random;

public class Ex99 {
    public static void main(String[] args){
        Random rdm = new Random();
        System.out.println("A Resultado é "+ supersomador(rdm.nextInt(5), rdm.nextInt(10)));
    }

    public static int supersomador(int base, int exp) {
        int resultado = 1;

        for(int i = 0 ; i < exp; i++) {
            resultado *= base ;
        }

        return resultado;
    }
}
