package ListasExercicios.Lista3;

import java.util.Scanner;

public class Ex51 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        float maior = 0, menor, valor, outroMenor;
        int i = 0;

        System.out.print("Digite o valor do produto: ");
        valor = in.nextFloat();

        menor = valor;

        while(i < 7){
            if (valor > maior){
                maior = valor;
            }

            if (valor < menor){
                menor = valor;
            }

            System.out.print("Digite o valor do produto: ");
            valor = in.nextFloat();

            i++;
        }

        System.out.println("O Maior valor digitado foi de: R$"+ maior);
        System.out.print("O Menor valor digitado foi de: R$"+ menor);

    }
}
