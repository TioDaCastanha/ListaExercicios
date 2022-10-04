package ListasExercicios.Lista2;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        float distance, value;

        System.out.print("Informe a distância que se deseja percorrer em Km: ");
        distance = in.nextFloat();

        if (distance <= 200){
            value = distance * (float)0.50;
            System.out.print("Valor da Passagem: R$"+ value);
        }else {
            value = distance * (float)0.45;
            System.out.print("Valor da Passagem: R$"+ value);
        }
    }
}
