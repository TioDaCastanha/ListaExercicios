package ListasExercicios.Lista1;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        float valor, dolar;

        System.out.print("Informe quantos R$ você possui: ");
        valor = Float.parseFloat(in.nextLine().replace(',','.'));

        dolar = valor / (float)3.45;

        System.out.printf("Você consegue comprar U$%.2f Doláres com R$%.2f Reais", dolar, valor);


    }
}
