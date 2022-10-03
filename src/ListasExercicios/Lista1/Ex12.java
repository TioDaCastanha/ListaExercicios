package ListasExercicios.Lista1;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        float preco, promo;

        System.out.print("Informe o valor do Produto: ");
        preco = in.nextFloat();

        promo = preco - (float)(preco*0.05);

        System.out.printf("Valor do Produto: %.2f \nValor do Produto com Desconto: %.2f", preco, promo);


    }
}
