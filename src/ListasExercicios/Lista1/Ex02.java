package ListasExercicios.Lista1;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        String nome;

        System.out.println("Olá como você se chama?");
        nome = in.nextLine();

        System.out.printf("Bem vindo %s!! É um prazer te conhecer.", nome);
    }
}
