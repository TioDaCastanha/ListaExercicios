package ListasExercicios.Lista2;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        float a, b, c;

        System.out.print("Informe o tamanho da Reta A: ");
        a = in.nextFloat();
        System.out.print("Informe o tamanho da Reta B: ");
        b = in.nextFloat();
        System.out.print("Informe o tamanho da Reta C: ");
        c = in.nextFloat();

        if (a < b+c){
            if (b < a+c){
                if (c < b+a){
                    System.out.print("É possivel fazer um Triângulo com as medidas informadas!");
                } else {
                    System.out.print("Não é possivel fazer um Triângulo com as medidas informadas");
                }
            }else {
                System.out.print("Não é possivel fazer um Triângulo com as medidas informadas");
            }
        }else{
            System.out.print("Não é possivel fazer um Triângulo com as medidas informadas");
        }

    }
}
