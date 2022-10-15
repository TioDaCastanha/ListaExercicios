package ListasExercicios.Lista3;

import javax.swing.*;

public class Ex54 {
    public static void main(String[] args){

        float peso, altura, mediaAltura = 0;
        int i = 0, mais90 = 0, menos50 = 0, mais100 = 0;

        while (i < 7){

            peso = Float.parseFloat(JOptionPane.showInputDialog("Informe o peso:").replace(',','.'));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura:").replace(',','.'));

            if (peso >= 90){
                mais90++;

                if(altura >= (float)1.90 && peso >= 100){
                    mais100++;
                }

            } else {

                if (peso <= 50 && altura <= (float)1.6){
                    menos50++;
                }
            }

            mediaAltura += altura;
            i++;
        }

       mediaAltura /= i;

        System.out.println("A Média de Altura do Grupo é: "+ mediaAltura);
        System.out.println("Quantidade de pessoas acima de 90Kg: "+ mais90);
        System.out.println("Quantidade de pessoas acima de 100Kg e maiores de 1.90m: "+ mais100);
        System.out.println("Quantidade de pessoas abaixo de 50Kg e menores que 1.60: "+ menos50);

    }
}
