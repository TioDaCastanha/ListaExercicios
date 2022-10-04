package ListasExercicios.Lista2;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int ano;

        System.out.print("Informe o Ano desejado: ");
        ano = in.nextInt();

        if (ano % 400 == 0){
            System.out.printf("O ano de %d é Bissexto", ano);
        } else if (ano % 4 == 0){
            if (ano % 100 == 0){
                System.out.printf("O ano de %d não é Bisexto", ano);
            }else {
                System.out.printf("O ano de %d é Bissexto", ano);
            }
        }else {
            System.out.printf("O ano de %d não é Bissexto", ano);
        }

    }
}
