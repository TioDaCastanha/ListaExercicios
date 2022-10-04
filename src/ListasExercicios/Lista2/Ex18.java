package ListasExercicios.Lista2;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int ano, idade;

        System.out.print("Informe o Ano de Nascimento do Eleitor:");
        ano = in.nextInt();

        idade = 2022 - ano;

        if (idade >= 15 && idade < 18){
            System.out.print("Voto Facultativo");
        }else if (idade >= 18 && idade < 60){
            System.out.print("Voto Obrigatório");
        }else if (idade >= 60) {
            System.out.print("Voto Facultativo Acima dos 60");
        }else {
        System.out.print("Sem idade para Voto!");
        }

    }
}
