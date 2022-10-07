package ListasExercicios.Lista2;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int horas, pontos;
        float valor;

        System.out.print("Informe quantas Horas de Atividade você fez: ");
        horas = in.nextInt();

        if (horas < 10){
            pontos = 2*horas;
        }else if (horas <= 20){
            pontos = 5*horas;
        }else {
            pontos = 10*horas;
        }

        valor = pontos*(float)0.05;

        System.out.printf("Você acumulou %d Pontos e recebeu R$%.2f", pontos, valor);

    }
}
