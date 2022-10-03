package ListasExercicios.Lista1;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        float km, total;
        int dias;

        System.out.print("Informe o total de dias com o carro: ");
        dias = in.nextInt();

        System.out.print("Informe a quilometragem percorrida: ");
        km = in.nextFloat();

        total = (dias * 90) + (km * (float) 0.20);

        System.out.printf("Valor total do Aluguel do carro é de R$%.2f", total);

    }
}
