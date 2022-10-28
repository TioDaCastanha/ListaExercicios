package ListasExercicios.Lista4;

import java.util.Random;

public class Ex91 {
    public static void main(String[] args){
        Random rdm = new Random();
        comparador(rdm.nextInt(101), rdm.nextInt(101));
    }

    public static void comparador(int num1, int num2) {
        if(num1 == num2) {
            System.out.println("Os Numeros são Iguais");
        }else if (num1 > num2){
            System.out.println("O numero 1 "+ num1+ " é maior");
        }else{
            System.out.println("O numero 2 "+ num2+ " é maior");
        }

    }
}
