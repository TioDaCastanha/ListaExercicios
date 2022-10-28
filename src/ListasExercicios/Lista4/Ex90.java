package ListasExercicios.Lista4;

import java.util.Random;

public class Ex90 {
    public static void main(String[] args){

        Random rdm = new Random();
        somador(rdm.nextInt(101), rdm.nextInt(101));
    }

    public static void somador(int num1, int num2) {
        System.out.println("A Soma é: "+ (num1+num2));

    }
}
