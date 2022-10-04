package ListasExercicios.Lista2;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int velocidade;
        float multa;

        System.out.print("Informe a Velocidade do Veículo em Km/h: ");
        velocidade = in.nextInt();

        if (velocidade > 80){
            multa = velocidade * 5;
            System.out.printf("Excesso de Velocidade, Aplicar multa de: R$%.2f", multa);
        }

    }
}
