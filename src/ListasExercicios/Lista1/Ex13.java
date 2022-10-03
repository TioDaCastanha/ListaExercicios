package ListasExercicios.Lista1;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        float salario, novoSalario;

        System.out.print("Informe seu salário atual: ");
        salario = in.nextFloat();

        novoSalario = salario + (float)(salario*0.15);

        System.out.println("Seu Salário atual: R$"+ salario);
        System.out.println("Seu Salário com aumento de 15%: R$"+ novoSalario);

    }
}
