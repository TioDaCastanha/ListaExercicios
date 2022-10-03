package ListasExercicios.Lista1;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        float largura, altura, area, tinta;

        System.out.print("Informe a Largura da parede a ser pintada: ");
        largura = in.nextFloat();

        System.out.print("Informe a Altura da parede a ser pintada: ");
        altura = in.nextFloat();

        area = altura*largura;
        tinta = area/2;

        System.out.printf("Área a ser Pintada: %.2fm²\nTinta Necessária: %.2f Litros", area, tinta);

    }
}
