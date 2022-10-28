package ListasExercicios.Lista4;

import java.util.Random;

public class Ex95 {
    public static void main(String[] args){

        Random rdm = new Random();

        System.out.println("A Soma é: "+ somador(rdm.nextInt(101), rdm.nextInt(101)));
    }

    public static int somador(int num1, int num2) {
        return num1+num2;
    }
}
