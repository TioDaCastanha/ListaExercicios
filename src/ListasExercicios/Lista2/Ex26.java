package ListasExercicios.Lista2;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int num1, num2;

        System.out.print("Digite um numero: ");
        num1 = in.nextInt();
        System.out.print("Digite outro numero: ");
        num2 = in.nextInt();

        if (num1 > num2){
            System.out.printf("O %d é maior!", num1);
        }else if (num1 < num2){
            System.out.printf("O %d é maior!", num2);
        }else {
            System.out.print("Os dois são iguais!!");
        }

    }
}
