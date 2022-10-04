package ListasExercicios.Lista2;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int idade, ano, tempo;

        System.out.print("Informe o Ano de Nascimento: ");
        ano = in.nextInt();

        idade = 2022 - ano;

        if (idade < 18){

            tempo = (18 - idade) + 2022;

            System.out.printf("Faltam %d anos para se alistar. Retorne em %d", 18 - idade, tempo);

        }else if (idade == 18){
            System.out.print("Você deve se alistar!!");
        }else {

            tempo = 2022 - (idade - 18);

            System.out.printf("Já se passaram %d anos que deveria se alistar. Você deveria ter se alistado em %d", idade - 18, tempo);
        }


    }
}
