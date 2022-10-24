package ListasExercicios.Lista3Parte2;

import javax.swing.*;
import java.util.Random;

public class Ex80 {
    public static void main(String[] args){

        int[] vetor = new int[30];
        int[] chave = new int[30];
        int num, chaveUser, qtd = 0;
        Random rnd = new Random();

        //Preenche as posições sem o zero (1 a 15)
        for(int i = 0; i < 30; i++) {
            do {
                num = rnd.nextInt(16);
            }while(num == 0);

            vetor[i] = num;
        }

        chaveUser = Integer.parseInt(JOptionPane.showInputDialog("Informe a Chave de 1 a 15:"));

        //Armazena posições em que a chave foi encontrada e conta quantidade de vezes que foi sorteada
        for(int i = 0; i < 30; i++) {
            if(vetor[i] == chaveUser) {
                chave[i] = i;
                qtd++;
            }
        }

        for(int i = 0; i < chave.length; i++) {
            if (chave[i] != 0) {
                System.out.print(chave[i] + " ");
            }
        }

        System.out.println("\nA chave foi sorteada: "+ qtd +" Vezes." );

    }
}
