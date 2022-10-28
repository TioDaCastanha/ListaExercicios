package ListasExercicios.Lista4;

import java.util.Random;

public class Ex96 {
    public static void main(String[] args){

        Random rdm = new Random();

        System.out.println("A Média é: "+ media(rdm.nextInt(101), rdm.nextInt(101)));
    }

    public static int media(int num1, int num2) {
        return (num1+num2)/2;
    }
}
