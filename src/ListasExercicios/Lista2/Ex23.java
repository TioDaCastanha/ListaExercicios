package ListasExercicios.Lista2;

import java.util.Locale;
import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        String nome, sexo;
        float valor, desconto;

        System.out.print("Informe o nome do Cliente: ");
        nome = in.nextLine();

        System.out.print("Informe o Sexo do Cliente: ");
        sexo = in.nextLine().toLowerCase(Locale.ROOT);

        System.out.print("Informe o valor da compra: ");
        valor = in.nextFloat();

        if (sexo.contains("masculino")) {
            desconto = valor - valor*(float)0.05;
            System.out.print("Valor com desconto: R$"+ desconto);

        }else {
            desconto = valor - valor*(float)0.13;
            System.out.print("Valor com desconto: R$"+ desconto);

        }
    }
}
