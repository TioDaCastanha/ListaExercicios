package ListasExercicios.Lista1;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int a, b, c;
        float delta;

        System.out.print("Informe o valor de A: ");
        a = in.nextInt();
        System.out.print("Informe o valor de B: ");
        b = in.nextInt();
        System.out.print("Informe o valor de C: ");
        c = in.nextInt();

        delta = (float)Math.pow(b,2) - 4*a*c;

        System.out.printf("Valor de Delta é %.2f", delta);

    }
}
