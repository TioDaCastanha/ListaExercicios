package ListasExercicios.Lista4;

import java.util.Random;

public class Ex93 {
    public static void main(String[] args){
        Random rdm = new Random();
        comparador(rdm.nextInt(21), rdm.nextInt(101), rdm.nextInt(11));
    }

    public static void comparador(int inicio, int fim, int incremento) {

        for(int i = inicio; i < fim; i += incremento) {
            System.out.print(i + " >> ");
        }
        System.out.print(" Fim");

    }
}
