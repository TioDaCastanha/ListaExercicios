package ListasExercicios.Lista3Parte2;

import javax.swing.*;

public class Ex62 {
    public static void main(String[] args){

        float mediaIdade;
        int idade, cont = 0, maior21 = 0, somaIdade = 0;
        boolean continuar;

        do{
            idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a Idade:"));

            if(idade >= 21) {
                maior21++;
            }

            somaIdade += idade;
            cont++;

            //Opção para continuar
            continuar = JOptionPane.showInputDialog("Deseja continuar Sim/Não?").equalsIgnoreCase("Sim");

        }while(continuar);

        mediaIdade = (float)somaIdade/cont;

        System.out.println("Foram Cadastrados "+ cont+ " idades.");
        System.out.println("Pessoas com 21 ou mais: "+ maior21);
        System.out.println("A Média de Idade é: "+ mediaIdade);

    }
}
