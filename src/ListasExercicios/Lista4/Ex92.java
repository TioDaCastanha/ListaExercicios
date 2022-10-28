package ListasExercicios.Lista4;

import java.util.Random;

public class Ex92 {
    public static void main(String[] args){
        Random rdm = new Random();
        parOuImpar(rdm.nextInt(101));
    }

    public static void parOuImpar(int num1) {
        if(num1 % 2 == 0) {
            System.out.println("O Numero "+ num1 +" é PAR.");
        }else {
            System.out.println("O Numero "+ num1+ " é IMPAR.");
        }

    }
}
