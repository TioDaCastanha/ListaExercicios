package ListasExercicios.Lista2;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int num;

        System.out.print("Infore um numero: ");
        num = in.nextInt();

        if (num % 2 == 0){
            System.out.printf("O numero %d é PAR!", num);
        }else {
            System.out.printf("O numero %d é IMPAR!", num);
        }

    }
}
