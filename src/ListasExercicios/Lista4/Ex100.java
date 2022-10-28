package ListasExercicios.Lista4;

import java.util.Random;

public class Ex100 {
    public static void main(String[] args){

        Random rdm = new Random();

        System.out.println("Situação do Aluno: "+ Situacao(media(rdm.nextInt(101), rdm.nextInt(101))));
    }

    public static int media(int num1, int num2) {
        return (num1+num2)/2;
    }

    public static String Situacao(int media) {
        if (media >= 70){
            return "APROVADO";
        }else if (media >= 50){
            return "RECUPERAÇÃO";
        }else {
            return "REPROVADO";
        }
    }


}
