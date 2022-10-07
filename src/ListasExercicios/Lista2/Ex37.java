package ListasExercicios.Lista2;

import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        float salario, salarioFinal;
        int anos;
        String genero;

        System.out.print("Informe o Gênero do Funcionário: ");
        genero = in.nextLine();
        System.out.print("Informe o Salário do Funcionário: ");
        salario = in.nextFloat();
        System.out.print("Informe quantos anos de empresa tem o Funcionário: ");
        anos = in.nextInt();

        switch (genero.toLowerCase()){
            case "m" -> {
                if (anos < 20){
                    salarioFinal = salario * (float) 1.03;
                }else if (anos <= 30){
                    salarioFinal = salario * (float) 1.13;
                }else {
                    salarioFinal = salario * (float) 1.25;
                }
                System.out.print("O novo salário do Funcionário será: R$"+ salarioFinal);
            }
            case "f" -> {
                if (anos < 15){
                    salarioFinal = salario * (float) 1.05;
                }else if (anos <= 20){
                    salarioFinal = salario * (float) 1.12;
                }else {
                    salarioFinal = salario * (float) 1.23;
                }
                System.out.print("O novo salário do Funcionário será: R$"+ salarioFinal);
            }
        }

    }
}
