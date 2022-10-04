package ListasExercicios.Lista2;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        String nome;
        float nota1, nota2, media;

        System.out.print("Informe nome do Aluno: ");
        nome = in.nextLine();

        System.out.print("Informe a nota 1: ");
        nota1 = in.nextFloat();

        System.out.print("Informe a nota 2: ");
        nota2 = in.nextFloat();

        media = (nota1 + nota2)/2;

        if (media >= 7.0) {
            System.out.printf("Aluno %s Aprovado!! Média %.2f", nome, media);
        }else if (media < 7.0 && media >= 5.0) {
            System.out.printf("Aluno %s em Recuperação!! Média %.2f", nome, media);
        }else {
            System.out.printf("Aluno %s Reprovado!! Média %.2f", nome, media);
        }

    }
}
